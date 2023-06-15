package Models;

public class Articulo extends Biblioteca{

    private String resumen;

    public Articulo()
    {
        super();
        this.resumen = "";
    }

    public Articulo(String titulo, String autor, int anioPublicacion, int cantEjemplares, String resumen) {
        super(titulo, autor, anioPublicacion, cantEjemplares);
        this.resumen = resumen;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    @Override
    public String toString() {
        return super.toString() +
                "resumen='" + resumen + '\'' +
                '}';
    }
}
