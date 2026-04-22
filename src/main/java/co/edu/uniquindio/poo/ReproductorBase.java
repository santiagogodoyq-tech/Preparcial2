package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.factoryMethod.Contenido;

public class ReproductorBase implements IReproductor {
    @Override
    public void reproducir(Contenido c) {
        System.out.println("Reproduciendo: " + c.getTitulo());
        c.reproducir();
    }
}
