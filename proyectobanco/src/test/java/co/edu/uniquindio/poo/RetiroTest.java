package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.Test;

public class RetiroTest {
    @Test
public void testRetiro() {
    
    // Crear titulares
    Titular titular1 = new Titular("Juan", "Perez");

    // Crear cuentas bancarias
    Collection<Transaccion> transacciones = new ArrayList<>();
    CuentaBancaria cuenta = new CuentaCorriente("Juan", "Perez", 12345, 1000, true, transacciones, titular1, 500);

    // Valor del retiro
    double valorRetirado = 1200;

    // Saldo antes del retiro
    double saldoAntesDelRetiro = cuenta.consultarSaldo();

    // Realizar el retiro
    cuenta.retirar(valorRetirado);

    // Saldo después del retiro
    double saldoDespuesDelRetiro = cuenta.consultarSaldo();

    // Imprimir el valor retirado y el saldo después del retiro
    System.out.println("Valor retirado: " + valorRetirado);
    System.out.println("Saldo después del retiro: " + saldoDespuesDelRetiro);

    // Verificar si se utilizó sobregiro y mostrar los detalles
    if (cuenta instanceof CuentaCorriente) {
        CuentaCorriente cuentaCorriente = (CuentaCorriente) cuenta;

        // Sobregiro utilizado y restante
        double sobregiroUtilizado = 0;
        double sobregiroRestante = cuentaCorriente.getSobregiro();

        // Realizar el retiro utilizando el método de la cuenta corriente
        if (saldoDespuesDelRetiro < 0) {
            sobregiroUtilizado = Math.min(valorRetirado - saldoAntesDelRetiro, cuentaCorriente.getSobregiro());
            cuentaCorriente.retirar(valorRetirado);
            sobregiroRestante = cuentaCorriente.getSobregiro();
        }

        // Imprimir el sobregiro utilizado y restante
        System.out.println("Sobregiro utilizado: " + sobregiroUtilizado);
        System.out.println("Sobregiro restante: " + sobregiroRestante);
    }
}


    @Test
    public void testRetirar() {
        // Crear una cuenta de ahorros con un saldo inicial de 1000 y una tasa de interés del 2%
        Titular titular = new Titular("Juan", "Perez");
        CuentaAhorros cuenta = new CuentaAhorros("Juan", "Perez", 123456, 1000, true, null, titular, 0.02);

        // Retirar 500 de la cuenta
        cuenta.retirar(500);

        // Verificar que el saldo se haya actualizado correctamente
        assertEquals(500, cuenta.getSaldo());

        // Intentar retirar más de lo que queda en la cuenta
        cuenta.retirar(600);

        // Verificar que el saldo no se modifique y el estado de la cuenta cambie a false
        assertEquals(500, cuenta.getSaldo());
        assertFalse(cuenta.getEstado());

        // Intentar retirar un monto negativo, lo que debería lanzar una excepción
        assertThrows(AssertionError.class, () -> cuenta.retirar(-100));

        // Intentar retirar más de lo que queda en la cuenta, lo que debería lanzar una excepción
        assertThrows(AssertionError.class, () -> cuenta.retirar(600));
    }
}
}



