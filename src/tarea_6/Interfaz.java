
package tarea_6;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Clase para recibir y mostrar informacion
 * @version 1.0
 * @author Manuela Cruz y Angie Camelo
 */
public class Interfaz {

    /**
     * Pide la ruta del archivo y recibe la lista con la informacion original
     * de los estudiantes, para posteriormente mostrar la informacion de las
     * materias vistas por cada estudiante
     * @param args
     * @throws Exception si no se encuentra el archivo
     */
    public static void main(String[] args) throws Exception {
       ArrayList<Estudiante> lista = new ArrayList<>();
        

        Archivo archivo = new Archivo();
        Controlador controlador = new Controlador();
        String ruta = JOptionPane.showInputDialog("Escribe el nombre del archivo", "Prueba");
        lista = archivo.leerArchivo("src\\Pruebas\\" + ruta + ".txt");
        
        mostrarInformacion(lista);
        
        ArrayList<Estudiante> estudiantes = controlador.getListaEstudiantes();
        for (Estudiante estudiante1 : estudiantes) {
            //System.out.println(estudiante1);
        }
    }
    
    /**
     * Metodo que envia la informacion de cada estudiante a la clase controlador 
     * para contar las materias, mostrando al final la informacion completa de 
     * la cantidad de materias que ve cada estudiante
     * @param lista la lista con la informacion original de los estudiantes
     */
    public static void mostrarInformacion(ArrayList<Estudiante> lista) {
        Controlador controlador = new Controlador();
        for (Estudiante e : lista) {
            controlador.contarMaterias(e);
        }
        controlador.mostrarEstudiante();
    }
    
}