package co.edu.uniquindio.poo;
import java.util.Collection;
import java.util.LinkedList;

public class Parque{
    private final String nombre;
    private final String descripcion;
    private final Municipio municipio;
    private Collection<Zona> zonas;

    public Parque(String nombre, String descripcion, Municipio municipio){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.municipio = municipio;
        this.zonas = new LinkedList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public Collection<Zona> getZonas() {
        return zonas;
    }
}