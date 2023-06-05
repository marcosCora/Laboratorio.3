package ModelsBiblioteca;

public class Elemento {

    private String titulo;
    private int anioPublicacion;
    private int codigo;

    public Elemento()
    {
        this.titulo = "";
        this.anioPublicacion = 0;
        this.codigo = 0;
    }

    public Elemento(String titulo, int anioPublicacion, int codigo)
    {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.codigo = codigo;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public int getAnioPublicacion()
    {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion)
    {
        this.anioPublicacion = anioPublicacion;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public String toString()
    {
        return "\nTitulo: " + titulo
                + "\nAño de publicacion: " + anioPublicacion
                + "\nCodigo: " + codigo;
    }

}
