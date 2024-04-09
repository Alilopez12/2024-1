package co.edu.uniquindio.poo;
public class Cuadrado extends FiguraGeometrica {
    private double lado;


  public double getLado(){
        return lado;
    }
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    public double calcularArea() {
        return lado * lado;
    }
}
    
