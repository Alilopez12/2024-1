package co.edu.uniquindio.poo;
import java.util.Collection;

public class Banco {
    private String nombre;
    private Collection<CuentaBancaria>ListaCuentasBancarias;
    private Collection<Titular>ListaTitulares;

    public Banco(String nombre, Collection<CuentaBancaria> listaCuentasBancarias,
    Collection<Titular> listaTitulares) {
        this.nombre = nombre;
        ListaCuentasBancarias = listaCuentasBancarias;
        ListaTitulares = listaTitulares;
}
     public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Collection<CuentaBancaria> getListaCuentasBancarias() {
        return ListaCuentasBancarias;
    }
    public void setListaCuentasBancarias(Collection<CuentaBancaria> listaCuentasBancarias) {
        ListaCuentasBancarias = listaCuentasBancarias;
    }
    public Collection<Titular> getListaTitulares() {
        return ListaTitulares;
    }
    public void setListaTitulares(Collection<Titular> listaTitulares) {
        ListaTitulares = listaTitulares;
    }

    @Override
    public String toString() {
        return "Banco [nombre=" + nombre + ", ListaCuentasBancarias=" + ListaCuentasBancarias + ", ListaTitulares="
                + ListaTitulares + "]";
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        ListaCuentasBancarias.add(cuenta);
    }

    public static Banco crearBancoNuevo(String nombre){
        return new Banco(nombre, null, null);
    }

    public String obtenerLista() {
        StringBuilder listaCuentasArea = new StringBuilder();
        listaCuentasArea.append(nombre).append("\n");
        for (CuentaBancaria cuenta : ListaCuentasBancarias) {
            listaCuentasArea.append(cuenta.getNombresTitualar()).append(" ")
                    .append(cuenta.getApellidosTitular()).append(" ").append(cuenta.getNumeroCuenta())
                    .append(" Saldo: ").append(cuenta.getSaldo()).append("\n");
        }
        return listaCuentasArea.toString();
    }
}

    

