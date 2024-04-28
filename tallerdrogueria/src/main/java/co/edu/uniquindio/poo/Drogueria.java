package co.edu.uniquindio.poo;
import java.util.Collection;
import java.util.LinkedList;

public class Drogueria {
    private  final String nombre;
    private  final Collection <Producto> ListaProductos;
    private  final Collection <Pedido> ListaPedidos;
    private  final Collection <Cliente> ListaClientes;
    private  final Collection <Empleado> ListaEmpleados;


    public Drogueria(String nombre) {
        this.nombre = nombre;
        this.ListaProductos = new LinkedList<Producto>();
        this.ListaPedidos = new LinkedList<Pedido>();
        this.ListaClientes = new LinkedList<Cliente>();
        this.ListaEmpleados = new LinkedList<Empleado>();
    }

    public String getNombre() {
        return nombre;
    }

    public Collection<Producto> getProductos() {
        return ListaProductos;
    }

    public Collection<Pedido> getPedidos() {
        return ListaPedidos;
    }

    public Collection<Cliente> getClientes() {
        return ListaClientes;
    }

    public Collection<Empleado> getEmpleados() {
        return ListaEmpleados;
    }

    @Override
    public String toString() {
        return "Drogueria [nombre=" + nombre + ", ListaProductos=" + ListaProductos + ", ListaPedidos=" + ListaPedidos
                + ", ListaClientes=" + ListaClientes + ", ListaEmpleados=" + ListaEmpleados + "]";
    }

    //** Método para agregar un produto a una lista de productos
    public void agregarProducto(Producto producto){
        ListaProductos.add(producto);

    }

    //* Método para agregar un empleado a una lista de empleados
    public void agregarEmpleado(Empleado empleado) {
       ListaEmpleados.add(empleado);
    }

    //*Método para agregar un cliente a una lista de clientes */
    public void agregarCliente(Cliente cliente) {
        ListaClientes.add(cliente);
    }
    //*Método para agregar un pedido a una lista de pedidos  */
    public void agregarPedido(Pedido pedido) {
        assert verificar_stock() == false : "No se puede realizar pedido porque no hay stock suficiente";
        ListaPedidos.add(pedido);
    }

    //*Método para verificar si hay stock para el producto pedido */
    private boolean verificar_stock (){
        boolean hay_stock = false;
        for(Producto producto : ListaProductos){
            if ( producto.getStock() == 0) {
                hay_stock = true;
            }
    }
        return hay_stock;
    }

    //*Método para obtener la lista de los productos con un stock mayor a 100 */
    public Collection<Producto> StockMayorACien() {
        Collection<Producto> listaStockMayorACien = new LinkedList<Producto>();
        for (Producto producto : ListaProductos) {
            if (producto.getStock()>=100) {
                listaStockMayorACien.add(producto);
            }
        }
        return listaStockMayorACien;
    }

    //*Método para consultar el costo total de un pedido */
    public double costoTotalPedido(Cliente cliente) {
        double costo = 0;
        for (Pedido pedido : ListaPedidos) {
            if (pedido.getCliente().equals(cliente)) {
                costo += pedido.getCantidad() * pedido.getProducto().getPrecio();
            }
        }
        return costo;
    }
}
  
