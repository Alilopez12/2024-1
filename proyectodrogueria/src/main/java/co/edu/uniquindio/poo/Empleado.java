package co.edu.uniquindio.poo;
public class Empleado extends Persona{

    private double salario;

    public Empleado(String nombre, String apellido, String dni, String direccion, String telefono, double salario) {
        super(nombre, apellido, dni, direccion, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

}
