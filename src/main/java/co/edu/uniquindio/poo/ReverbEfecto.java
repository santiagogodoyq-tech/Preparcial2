package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.factoryMethod.Contenido;

public class ReverbEfecto extends EfectoDecorator {
    public ReverbEfecto(IReproductor envuelto) { super(envuelto); }
    @Override
    public void reproducir(Contenido c) {
        super.reproducir(c);
        System.out.println("Reverb aplicado");
    }
}

