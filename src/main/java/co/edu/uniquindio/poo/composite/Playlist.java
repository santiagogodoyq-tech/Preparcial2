package co.edu.uniquindio.poo.composite;
import java.util.ArrayList;
import java.util.List;
public class Playlist implements ComponentPlaylist {
    private String nombre;
    private List<ComponentPlaylist> hijos = new ArrayList<>();
    public Playlist(String nombre) {
        this.nombre = nombre;
    }
    public void agregar(ComponentPlaylist c) { hijos.add(c); }
    public void quitar(ComponentPlaylist c) { hijos.remove(c); }
    @Override
    public int duracionTotal() {
        int total = 0;
        for (ComponentPlaylist c : hijos) {
            total += c.duracionTotal(); // llamada RECURSIVA
        }
        return total;
    }

    @Override
    public void mostrar(String indent) {
        System.out.println(indent + " Playlist: " + nombre);
        for (ComponentPlaylist c : hijos) {
            c.mostrar(indent + " ");
        }
    }
    public static String formatearDuracion(int segundos) {
        int horas = segundos / 3600;
        int min = (segundos % 3600) / 60;
        int seg = segundos % 60;
        return String.format("%02d:%02d:%02d", horas, min, seg);
    }
}
