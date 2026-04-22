package co.edu.uniquindio.poo.composite;

import co.edu.uniquindio.poo.factoryMethod.Contenido;

public class ElementoContenido implements ComponentPlaylist {
    private Contenido contenido;
    public ElementoContenido(Contenido contenido) {
        this.contenido = contenido;
    }
    @Override
    public int duracionTotal() {
        return contenido.getDuracionSeg();
    }
    @Override
    public void mostrar(String indent) {
        System.out.println(indent + contenido.getTitulo()+
                " (" + contenido.getDuracionSeg() + ")");
    }
    public Contenido getContenido() { return contenido; }
}
