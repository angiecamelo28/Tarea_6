package tarea_6;

import java.util.ArrayList;

/**
 * Controlador de estudiantes
 * @version 1.0
 * @author Manuela Cruz y Angie Camelo
 */
public class Controlador {

    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    
    /**
     * Método para contar materias de cada estudiante, verificando su previa
     * existencia en el listado para modificar el atributo "cantidadMaterias" o
     * si no existe, agregarlo a la lista.
     * @param estudiante Objeto de tipo estudiante
     */
    public void contarMaterias(Estudiante estudiante) {
        if (listaEstudiantes.toString().contains(estudiante.getCedula())) {
            buscarEstudiante(estudiante);
        } else {
            agregarEstudiante(estudiante);
        }
    }

    /**
     * Método para imprimir el listado de estudiantes, utilizando el método
     * toString de la clase estudiante.
     */
    public void mostrarEstudiante() {
        for (Estudiante estudiante1 : listaEstudiantes) {
            System.out.println(estudiante1.toString());
        }
    }

    /**
     * Método para buscar un estudiante en un listado de estudiantes. Si el
     * estudiante se encuentra, se aumenta su cantidad de materias.
     * @param estudiante Objeto de tipo estudiante
     */
    private void buscarEstudiante(Estudiante estudiante) {
        for (Estudiante e : listaEstudiantes) {
            if (e.getCedula().equals(estudiante.getCedula())) {
                e.setCantidadMaterias(e.getCantidadMaterias() + 1);
            }
        }
    }

    /**
     * Método que agrega un objeto de tipo estudiante a una lista de estudiantes
     * @param estudiante
     */
    private void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }
}
