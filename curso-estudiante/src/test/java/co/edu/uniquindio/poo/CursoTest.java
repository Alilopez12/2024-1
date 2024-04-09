package co.edu.uniquindio.poo;
public class CursoTest {
    @test
    public void datosCompletos(){
        LOG.info ("Inicio datosCompletos");
        Curso curso1 = new Curso ("programacion 1");

        assertEquals ("programacion1", curso1.getNombre());
        LOG.info ()

    }
}
