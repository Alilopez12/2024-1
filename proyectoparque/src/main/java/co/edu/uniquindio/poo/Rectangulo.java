package co.edu.uniquindio.poo;

public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    /**
     * @param base
     * @param altura
     */

    public Rectangulo(double base, double altura) {
        assert base > 0 && altura > 0;
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }
    
    @Override

    public double calcularArea() {
        return base * altura;
    }
}
