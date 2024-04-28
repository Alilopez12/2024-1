/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        assertTrue(true);
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }

    @Test
    public void datosCompletos(){
        LOG.info("Inicio test datos completos");

        Drogueria drogueria = new Drogueria("Saludable");
        Medicamento dolex = new Medicamento("1234", "dolex", "Tomar cada cuatro horas", 1500, 100, "Rodrigo", 1);
        Hogar sofa = new Hogar("12345", "sofa", "Para decorar la sala", 250000, 10, "Camilo", "armar el sofa y acomodarlo en el lugar deseado");
        CuidadoPersonal bloqueador = new CuidadoPersonal("123456", "bloqueador", "Para protegerse del sol", 90000, 10, "Cesar", "caléndula-pepino-óxido de zinc");
        Cliente maria = new Cliente("Maria", "Salazar Rodriguez", "12345678", "La mariela", "3014568795");
        Empleado empleado1 = new Empleado("Martin", "Sanchez Ospina", "1088803984", "limonar", "3224879652", 1600000);
        Gerente gerente = new Gerente("Andres", "López Mora", "109275364", "pedregal", "3236589741", 2785650);
        Pedido pedido = new Pedido(LocalDate.now(), 5, bloqueador, maria);

        drogueria.agregarProducto(dolex);
        drogueria.agregarProducto(sofa);
        drogueria.agregarProducto(bloqueador);
        drogueria.agregarCliente(maria);
        drogueria.agregarEmpleado(empleado1);
        drogueria.agregarEmpleado(gerente);
        drogueria.agregarPedido(pedido);
        
        LOG.info("Finalizando test datos completos");
    }
    @Test
    public void PedidosSinStock(){
        LOG.info("Iniciando test pedido sin stock");

        Drogueria drogueria = new Drogueria("Saludable");
        Medicamento dolex = new Medicamento("1234", "dolex", "Tomar cada cuatro horas", 1500, 100, "Rodrigo", 1);
        Hogar sofa = new Hogar("12345", "sofa", "Para decorar la sala", 250000, 0, "Camilo", "armar el sofa y acomodarlo en el lugar deseado");
        CuidadoPersonal bloqueador = new CuidadoPersonal("123456", "bloqueador", "Para protegerse del sol", 90000, 0, "Cesar", "caléndula-pepino-óxido de zinc");
        Cliente maria = new Cliente("Maria", "Salazar Rodriguez", "12345678", "La mariela", "3014568795");
        Empleado empleado1 = new Empleado("Martin", "Sanchez Ospina", "1088803984", "limonar", "3224879652", 1600000);
        Gerente gerente = new Gerente("Andres", "López Mora", "109275364", "pedregal", "3236589741", 2785650);
        Pedido pedido = new Pedido(LocalDate.now(), 5, bloqueador, maria);

        drogueria.agregarProducto(dolex);
        drogueria.agregarProducto(sofa);
        drogueria.agregarProducto(bloqueador);
        drogueria.agregarCliente(maria);
        drogueria.agregarEmpleado(empleado1);
        drogueria.agregarEmpleado(gerente);
        drogueria.agregarPedido(pedido);

        assertThrows(IllegalArgumentException.class, () -> drogueria.agregarPedido(pedido));


        LOG.info("Finalizando test pedido sin stock");

    }

    @Test
    public void productosStockMayorACien(){

        LOG.info("Iniciando test productos con un stock mayor a cien");

        Drogueria drogueria = new Drogueria("Saludable");
        Medicamento dolex = new Medicamento("1234", "dolex", "Tomar cada cuatro horas", 1500, 10, "Rodrigo", 1);
        Hogar sofa = new Hogar("12345", "sofa", "Para decorar la sala", 250000, 110, "Camilo", "armar el sofa y acomodarlo en el lugar deseado");
        CuidadoPersonal bloqueador = new CuidadoPersonal("123456", "bloqueador", "Para protegerse del sol", 90000, 300, "Cesar", "caléndula-pepino-óxido de zinc");

        drogueria.agregarProducto(dolex);
        drogueria.agregarProducto(sofa);
        drogueria.agregarProducto(bloqueador);

        Collection<Producto> listaStockMayorACien = drogueria.StockMayorACien();
        System.out.println("Lista de productos con stock mayor a 100:");
        for (Producto producto : listaStockMayorACien) {
            System.out.println(producto);
        }    

        LOG.info("Finalizando test productos con un stock mayor a cien");
    }

    @Test
    public void CostoTotalPedido(){

        LOG.info("Iniciando test costo total de un pedido");

        Drogueria drogueria = new Drogueria("Saludable");
        Medicamento dolex = new Medicamento("1234", "dolex", "Tomar cada cuatro horas", 1500, 100, "Rodrigo", 1);
        Hogar sofa = new Hogar("12345", "sofa", "Para decorar la sala", 250000, 30, "Camilo", "armar el sofa y acomodarlo en el lugar deseado");
        CuidadoPersonal bloqueador = new CuidadoPersonal("123456", "bloqueador", "Para protegerse del sol", 90000, 80, "Cesar", "caléndula-pepino-óxido de zinc");
        Cliente maria = new Cliente("Maria", "Salazar Rodriguez", "12345678", "La mariela", "3014568795");
        Empleado empleado1 = new Empleado("Martin", "Sanchez Ospina", "1088803984", "limonar", "3224879652", 1600000);
        Gerente gerente = new Gerente("Andres", "López Mora", "109275364", "pedregal", "3236589741", 2785650);
        Pedido pedido = new Pedido(LocalDate.now(), 5, bloqueador, maria);

        drogueria.agregarProducto(dolex);
        drogueria.agregarProducto(sofa);
        drogueria.agregarProducto(bloqueador);
        drogueria.agregarCliente(maria);
        drogueria.agregarEmpleado(empleado1);
        drogueria.agregarEmpleado(gerente);
        drogueria.agregarPedido(pedido);

        System.out.println("El costo total del pedido para " + maria.getNombres() + " es: $" + drogueria.costoTotalPedido(maria));

        LOG.info("finalizando test costo total de un pedido");

    }

    }

