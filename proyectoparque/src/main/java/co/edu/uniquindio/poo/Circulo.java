package co.edu.uniquindio.poo;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public double getRadio(){
        return radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

