package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.factoryMethod.Contenido;

public class EqEfecto extends EfectoDecorator {
    public EqEfecto(IReproductor envuelto) { super(envuelto); }
    @Override
    public void reproducir(Contenido c) {
        super.reproducir(c);
        System.out.println("Ecualizador aplicado");
    }
}
