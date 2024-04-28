package co.edu.uniquindio.poo;
import java.util.Collection;
import java.util.LinkedList;

public class Drogueria {
    private String nombre;
    private Collection<Cliente> clientes;
    private Collection<Empleado> empleados;
    private Collection<Producto> productos;
    private Collection<Pedido> pedidos;

    public Drogueria(String nombre){
        this.nombre = nombre;
        this.clientes = new LinkedList<>();
        this.empleados = new LinkedList<>();
        this.productos= new LinkedList<>();
        this.pedidos = new LinkedList<>();
    }

    public String getNombre(){
        return nombre;
    }

    public Collection<Cliente> getClientes(){
        return clientes;
    }

    public Collection<Empleado> getEmpleados(){
        return empleados;
    }

    public Collection<Producto> getProductos(){
        return productos;
    }

    public Collection<Pedido> getPedidos(){
        return pedidos;
    }
}
