package co.edu.uniquindio.poo;
public class Medicamento extends Producto{
    private  double dosis;

    public Medicamento(String codigoProducto, String nombre, String descripcion, double precio, int stock,
            String proovedor, double dosis) {
        super(codigoProducto, nombre, descripcion, precio, stock, proovedor);
        this.dosis = dosis;
    }

    public double getDosis() {
        return dosis;
    }
    
    public void setDosis(double dosis) {
        this.dosis = dosis;
    }

    @Override
    public String toString() {
        return "Medicamento [dosis=" + dosis + "]";
    }

}
