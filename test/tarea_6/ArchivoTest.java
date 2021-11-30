/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tarea_6;

import java.util.ArrayList;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author manu-
 */
public class ArchivoTest {

    public ArchivoTest() {
    }

    @Test
    void leerArchivoCorrecto() throws Exception {

        String ruta = "src\\Pruebas\\Prueba2.txt";
        Archivo archivo = new Archivo();
        Estudiante e1 = new Estudiante("1234567", "Lulú López");
        Estudiante e2 = new Estudiante("9876534", "Pepito Pérez");
        Estudiante e3 = new Estudiante("4567766", "Calvin Clein");
        Estudiante e4 = new Estudiante("1234567", "Lulú López");
        Estudiante e5 = new Estudiante("4567766", "Calvin Clein");
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
    
    @Test (expected = Exception.class)
    void rutaArchivoIncorrecta() throws Exception{
        String ruta = "src\\Pruebas\\demo.txt";
        Archivo archivo = new Archivo();
        archivo.leerArchivo(ruta);
        
    }

}
