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

    private ArrayList<String> general = new ArrayList<>();
    private ArrayList<String> PEDRIATRIA = new ArrayList<>();
    private ArrayList<String> GINECO_OBSTETRICIA = new ArrayList<>();
    private ArrayList<String> CIRUGIA = new ArrayList<>();
    private ArrayList<String> PSIQUIATRIA = new ArrayList<>();
    private ArrayList<String> CARDIOLOGIA = new ArrayList<>();
    private ArrayList<String> DERMATOLOGIA = new ArrayList<>();
    private ArrayList<String> ENDOCRINOLOGIA = new ArrayList<>();
    private ArrayList<String> GASTROENTEROLOGIA = new ArrayList<>();
    private ArrayList<String> INFECTOLOGIA = new ArrayList<>();
    private ArrayList<String> NEFROLOGIA = new ArrayList<>();
    private ArrayList<String> OFTALMOLOGIA = new ArrayList<>();
    private ArrayList<String> OTORRINOLARINGOLOGIA = new ArrayList<>();
    private ArrayList<String> NEUMOLOGIA = new ArrayList<>();
    private ArrayList<String> NEUROLOGIA = new ArrayList<>();
    private ArrayList<String> RADIOLOGIA = new ArrayList<>();
    private ArrayList<String> ANEGTESIOLOGIA = new ArrayList<>();

    public Enfermeda() {
        llenar();
    }

    
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

        PSIQUIATRIA.add("Salus Mental");
        PSIQUIATRIA.add("Problemas Emocionales");
        PSIQUIATRIA.add("Problemas De Comportamiento");
        
        CARDIOLOGIA.add("Tratamiendo del corazon");
        CARDIOLOGIA.add("Tratamiendo de los vasos sanguineos");
        CARDIOLOGIA.add("Enfermdad cardiovascular");
        CARDIOLOGIA.add("Posr operativo");
        
        DERMATOLOGIA.add("Los desordenes de la piel en  cabello");
        DERMATOLOGIA.add("Tratamientos a uñas");
        DERMATOLOGIA.add("Tratamientos a membranas mucosas adyacentes");
        DERMATOLOGIA.add("Tratamientos a cáncer de piel");
        DERMATOLOGIA.add("Tratamientos a tumores");
        DERMATOLOGIA.add("Tratamientos a enfermedades inflamatorias de la piel");
        DERMATOLOGIA.add("Tratamientos a enfermedades infecciosas");
        
        ENDOCRINOLOGIA.add("Trata el sistema endocrino");
        ENDOCRINOLOGIA.add("Trata las glándulas");
        ENDOCRINOLOGIA.add("Trata diabetes");
        ENDOCRINOLOGIA.add("Trata tiroides");
        
        GASTROENTEROLOGIA.add("Problemas de sistema digestivo");
        GASTROENTEROLOGIA.add("Problemas de la vesicula biliar");
        GASTROENTEROLOGIA.add("Problemas de estomago");
        GASTROENTEROLOGIA.add("Problemas de los intestinos");
       
        INFECTOLOGIA.add("Trata el sistema respiratorio ");
        INFECTOLOGIA.add("Trata el asma ");
        INFECTOLOGIA.add("Trata alergias de comidas");
        INFECTOLOGIA.add("Trata drogas ");
        INFECTOLOGIA.add("Trata deficiencias inmunes ");   
        INFECTOLOGIA.add("Trata enfermedades del pulmon "); 
        INFECTOLOGIA.add("Trata infecciones la gripe porcina ");
        INFECTOLOGIA.add("Trata sida/VIH ");
        
        NEFROLOGIA.add("Tratan los riñones");
        NEFROLOGIA.add("Tratan fallo renal");
        
        OFTALMOLOGIA.add("Tratan las cataratas");
        OFTALMOLOGIA.add("Tratan las glaucoma");
        OFTALMOLOGIA.add("Cirugía de ojo");
        
        OTORRINOLARINGOLOGIA.add("Problemas de oido");
        OTORRINOLARINGOLOGIA.add("Problemas de Nariz");
        OTORRINOLARINGOLOGIA.add("Problemas de garganta");
        OTORRINOLARINGOLOGIA.add("Problemas incluyendo sinusitis");
        OTORRINOLARINGOLOGIA.add("Alergias");
        OTORRINOLARINGOLOGIA.add("Problemas de cuello");
         
        NEUMOLOGIA.add("Sistema cardiaco pulmonar");
        NEUMOLOGIA.add("Desordenes de respiracion");
        NEUMOLOGIA.add("Alergias severas");
        NEUMOLOGIA.add("Problemas de pulmones");
        NEUMOLOGIA.add("Enfermedad respiratoria");
        
        NEUROLOGIA.add("Trata el cerebro");
        NEUROLOGIA.add("Trata la espina vertebral");
        NEUROLOGIA.add("Trata los nervios");
        NEUROLOGIA.add("Trata el cerebro");
        NEUROLOGIA.add("Trata enfermedad de Parkinsons");
        NEUROLOGIA.add("Trata esclerosis múltiple");
        NEUROLOGIA.add("Neuropatía");
        NEUROLOGIA.add("Problemas de cerebro");
        
        RADIOLOGIA.add("Pruebas de rayos X");
        RADIOLOGIA.add("Tomografia computarizadas");
        RADIOLOGIA.add("Resonancias Magneticas");
        
        ANEGTESIOLOGIA.add("Inducir anestesia");        
        ANEGTESIOLOGIA.add("Monitoreo de señales vitales");
        ANEGTESIOLOGIA.add("Arresto cardíaco");
        ANEGTESIOLOGIA.add("Problemas súbitos de respiración");

        for (int i = 0; i < PEDRIATRIA.size(); i++) {
            general.add(PEDRIATRIA.get(i));
        }
        for (int i = 0; i < GINECO_OBSTETRICIA.size(); i++) {
            general.add(GINECO_OBSTETRICIA.get(i));
        }
        for (int i = 0; i < CIRUGIA.size(); i++) {
            general.add(CIRUGIA.get(i));
        }
        for (int i = 0; i < PSIQUIATRIA.size(); i++) {
            general.add(PSIQUIATRIA.get(i));
        }
        for (int i = 0; i < CARDIOLOGIA.size(); i++) {
            general.add(CARDIOLOGIA.get(i));
        }
        
        for (int i = 0; i < DERMATOLOGIA.size(); i++) {
            general.add(DERMATOLOGIA.get(i));
        }
        for (int i = 0; i < ENDOCRINOLOGIA.size(); i++) {
            general.add(ENDOCRINOLOGIA.get(i));
        }
        for (int i = 0; i < GASTROENTEROLOGIA.size(); i++) {
            general.add(GASTROENTEROLOGIA.get(i));
        }
        for (int i = 0; i < INFECTOLOGIA.size(); i++) {
            general.add(INFECTOLOGIA.get(i));
        }
        for (int i = 0; i < NEFROLOGIA.size(); i++) {
            general.add(NEFROLOGIA.get(i));
        }
        for (int i = 0; i < OFTALMOLOGIA.size(); i++) {
            general.add(OFTALMOLOGIA.get(i));
        }
        for (int i = 0; i < OTORRINOLARINGOLOGIA.size(); i++) {
            general.add(OTORRINOLARINGOLOGIA.get(i));
        }
        for (int i = 0; i < NEUMOLOGIA.size(); i++) {
            general.add(NEUMOLOGIA.get(i));
        }
        for (int i = 0; i < NEUROLOGIA.size(); i++) {
            general.add(NEUROLOGIA.get(i));
        }
        for (int i = 0; i < RADIOLOGIA.size(); i++) {
            general.add(RADIOLOGIA.get(i));
        }
        for (int i = 0; i < ANEGTESIOLOGIA.size(); i++) {
            general.add(ANEGTESIOLOGIA.get(i));
        }

    }

    public ArrayList<String> getGeneral() {
        return general;
    }


    public ArrayList<String> getPEDRIATRIA() {
        return PEDRIATRIA;
    }


    public ArrayList<String> getGINECO_OBSTETRICIA() {
        return GINECO_OBSTETRICIA;
    }


    public ArrayList<String> getCIRUGIA() {
        return CIRUGIA;
    }


    public ArrayList<String> getPSIQUIATRIA() {
        return PSIQUIATRIA;
    }


    public ArrayList<String> getCARDIOLOGIA() {
        return CARDIOLOGIA;
    }

    public ArrayList<String> getDERMATOLOGIA() {
        return DERMATOLOGIA;
    }

    public ArrayList<String> getENDOCRINOLOGIA() {
        return ENDOCRINOLOGIA;
    }


    public ArrayList<String> getGASTROENTEROLOGIA() {
        return GASTROENTEROLOGIA;
    }


    public ArrayList<String> getINFECTOLOGIA() {
        return INFECTOLOGIA;
    }


    public ArrayList<String> getNEFROLOGIA() {
        return NEFROLOGIA;
    }


    public ArrayList<String> getOFTALMOLOGIA() {
        return OFTALMOLOGIA;
    }


    public ArrayList<String> getOTORRINOLARINGOLOGIA() {
        return OTORRINOLARINGOLOGIA;
    }


    public ArrayList<String> getNEUMOLOGIA() {
        return NEUMOLOGIA;
    }


    public ArrayList<String> getNEUROLOGIA() {
        return NEUROLOGIA;
    }


    public ArrayList<String> getRADIOLOGIA() {
        return RADIOLOGIA;
    }

    public ArrayList<String> getANEGTESIOLOGIA() {
        return ANEGTESIOLOGIA;
    }
    
    


}
