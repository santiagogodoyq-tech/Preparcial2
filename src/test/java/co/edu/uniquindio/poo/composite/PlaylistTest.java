package co.edu.uniquindio.poo.composite;

import static co.edu.uniquindio.poo.composite.Playlist.formatearDuracion;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.logging.Logger;

import co.edu.uniquindio.poo.composite.Playlist;
import org.junit.jupiter.api.Test;

public class PlaylistTest {
    private static final Logger LOG = Logger.getLogger(PlaylistTest.class.getName());
    @Test
    void deberiaFormatearDuracionCorrectamente() {
        String resultado = Playlist.formatearDuracion(3661);
        assertEquals("01:01:01", resultado);
    }

}