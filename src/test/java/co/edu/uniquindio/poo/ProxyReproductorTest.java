package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.factoryMethod.AudioLibro;
import co.edu.uniquindio.poo.factoryMethod.Contenido;
import co.edu.uniquindio.poo.singleton.Usuario;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class ProxyReproductorTest {
    private static final Logger LOG = Logger.getLogger(ProxyReproductorTest.class.getName());
    @Test
    public void premiumPuedeReproducirAudioLibro() {
        final boolean[] llamado = {false};

        IReproductor reproductorReal = c -> llamado[0] = true;

        Usuario usuario = new Usuario("1", "Juan", Usuario.TipoSuscripcion.PREMIUM);
        ProxyReproductor proxy = new ProxyReproductor(reproductorReal, usuario);

        Contenido audioLibro = new AudioLibro("1", "Libro X", 500, "Autor", "Narrador");

        proxy.reproducir(audioLibro);

        assertTrue(llamado[0], "El usuario premium debería poder reproducir audiolibros");
    }
    @Test
    public      void freeNoPuedeReproducirAudioLibro() {
        final boolean[] llamado = {false};

        IReproductor reproductorReal = c -> llamado[0] = true;

        Usuario usuario = new Usuario("2", "Ana", Usuario.TipoSuscripcion.FREE);
        ProxyReproductor proxy = new ProxyReproductor(reproductorReal, usuario);

        Contenido audioLibro = new AudioLibro("2", "Libro Y", 400, "Autor", "Narrador");

        proxy.reproducir(audioLibro);

        assertFalse(llamado[0], "El usuario FREE no debería reproducir audiolibros");
    }
}