package co.edu.uniquindio.poo;

public abstract class Persona {
    private  String nombres;
    private  String apellidos;
    private  String dni;
    private  String direccion;
    private  String telefono;
    
    public Persona(String nombres, String apellidos, String dni, String direccion, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona [nombres=" + nombres + ", apellidos=" + apellidos + ", dni=" + dni + ", direccion=" + direccion
                + ", telefono=" + telefono + "]";
    }
}
