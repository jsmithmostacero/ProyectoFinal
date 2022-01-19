/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formulario;

import colas.Cola;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class FrmHorario extends javax.swing.JFrame {

    ArrayList<Integer> reservas;
    ArrayList<JButton> botones = new ArrayList<>();
    private Cola cola  =Principal.cola;
    int cont = 0;

    /**
     * Creates new form FrmHorario
     */
    public FrmHorario() {
        initComponents();
        setLocationRelativeTo(null);
        reservas = new ArrayList<>();
        pintarFrmHorario();
        verificarReservas();
        v();
        if (cont == 18) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, los horarios estan reservados");
        }
        
    }


    public FrmHorario(Cola cola) {
        initComponents();
        setLocationRelativeTo(null);
        reservas = new ArrayList<>();
        this.cola = cola;
        pintarFrmHorario();
        verificarReservas();
        v();
        if (cont == 18) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, los horarios estan reservados");
        }
        
    }

    //Hacer un metodo que pinte de verde a los jButton que esten dentro del rango de horas
    //y pinte de rojo a los que no esten dentro del rango de horas
    public void pintarFrmHorario() {
            botones.add(jButton1);
            botones.add(jButton2);
            botones.add(jButton3);
            botones.add(jButton4);
            botones.add(jButton5);
            botones.add(jButton6);
            botones.add(jButton7);
            botones.add(jButton8);
            botones.add(jButton9);
            botones.add(jButton10);
            botones.add(jButton11);
            botones.add(jButton12);
            botones.add(jButton13);
            botones.add(jButton14);
            botones.add(jButton15);
            botones.add(jButton16);
            botones.add(jButton17);
            botones.add(jButton18);

            for (int i = 0; i < 18; i++) {
                reservas.add(0);
            }
    }

    public void reservar(JLabel dia, int pos, JButton b) {
        if (reservas.get(pos) == 1) {
            JOptionPane.showMessageDialog(null, "Este lugar está reservado", "Reserva", 2);
        } else {
            //mensaje de confirmacion concatenado con el texto del boton
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea reservar este lugar?", "Reserva", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                reservas.set(pos, 1);
                b.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Reserva realizada\nDia : " + dia.getText() + "\nHora : " + b.getText(), "Reserva", 1);
                pintarFrmHorario();
                ReservaCita.fecha = dia.getText();
                ReservaCita.hora = b.getText();
                dispose();
                //new ReservaCita(lista, cola).setVisible(true);
                
            }
        }
    }
    
    

    public void verificarReservas() {
        for (int i = 0; i < cola.tamaño(); i++) {
            if (cola.buscar(i).getFecha().equals("Lunes")) { 
                for (int j = 0; j < 3; j++) {
                    if (cola.buscar(i).getHora().equals(botones.get(j).getText())) {
                       //botones.get(j).setEnabled(false); 
                       reservas.set(j, 1);
                    } else {
                       //botones.get(j).setBackground(Color.GREEN); 
                        cont++;
                    }
                }
            }

            if (cola.buscar(i).getFecha().equals("Martes")) {
                for (int j = 3; j < 6; j++) {
                    if (cola.buscar(i).getHora().equals(botones.get(j).getText())) {
                       //botones.get(j).setEnabled(false); 
                       reservas.set(j, 1);
                    } else {
                       //botones.get(j).setBackground(Color.GREEN); 
                        cont++;
                    }
                }
            }
            if (cola.buscar(i).getFecha().equals("Miercoles")) {
                for (int j = 6; j < 9; j++) {
                    if (cola.buscar(i).getHora().equals(botones.get(j).getText())) {
                       //botones.get(j).setEnabled(false); 
                       reservas.set(j, 1);
                    } else {
                       //botones.get(j).setBackground(Color.GREEN); 
                        cont++;
                    }
                }
            }
            if (cola.buscar(i).getFecha().equals("Jueves")) {
                for (int j = 9; j < 12; j++) {
                    if (cola.buscar(i).getHora().equals(botones.get(j).getText())) {
                       //botones.get(j).setEnabled(false); 
                       reservas.set(j, 1);
                    } else {
                       //botones.get(j).setBackground(Color.GREEN); 
                        cont++;
                    }
                }
            }
            if (cola.buscar(i).getFecha().equals("Viernes")) {
                for (int j = 12; j < 15; j++) {
                    if (cola.buscar(i).getHora().equals(botones.get(j).getText())) {
                       //botones.get(j).setEnabled(false); 
                       reservas.set(j, 1);
                    } else {
                       //botones.get(j).setBackground(Color.GREEN); 
                        cont++;
                    }
                }
            }
            if (cola.buscar(i).getFecha().equals("Sábado")) {
                for (int j = 15; j < 18; j++) {
                    if (cola.buscar(i).getHora().equals(botones.get(j).getText())) {
                       //botones.get(j).setEnabled(false); 
                       reservas.set(j, 1);
                    } else {
                       //botones.get(j).setBackground(Color.GREEN); 
                        cont++;
                    }
                }
            }

        }
    }
    
    public void v(){
        for (int i = 0; i < 18; i++) {
            if(reservas.get(i)==1){
                botones.get(i).setEnabled(false);
            }else{
                botones.get(i).setBackground(Color.GREEN);
            }
        }
    }
    
    
    
    public void setBotones(ArrayList<JButton> buttons) {
        this.jButton1 = buttons.get(0);
        this.jButton2 = buttons.get(1);
        this.jButton3 = buttons.get(2);
        this.jButton4 = buttons.get(3);
        this.jButton5 = buttons.get(4);
        this.jButton6 = buttons.get(5);
        this.jButton7 = buttons.get(6);
        this.jButton8 = buttons.get(7);
        this.jButton9 = buttons.get(8);
        this.jButton10 = buttons.get(9);
        this.jButton11 = buttons.get(10);
        this.jButton12 = buttons.get(11);
        this.jButton13 = buttons.get(12);
        this.jButton14 = buttons.get(13);
        this.jButton15 = buttons.get(14);
        this.jButton16 = buttons.get(15);
        this.jButton17 = buttons.get(16);
        this.jButton18 = buttons.get(17);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("HORARIOS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Lunes");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Martes");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Miércoles");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Jueves");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Viernes");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Sábado");

        jButton1.setText("8:00 a.m-8:30 a.m");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("8:30 a.m-9:00 a.m");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("9:00 a.m-9:30 a.m");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("8:00 a.m-8:30 a.m");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("8:30 a.m-9:00 a.m");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("9:00 a.m-9:30 a.m");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("8:00 a.m-8:30 a.m");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8:30 a.m-9:00 a.m");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9:00 a.m-9:30 a.m");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("8:00 a.m-8:30 a.m");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("8:30 a.m-9:00 a.m");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("9:00 a.m-9:30 a.m");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("8:00 a.m-8:30 a.m");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("8:30 a.m-9:00 a.m");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("9:00 a.m-9:30 a.m");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("8:00 a.m-8:30 a.m");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("8:30 a.m-9:00 a.m");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("9:00 a.m-9:30 a.m");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(51, 255, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel9.setText("LIBRE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel7)
                                                                .addComponent(jLabel6)))
                                                .addGap(50, 50, 50)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addContainerGap(492, Short.MAX_VALUE)
                                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(150, 150, 150)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel1)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGap(6, 6, 6)
                                                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton4)
                                                .addComponent(jButton5)
                                                .addComponent(jButton6)))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jButton7)
                                        .addComponent(jButton8)
                                        .addComponent(jButton9))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton10)
                                                .addComponent(jButton11)
                                                .addComponent(jButton12)))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jButton13)
                                        .addComponent(jButton14)
                                        .addComponent(jButton15))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jButton16)
                                        .addComponent(jButton17)
                                        .addComponent(jButton18))
                                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        reservar(jLabel2, 0, jButton1);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        reservar(jLabel2, 1, jButton2);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        reservar(jLabel2, 2, jButton3);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        reservar(jLabel3, 3, jButton4);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        reservar(jLabel3, 4, jButton5);
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        reservar(jLabel3, 5, jButton6);
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        reservar(jLabel4, 6, jButton7);
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        reservar(jLabel4, 7, jButton8);
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        reservar(jLabel4, 8, jButton9);
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        reservar(jLabel5, 9, jButton10);
    }

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
        reservar(jLabel5, 10, jButton11);
    }

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
        reservar(jLabel5, 11, jButton12);
    }

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
        reservar(jLabel6, 12, jButton13);
    }

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
        reservar(jLabel6, 13, jButton14);
    }

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
        reservar(jLabel6, 14, jButton15);
    }

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
        reservar(jLabel7, 15, jButton16);
    }

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
        reservar(jLabel7, 16, jButton17);
    }

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
        reservar(jLabel7, 17, jButton18);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHorario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration                   
}
