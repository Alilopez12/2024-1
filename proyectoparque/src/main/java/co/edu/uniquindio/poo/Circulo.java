package co.edu.uniquindio.poo;
/**
 * @version 1.0
 */
public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        assert radio > 0: "El radio debe ser positivo";
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    /**
     * Este método calcula el área de un circulo
     * Math.PI es el valor que repre senta a pi
     */

    @Override

    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

