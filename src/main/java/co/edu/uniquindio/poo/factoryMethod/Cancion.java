package co.edu.uniquindio.poo.factoryMethod;

public class Cancion extends Contenido {
    private String artista;
    private String album;
    public Cancion(String id, String titulo, int duracionSeg, String artista, String
            album) {
        super(id, titulo, duracionSeg);
        this.artista = artista;
        this.album = album;
    }
    @Override
    public void reproducir() {
        System.out.println("Cancion:" + titulo + "—" + artista);
    }
}
