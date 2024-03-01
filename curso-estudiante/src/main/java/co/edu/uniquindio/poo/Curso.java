package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Curso {
    private final String nombre;
    private final Collection<Estudiante> listaEstudiante;

    public Curso(String nombre){
        this.nombre = nombre;
        this.listaEstudiantes = new LinkedList<Estudiante>()

    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public Collection<Estudiante> getListaEstudiantes(){
        return Collection.unmodifiableCollectio(listaEstudiantes);
    }
}
