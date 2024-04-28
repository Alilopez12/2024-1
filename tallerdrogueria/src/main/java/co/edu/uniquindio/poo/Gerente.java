package co.edu.uniquindio.poo;
public class Gerente extends Empleado{

    public Gerente(String nombres, String apellidos, String dni, String direccion, String telefono, double salario) {
        super(nombres, apellidos, dni, direccion, telefono, salario);
    
    }
    
    public void agregarProducto(){

    }

    public void eliminarProducto(){
        
    }

    @Override
    public String toString() {
        return "Gerente []";
    }

    
}
