/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formulario;

import Conexion.Metodos;
import com.mxrck.autocompleter.TextAutoCompleter;
import datos.DatosDoctor;
import datos.Ordenar;
import entidades.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ReservaCita extends javax.swing.JFrame {

    //private Cola cola;
    private Paciente paciente;
    private Cita cita;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String direccion;
    private String email;
    private String fechaNacimiento;
    private String sexo;
    public static String fecha = "";
    public static String hora = "";
    private String motivo;
    private String sintomas;
    private Doctor doctor;
    public static int pos = -1;
    private Especialista especialista;
    private TextAutoCompleter autoCompleter;
    private Enfermeda enfermedades = new Enfermeda();
    private String name;
    private DatosDoctor data;

    /**
     * Creates new form ReservaCita
     */
    public ReservaCita() {
        initComponents();
        setLocationRelativeTo(null);
        autoCompleter = new TextAutoCompleter(txtMotivo);
        data  =new DatosDoctor();
        llenar();

    }

    public void llenar() {
        for (int i = 0; i < enfermedades.getGeneral().size(); i++) {
            autoCompleter.addItem(enfermedades.getGeneral().get(i));
        }
    }

    public String espe(String enfermedad) {
        int pos = -1;
        if (enfermedades.getANEGTESIOLOGIA().contains(enfermedad)) {
            setEspecialista(especialista.ANEGTESIOLOGIA);
            pos = 1;
        }
        if (enfermedades.getCARDIOLOGIA().contains(enfermedad)) {
            setEspecialista(especialista.CARDIOLOGIA);
            pos = 1;
        }
        if (enfermedades.getCIRUGIA().contains(enfermedad)) {
            setEspecialista(especialista.CIRUGIA);
            pos = 1;
        }
        if (enfermedades.getDERMATOLOGIA().contains(enfermedad)) {
            setEspecialista(especialista.DERMATOLOGIA);
            pos = 1;
        }
        if (enfermedades.getENDOCRINOLOGIA().contains(enfermedad)) {
            setEspecialista(especialista.ENDOCRINOLOGIA);
            pos = 1;
        }
        if (enfermedades.getGASTROENTEROLOGIA().contains(enfermedad)) {
            setEspecialista(especialista.GASTROENTEROLOGIA);
            pos = 1;
        }
        if (enfermedades.getGINECO_OBSTETRICIA().contains(enfermedad)) {
            setEspecialista(especialista.GINECO_OBSTETRICIA);
            pos = 1;
        }
        if (enfermedades.getINFECTOLOGIA().contains(enfermedad)) {
            setEspecialista(especialista.INFECTOLOGIA);
            pos = 1;
        }
        if (enfermedades.getNEFROLOGIA().contains(enfermedad)) {
            setEspecialista(especialista.NEFROLOGIA);
            pos = 1;
        }
        if (enfermedades.getNEUMOLOGIA().contains(enfermedad)) {
            setEspecialista(especialista.NEUMOLOGIA);
            pos = 1;
        }
        if (enfermedades.getOFTALMOLOGIA().contains(enfermedad)) {
            setEspecialista(especialista.OFTALMOLOGIA);
            pos = 1;
        }
        if (enfermedades.getOTORRINOLARINGOLOGIA().contains(enfermedad)) {
            setEspecialista(especialista.OTORRINOLARINGOLOGIA);
            pos = 1;
        }
        if (enfermedades.getPEDRIATRIA().contains(enfermedad)) {
            setEspecialista(especialista.PEDIATRIA);
            pos = 1;
        }
        if (enfermedades.getPSIQUIATRIA().contains(enfermedad)) {
            setEspecialista(especialista.PSIQUIATRIA);
            pos = 1;
        }
        if (enfermedades.getRADIOLOGIA().contains(enfermedad)) {
            setEspecialista(especialista.RADIOLOGIA);
            pos = 1;
        }
        if (enfermedades.getOFTALMOLOGIA().contains(enfermedad)) {
            setEspecialista(especialista.ANEGTESIOLOGIA);
            pos = 1;
        }

        if (pos != -1) {
            name = especialista.name();
        } else {
            name = "No hay especialista";
        }

        return name;
    }
    

    public boolean validar() {
        boolean estado = false;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date fe = txtFechaNacimiento.getDate();
            fechaNacimiento = sdf.format(fe);
            if (txtApellidos.getText().trim().equals("") || txtDia.getText().trim().equals("")
                    || txtDireccion.getText().trim().equals("") || txtDni.getText().trim().equals("")
                    || txtEmail.getText().trim().equals("") || txtHora.getText().trim().equals("")
                    || txtMotivo.getText().trim().equals("") || fechaNacimiento.trim().equals("")
                    || txtNombre.getText().trim().equals("") || txtSintomas.getText().trim().equals("")
                    || txtTel.getText().trim().equals("") || sexo.trim().equals("")) {

            } else {
                estado = true;
            }
        } catch (Exception e) {

        }

        return estado;
    }

    private void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    private Especialista getEspecialista() {
        return this.especialista;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtDni = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtMotivo = new javax.swing.JTextField();
        txtSintomas = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        txtEspecialiesta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel10.setText("Datos del Paciente");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel11.setText("Datos de la cita");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Día");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 153, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nombres");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Apellidos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText(" Dni");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 40, -1));
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 153, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Hora");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("motivo");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Sintomas");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 60, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Teléfono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Dirección");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Fecha Nacimiento");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Sexo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        jButton1.setText("Reservar Cita");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 200, 40));
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 150, -1));
        jPanel1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 150, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 150, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 150, -1));

        txtHora.setEnabled(false);
        jPanel1.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 140, -1));

        txtMotivo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtMotivoMouseMoved(evt);
            }
        });
        txtMotivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMotivoMouseClicked(evt);
            }
        });
        txtMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotivoActionPerformed(evt);
            }
        });
        txtMotivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMotivoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMotivoKeyTyped(evt);
            }
        });
        jPanel1.add(txtMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 140, -1));
        jPanel1.add(txtSintomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 140, -1));

        txtDia.setEnabled(false);
        jPanel1.add(txtDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 140, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cita.png"))); // NOI18N
        jButton2.setText("Seleccionar Horario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        txtFechaNacimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaNacimientoMouseClicked(evt);
            }
        });
        jPanel1.add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 130, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel15.setText("Registrar Datos");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Femenino");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Masculino");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Especialista");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));
        jPanel1.add(txtEspecialiesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new FrmHorario().setVisible(true);
        //dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (validar()) {
            nombre = txtNombre.getText();
            apellido = txtApellidos.getText();
            dni = txtDni.getText();
            telefono = txtTel.getText();
            email = txtEmail.getText();
            direccion = txtDireccion.getText();
            motivo = txtMotivo.getText();
            fecha = txtDia.getText();
            hora = txtHora.getText();
            sintomas = txtSintomas.getText();
            doctor = data.getDoctores(especialista);
            paciente = new Paciente(nombre, apellido, dni, telefono, direccion, email, fechaNacimiento, sexo);
            cita = new Cita(Principal.id,fecha, hora, motivo, sintomas, paciente, doctor);
            Principal.id++;
            Ordenar o = new Ordenar(cita, pos);
            Principal.arbol.insertar(o);
            Principal.arbol.inOrden();
            Principal.lista.agregarCitaFinal(cita);
            Metodos.insertarCita(cita);
            JOptionPane.showMessageDialog(null, "Se registró correctamente la reserva de cita", "Mensaje", 1);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Rellene completamente los campos", "Mensaje", 2);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        txtHora.setText(hora);
        txtDia.setText(fecha);
    }//GEN-LAST:event_formMouseMoved

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        sexo = "Femenino";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        sexo = "Masculino";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txtFechaNacimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaNacimientoMouseClicked

    }//GEN-LAST:event_txtFechaNacimientoMouseClicked

    private void txtMotivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMotivoKeyTyped
        txtMotivo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (txtMotivo.getText().trim().equals("")) {
                    txtEspecialiesta.setText("Na");
                } else {
                    txtEspecialiesta.setText(espe(txtMotivo.getText().trim()));
                }
            }
        });
    }//GEN-LAST:event_txtMotivoKeyTyped

    private void txtMotivoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMotivoMouseMoved

    }//GEN-LAST:event_txtMotivoMouseMoved

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered

    }//GEN-LAST:event_jPanel1MouseEntered

    private void txtMotivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMotivoKeyPressed

    }//GEN-LAST:event_txtMotivoKeyPressed

    private void txtMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotivoActionPerformed
        
    }//GEN-LAST:event_txtMotivoActionPerformed

    private void txtMotivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMotivoMouseClicked

    }//GEN-LAST:event_txtMotivoMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        txtHora.setText(hora);
        txtDia.setText(fecha);
    }//GEN-LAST:event_formWindowActivated

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

    }//GEN-LAST:event_formMouseDragged

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
       if (txtMotivo.getText().trim().equals("")) {
            txtEspecialiesta.setText("Na");
        } else {
            txtEspecialiesta.setText(espe(txtMotivo.getText().trim()));
        }
    }//GEN-LAST:event_jPanel1MouseMoved

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEspecialiesta;
    private com.toedter.calendar.JDateChooser txtFechaNacimiento;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSintomas;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
