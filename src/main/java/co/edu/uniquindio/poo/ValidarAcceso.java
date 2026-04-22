package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.factoryMethod.AudioLibro;
import co.edu.uniquindio.poo.factoryMethod.Contenido;
import co.edu.uniquindio.poo.singleton.Usuario;

public class ValidarAcceso{
    public static boolean puedeReproducir(Usuario u, Contenido c) {
        if (u == null) return false;
        if (u.esPremium()) return true;
        if (c instanceof AudioLibro) return false;
        return true;
    }
}
