
package tarea_6;

/**
 * Información académica de un estudiante.
 * @version 1.0
 * @author Manuela Cruz y Angie Camelo
 */

public class Estudiante {
     private String cedula;
    private String nombre;
    private int cantidadMaterias;

    public Estudiante(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cantidadMaterias = 1;
    } 
    
    public int getCantidadMaterias() {
        return cantidadMaterias;
    }        

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCantidadMaterias(int cantidadMaterias) {
        this.cantidadMaterias = cantidadMaterias;
    }

    @Override
    public String toString() {
        String informacion = "Cedula: " + this.cedula + " Nombre: " + 
                this.nombre + " Cant Materias: " + this.cantidadMaterias;
        return informacion; 
    }
}