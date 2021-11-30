
package tarea_6;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas JUnit para la clase Archivo.
 * @version 1.0
 * @author Manuela Arcila - Angie Camelo
 */
public class ArchivoTest {
    
    /**
     * Test cuando la ruta ingresada es correcta, y el archivo
     * exista.
     * @throws Exception Excepción en caso de que no exista el archivo.
     */
    @Test
    public void testRutaArchivoCorrecta() throws Exception {
    String ruta = "src\\Pruebas\\Prueba2.txt";
    Archivo archivo = new Archivo();
    Estudiante e1 = new Estudiante("1234567","Lulú López");
    Estudiante e2 = new Estudiante("9876534","Pepito Pérez");
    Estudiante e3 = new Estudiante("4567766","Calvin Clein");
    Estudiante e4 = new Estudiante("1234567","Lulú López");
    Estudiante e5 = new Estudiante("4567766","Calvin Clein");
    ArrayList<Estudiante> esperado = new ArrayList<>();
    esperado.add(e1);
    esperado.add(e2);
    esperado.add(e3);
    esperado.add(e4);
    esperado.add(e5);
    ArrayList<Estudiante> actual = archivo.leerArchivo(ruta);
     String esperadoString = esperado.toString();
     String actualString = actual.toString();         
     
    assertEquals(esperadoString.equals(actualString), actualString.equals(esperadoString));
    }
    
    /**
     * Test cuando la ruta ingresada es incorrecta, y el archivo
     * no exista.
     * @throws Exception Excepción en caso de que no exista el archivo.
     */
    @Test(expected = Exception.class)
    public void testRutaArchivoIncorrecta() throws Exception{
        String ruta = "src\\Pruebas\\demo.txt";
        Archivo archivo = new Archivo();
        ArrayList<Estudiante> esperado = archivo.leerArchivo(ruta);
    }
    
}
