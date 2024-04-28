package co.edu.uniquindio.poo;
import java.time.LocalDate;

public class Pedido {
    private LocalDate fecha;
    private int cantidad;
    private Producto producto;
    private Cliente cliente;

    public Pedido(LocalDate fecha, int cantidad, Producto producto, Cliente cliente) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.producto = producto;
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido [fecha=" + fecha + ", cantidad=" + cantidad + ", producto=" + producto + ", cliente=" + cliente
                + "]";
    }


}
