package co.edu.uniquindio.poo;
import java.util.Collection;

public abstract class CuentaBancaria {
    private String nombresTitular;
    private String apellidosTitular;
    private int numeroCuenta;
    private double saldo;
    private boolean estado;
    private Collection<Transaccion>ListaTransacciones;
    private Titular titular;

    public CuentaBancaria(String nombresTitualar, String apellidosTitular, int numeroCuenta, double saldo,
    boolean estado, Collection<Transaccion> listaTransacciones, Titular titular) {
        this.nombresTitular = nombresTitualar;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.estado = estado;
        ListaTransacciones = listaTransacciones;
        this.titular = titular;
}

    public String getNombresTitualar() {
        return nombresTitular;
    }
    public void setNombresTitualar(String nombresTitualar) {
        this.nombresTitular = nombresTitualar;
    }
    public String getApellidosTitular() {
        return apellidosTitular;
    }
    public void setApellidosTitular(String apellidosTitular) {
        this.apellidosTitular = apellidosTitular;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public Collection<Transaccion> getListaTransacciones() {
        return ListaTransacciones;
    }
    public void setListaTransacciones(Collection<Transaccion> listaTransacciones) {
        ListaTransacciones = listaTransacciones;
    }
    public Titular getTitular() {
        return titular;
    }
    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [nombresTitualar=" + nombresTitular + ", apellidosTitular=" + apellidosTitular
                + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", estado=" + estado + ", ListaTransacciones="
                + ListaTransacciones + ", titular=" + titular + "]";
    }
    public void depositar(double valor) {
        assert valor > 0 : "El valor a depositar debe ser mayor que 0";
        saldo += valor;
        estado = true;
    }
    
    public abstract void retirar(double valor);

    public double consultarSaldo() {
        if (isEstado()) {
            System.out.println("Su saldo es de: " + getSaldo());
            return getSaldo();
        } else {
            System.out.println("Su cuenta está desactivada");
            return Double.NaN;
        }
    }
    
    public void agregarTransaccion(Transaccion transaccion) {
        ListaTransacciones.add(transaccion);
       }

    public void transferir(CuentaBancaria cuentaDestino, double monto) {
        if (estado && cuentaDestino.isEstado()) {
            if (monto > 0 && saldo >= monto) {
                this.retirar(monto);
                cuentaDestino.depositar(monto);
                System.out.println("Transferencia exitosa de " + monto + " a la cuenta " + cuentaDestino.getNumeroCuenta());
            } else {
                System.out.println("La cantidad a transferir es inválida o la cuenta no tiene suficientes fondos.");
            }
        } else {
            System.out.println("Una de las cuentas no está activa o no existe.");
        }
    }
}
