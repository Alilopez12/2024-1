package co.edu.uniquindio.poo;

public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea() {
        return base * altura;
    }
}
