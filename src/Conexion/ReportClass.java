/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexion;
import java.sql.Connection;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Jsmith
 */
public class ReportClass {
    // Obtener nombre del archivo jasper atravez de Mapeo y parametros.
    public static void generarReporte(String reporte) throws JRException, FileNotFoundException, IOException, ClassNotFoundException
    {
        Map<String, Object> params = new HashMap<String, Object>(); // Mapeo de parametros
        generarReport(reporte, params); // Obtener el nombre del archivo jrxml
    }
    
    public static void generarReporte(String reporte,Map parametros,boolean esta) throws JRException, FileNotFoundException, IOException, ClassNotFoundException
    {
        generarReporte(reporte, parametros);
         // Obtener el nombre del archivo jrxml
    }
    
    
    // Carga reporte 
    public static void generarReporte(String reporte,Map<String,Object> params) throws JRException, FileNotFoundException, IOException, ClassNotFoundException {     
        
        
        try {
            Connection con;
            con = Conecion_MySQL.realizarConexion(); // Conexion a la BD
            //System.out.println(con);
            String path = "/reportes/"; // Ruta donde se encuentran los jasper y jrxml
            String ruta = path + reporte; // Ruta + el nombre del jasper que se recibe atravez del metodo generarReporte
            String reportSource = ruta + ".jasper"; // Se coloca la extension a la ruta del jasper 
            //System.out.println(""+reportSource);
            JasperReport jr = (JasperReport) JRLoader.loadObject(ReportClass.class.getResource(reportSource)); // Se crea Jasper y se carga la ruta
            JasperPrint jp = JasperFillManager.fillReport(jr, params, con); // Crea el reporte para ser mostrado
            JasperViewer jv = new JasperViewer(jp, false); // Creamos la vista del Jasper
            jv.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Cerrar Jasper sin que se cierre toda la aplicacion
            jv.setVisible(true); // Monstrar Jasper
        }catch (JRException ex){
            ex.printStackTrace();
            System.err.println("GenerarReporte: "+ex);
        }catch (Exception ex){
            //Aqui le agrege para que me capte un otro error
            System.err.println("Otro Error Desconocido : "+ ex);
        }
        
    }
    
    public static void generarReport(String reporte,Map params) throws JRException, FileNotFoundException, IOException, ClassNotFoundException {     
        
        Connection con;
        try {
            con = Conecion_MySQL.realizarConexion(); // Conexion a la BD
            String path = "/reportes/"; // Ruta donde se encuentran los jasper y jrxml
            String ruta = path + reporte; // Ruta + el nombre del jasper que se recibe atravez del metodo generarReporte
            String reportSource = ruta + ".jasper"; // Se coloca la extension a la ruta del jasper 
            JasperReport jr = (JasperReport) JRLoader.loadObject(ReportClass.class.getResource(reportSource)); // Se crea Jasper y se carga la ruta
            JasperPrint jp = JasperFillManager.fillReport(jr, params, con); // Crea el reporte para ser mostrado
            JasperViewer jv = new JasperViewer(jp, false); // Creamos la vista del Jasper
            jv.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Cerrar Jasper sin que se cierre toda la aplicacion
            jv.setVisible(true); // Monstrar Jasper
        } catch (SQLException ex) {
            Logger.getLogger(ReportClass.class.getName()).log(Level.SEVERE, null, ex);
        }catch (JRException ex){
            ex.printStackTrace();
            System.err.println("GenerarReporte: "+ex);
        }catch (Exception ex){
            //Aqui le agrege para que me capte un otro error
            System.err.println("Otro Error Desconocido : "+ ex);
        }
        
    }

}
