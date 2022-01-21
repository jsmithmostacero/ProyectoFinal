/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package datos;

import entidades.Doctor;
import entidades.Especialista;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DatosDoctor {
    ArrayList<Doctor> doctores = new ArrayList<>();
    Doctor doctor;

    public DatosDoctor() {
        llenarLista();
    }

    public void llenarLista(){
       doctor = new Doctor("DAVID ALEXANDER", "CUADROS CAMPOS", "45589906", Especialista.PEDIATRIA);
       doctores.add(doctor);
       doctor = new Doctor("GLODUALDO", "RAMOS ÑAHUI", "44543170", Especialista.GINECO_OBSTETRICIA);
       doctores.add(doctor);
       doctor = new Doctor("LINA ROSALIN", "DAVILA PEREZ", "44896434", Especialista.CIRUGIA);
       doctores.add(doctor);
       doctor = new Doctor("MELIA", "FERNADEZ TAIPE", "44796435", Especialista.PSIQUIATRIA);
       doctores.add(doctor);
       doctor = new Doctor("MONICA LIDIA", "MENDOZA BELITO", "73587866", Especialista.CARDIOLOGIA);
       doctores.add(doctor);
       doctor = new Doctor("VIRGINIA", "ENRIQUEZ LAPA", "44796434", Especialista.DERMATOLOGIA);
       doctores.add(doctor);
       doctor = new Doctor("YOLANDA", "CARRILLO ROJAS", "43733273", Especialista.ENDOCRINOLOGIA);
       doctores.add(doctor);
       doctor = new Doctor("YURFA", "FORE HERMOZA", "47516959", Especialista.GASTROENTEROLOGIA);
       doctores.add(doctor);
       doctor = new Doctor("LOURDES", "MALLCCO HUAMAN", "10604911", Especialista.INFECTOLOGIA);
       doctores.add(doctor);
       doctor = new Doctor("MIDA OFELIA", "ANQUIPA MARTÍNEZ", "44796434", Especialista.NEFROLOGIA);
       doctores.add(doctor);
       doctor = new Doctor("RUSSMERY", "DE LA CRUZ GARCIA", "44796434", Especialista.OFTALMOLOGIA);
       doctores.add(doctor);
       doctor = new Doctor("MARGARITA", "ORTEGA RODRIGO", "42414820", Especialista.OTORRINOLARINGOLOGIA);
       doctores.add(doctor);
       doctor = new Doctor("MARGARITA", "PILLPA CCANTO", "70300128", Especialista.NEUMOLOGIA);
       doctores.add(doctor);
       doctor = new Doctor("YESSICA ROSMERY", "CUAREZ MAQUERA", "46966102", Especialista.NEUROLOGIA);
       doctores.add(doctor);
       doctor = new Doctor("LIZBETH OFELIA", "GARZON FLORES", "71874011", Especialista.RADIOLOGIA);
       doctores.add(doctor);
       doctor = new Doctor("JOSE BELVY", "TITO SOTO", "45013927", Especialista.ANEGTESIOLOGIA);
       doctores.add(doctor);

    }

    public Doctor getDoctores(Especialista especialista) {
        for (int i = 0; i < doctores.size(); i++) {
            if(doctores.get(i).getEspecialista().equals(especialista))
               return doctores.get(i); 
        }
        return null;
    }
    
    
    
}
