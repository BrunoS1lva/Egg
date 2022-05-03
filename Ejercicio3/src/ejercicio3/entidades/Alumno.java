package ejercicio3.entidades;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String nombre;
    private ArrayList<Integer> notas = new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = (ArrayList<Integer>) notas;
    }

}
