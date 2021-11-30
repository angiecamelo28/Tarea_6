
package tarea_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Manipulación de archivos.
 * @version 1.0
 * @author Manuela Arcila - Angie Camelo
 */

public class Archivo {
    
    public ArrayList<Estudiante> valores = new ArrayList<>();
    
    /**
     * Método para leer por medio de Buffers el archivo de texto con su
     * respectiva excepción en caso de que el archivo no exista
     *
     * @param ruta la ruta del archivo
     * @return Arreglo con la informacion de cada uno de los estudiantes
     */
    public ArrayList leerArchivo(String ruta) throws Exception {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                String datos[]=linea.split(","); 
                Estudiante estudiante = new Estudiante(datos[0],datos[1]);
                valores.add(estudiante);
            }

        } catch (Exception e) {
            throw new Exception("El archivo no existe.");
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                //e2.printStackTrace();
                throw new Exception("El archivo no existe.");

            }
        }
        return valores;
    }
}
