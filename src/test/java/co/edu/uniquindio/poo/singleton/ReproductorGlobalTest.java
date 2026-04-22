package co.edu.uniquindio.poo.singleton;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class ReproductorGlobalTest {
    private static final Logger LOG = Logger.getLogger(ReproductorGlobalTest.class.getName());
    @Test
    public void testSingletonInstanciaUnica() {
        ReproductorGlobal instancia1 = ReproductorGlobal.getInstancia();
        ReproductorGlobal instancia2 = ReproductorGlobal.getInstancia();

        assertEquals(instancia1, instancia2);
    }
}
