package co.edu.uniquindio.poo;
import java.util.Collection;


public class CuentaAhorros extends CuentaBancaria{

    private double tasaInteres;

    public CuentaAhorros(String nombresTitualar, String apellidosTitular, int numeroCuenta, double saldo,
            boolean estado, Collection<Transaccion> listaTransacciones, Titular titular, double tasaInteres) {
        super(nombresTitualar, apellidosTitular, numeroCuenta, saldo, estado, listaTransacciones, titular);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    
    @Override
    public String toString() {
        return "CuentaAhorros [tasaInteres=" + tasaInteres + "]";
    }

    public void retirar(double valor) {
        assert valor > 0;
        assert valor <= getSaldo();
        setSaldo(getSaldo() - valor);
        if (getSaldo() == 0) setEstado(false);
    }

    

}