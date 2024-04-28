package co.edu.uniquindio.poo;
public class Hogar extends Producto {

    private String indicaciones;

    public Hogar(String codigoProducto, String nombre, String descripcion, double precio, int stock, String proovedor,
            String indicaciones) {
        super(codigoProducto, nombre, descripcion, precio, stock, proovedor);
        this.indicaciones = indicaciones;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    @Override
    public String toString() {
        return "Hogar [indicaciones=" + indicaciones + "]";
    }
    
}
