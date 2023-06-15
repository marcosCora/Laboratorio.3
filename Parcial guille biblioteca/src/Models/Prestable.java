package Models;

public class Prestable extends Biblioteca{
    private boolean prestado;

    public Prestable( ) {
        super();
        this.prestado = false;
    }

    public Prestable(String titulo, String autor, int anioPublicacion, int cantEjemplares, boolean prestado) {
        super(titulo, autor, anioPublicacion, cantEjemplares);
        this.prestado = prestado;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return super.toString() +
                "prestado=" + prestado +
                '}';
    }
}
