package Models;

public class Revista extends Prestable
{
    private int numeroDeEdicion;
    private boolean verificada;

    public Revista()
    {
        super();
        this.numeroDeEdicion = 0;
        this.verificada = false;
    }

    public Revista(String titulo, String autor, int anioPublicacion, int cantEjemplares, boolean prestado, int numeroDeEdicion, boolean verificada)
    {
        super(titulo, autor, anioPublicacion, cantEjemplares, prestado);
        this.numeroDeEdicion = numeroDeEdicion;
        this.verificada = verificada;
    }

    public int getNumeroDeEdicion() {
        return numeroDeEdicion;
    }

    public void setNumeroDeEdicion(int numeroDeEdicion) {
        this.numeroDeEdicion = numeroDeEdicion;
    }

    public boolean isVerificada() {
        return verificada;
    }

    public void setVerificada(boolean verificada) {
        this.verificada = verificada;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numeroDeEdicion=" + numeroDeEdicion +
                ", verificada=" + verificada +
                '}';
    }
}
