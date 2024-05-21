package co.edu.uniquindio.poo;
import java.util.Collection;

public class CuentaCorriente extends CuentaBancaria {

    private double sobregiro;

    public CuentaCorriente(String nombresTitular, String apellidosTitular, int numeroCuenta, double saldo,
            boolean estado, Collection<Transaccion> listaTransacciones, Titular titular, double sobregiro) {
        super(nombresTitular, apellidosTitular, numeroCuenta, saldo, estado, listaTransacciones, titular);
        this.sobregiro = sobregiro;
    }

    public double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    @Override
    public String toString() {
        return "CuentaCorriente [sobregiro=" + sobregiro + "]";
    } 
   
    public void retirar(double valor) {
        assert valor > 0;
        assert valor <= getSaldo() + sobregiro;
    
        double saldoAntesDelRetiro = getSaldo();
    
        if (getSaldo() < valor) {
            double exceso = valor - getSaldo();
            setSaldo(0);
            setSobregiro(getSobregiro() - exceso);
        } else {
            setSaldo(getSaldo() - valor);
        }
    
        double saldoDespuesDelRetiro = getSaldo();
    
        // Verificar si el retiro fue exitoso
        if (saldoDespuesDelRetiro == saldoAntesDelRetiro) {
            System.out.println("No se puede retirar. Fondos insuficientes y sobregiro no permitido.");
        }
    }
    
    

}

