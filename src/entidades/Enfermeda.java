/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Enfermeda {

    private ArrayList<String> PEDRIATRIA;
    private ArrayList<String> GINECO_OBSTETRICIA;
    private ArrayList<String> CIRUGIA;
    private ArrayList<String> PSIQUIATRIA;
    private ArrayList<String> CARDIOLOGIA;
    private ArrayList<String> DERMATOLOGIA;
    private ArrayList<String> ENDOCRINOLOGIA;
    private ArrayList<String> GASTROENTEROLOGIA;
    private ArrayList<String> INFECTOLOGIA;
    private ArrayList<String> NEFROLOGIA;
    private ArrayList<String> OFTALMOLOGIA;
    private ArrayList<String> OTORRINOLARINGOLOGIA;
    private ArrayList<String> NEUMOLOGIA;
    private ArrayList<String> NEUROLOGIA;
    private ArrayList<String> RADIOLOGIA;
    private ArrayList<String> ANEGTESIOLOGIA;

    public void llenar() {
        PEDRIATRIA.add("Chequeo de salud a bebes");
        PEDRIATRIA.add("Examenes fisicos en escolares");
        PEDRIATRIA.add("Fiebre");
        PEDRIATRIA.add("Tos");
        PEDRIATRIA.add("Malestar estomacal");

        GINECO_OBSTETRICIA.add("Embarazo");
        GINECO_OBSTETRICIA.add("Parto");
        GINECO_OBSTETRICIA.add("Pre-aborto");

        CIRUGIA.add("Cirugia de la mano");
        CIRUGIA.add("Cirugia pediatrica");
        CIRUGIA.add("Cirugia oncologica");
        CIRUGIA.add("Cirugia vascular");

    }

}
