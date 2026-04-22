package co.edu.uniquindio.poo.singleton;

import co.edu.uniquindio.poo.factoryMethod.Contenido;

public class ReproductorGlobal {

    private static ReproductorGlobal instancia;
    private Usuario usuarioActivo;
    private Contenido contenidoActual;

    private ReproductorGlobal() { }
    public static ReproductorGlobal getInstancia() {
        if (instancia == null) {
            instancia = new ReproductorGlobal();
        }
        return instancia;
    }

    public void iniciarSesion(Usuario u) {
        this.usuarioActivo = u;
        System.out.println("Sesión iniciada: " + u.getNombre() +" ( " + u.getSuscripcion() + " ) ");
    }
    public Usuario getUsuarioActivo() { return usuarioActivo; }
    public void reproducir(Contenido c) {
        this.contenidoActual = c;
        c.reproducir();
    }
}
