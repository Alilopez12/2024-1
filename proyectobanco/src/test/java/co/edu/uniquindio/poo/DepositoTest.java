package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.Test;

public class DepositoTest {

    @Test
    public void testDeposito() {
        System.out.println("Iniciando testDeposito");
        
        // Crear titulares
        Titular titular1 = new Titular("Juan", "Perez");

        // Crear cuentas bancarias
        Collection<Transaccion> transacciones = new ArrayList<>();
        CuentaBancaria cuenta = new CuentaCorriente("Juan", "Perez", 12345, 1000, true, transacciones, titular1, 500);

        // Cantidad a depositar
        double cantidadDeposito1 = 500;
        double cantidadDeposito2 = 300;

        // Realizar el primer depósito
        cuenta.depositar(cantidadDeposito1);

        // Realizar el segundo depósito
        cuenta.depositar(cantidadDeposito2);

        // Calcular la suma de los depósitos
        double sumaDepositos = cantidadDeposito1 + cantidadDeposito2;

        // Verificar el saldo actual después del depósito
        assertEquals(1800.0, cuenta.consultarSaldo());

        // Imprimir la cantidad depositada y la suma de los depósitos
        System.out.println("Cantidad del primer depósito: " + cantidadDeposito1);
        System.out.println("Cantidad del segundo depósito: " + cantidadDeposito2);
        System.out.println("Suma de los depósitos: " + sumaDepositos);
        
        System.out.println("Finalizando testDeposito");
    }
}



