package co.edu.uniquindio.poo;
import java.time.LocalDate;

public class Pedido {

    
    private LocalDate fecha;
    private int cantidad;


    public Pedido(LocalDate fecha, int cantidad){

       this.fecha = fecha;
        this.cantidad = cantidad;
}

    public LocalDate getFecha(){
        return fecha;
    }

    public int getCantidad(){
    return cantidad;
}

}
