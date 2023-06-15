package Models;

public abstract class Biblioteca
{
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int cantEjemplares;

    public Biblioteca()
    {
        this.titulo = "";
        this.autor = "";
        this.anioPublicacion = 0;
        this.cantEjemplares = 0;
    }
    public Biblioteca(String titulo, String autor, int anioPublicacion, int cantEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.cantEjemplares = cantEjemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getCantEjemplares() {
        return cantEjemplares;
    }

    public void setCantEjemplares(int cantEjemplares) {
        this.cantEjemplares = cantEjemplares;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", cantEjemplares=" + cantEjemplares +
                '}';
    }
}
