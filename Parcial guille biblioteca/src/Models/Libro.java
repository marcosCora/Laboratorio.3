package Models;

public class Libro extends Prestable
{
    int numPaginas;

    public Libro()
    {
        super();
        this.numPaginas = 0;
    }

    public Libro(String titulo, String autor, int anioPublicacion, int cantEjemplares, boolean prestado, int numPaginas)
    {
        super(titulo, autor, anioPublicacion, cantEjemplares, prestado);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numPaginas=" + numPaginas +
                '}';
    }
}
