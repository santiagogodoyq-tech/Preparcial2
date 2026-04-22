package co.edu.uniquindio.poo.factoryMethod;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class ContenidoTest {
    private static final Logger LOG = Logger.getLogger(ContenidoTest.class.getName());
    @Test
    public void testCrearCancion() {
        ContenidoFactory factory = new CancionFactory();

        Contenido contenido = factory.crearContenido(
                "1", "Shape of You", 240, "Ed Sheeran", "Divide"
        );

        assertNotNull(contenido);
        assertTrue(contenido instanceof Cancion);
        assertEquals("Shape of You", contenido.getTitulo());
        assertEquals(240, contenido.getDuracionSeg());
    }
    @Test
    public void testCrearAudioLibro() {
        ContenidoFactory factory = new AudioLibroFactory();

        Contenido contenido = factory.crearContenido(
                "2", "El Principito", 600, "Antoine de Saint-Exupéry", "Juan Pérez"
        );

        assertNotNull(contenido);
        assertTrue(contenido instanceof AudioLibro);
        assertEquals("El Principito", contenido.getTitulo());
        assertEquals(600, contenido.getDuracionSeg());
    }
    @Test
    public void testCrearPodcast() {
        ContenidoFactory factory = new PodcastFactory();

        Contenido contenido = factory.crearContenido(
                "3", "TechTalk", 1800, "Carlos", "5"
        );

        assertNotNull(contenido);
        assertTrue(contenido instanceof Podcast);
        assertEquals("TechTalk", contenido.getTitulo());
        assertEquals(1800, contenido.getDuracionSeg());
    }
}