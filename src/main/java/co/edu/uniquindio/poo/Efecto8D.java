package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.factoryMethod.Contenido;

public class Efecto8D extends EfectoDecorator {
    public Efecto8D(IReproductor envuelto) { super(envuelto); }
    @Override
    public void reproducir(Contenido c) {
        super.reproducir(c);
        System.out.println("Efecto 8D aplicado");
    }
}
