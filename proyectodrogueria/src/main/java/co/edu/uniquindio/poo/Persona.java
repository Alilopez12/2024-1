package co.edu.uniquindio.poo;
public abstract class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String telefono;

    public Persona (String nombre, String apellido, String dni, String direccion, String telefono){

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
}

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getDni(){
        return dni;
    }

    public String getDirecion(){
        return direccion;
    }

    public String getTelefono(){
        return telefono;
    }
}

