package Modelo;

public class Libro {

    //Atributos
    private boolean diponible;
    private String nombre;
    private String autor;
    private String genero;
    private int idLibro;

    //Constructores
    public Libro()
    {
        this.diponible = true;
        this.idLibro = 0;
        this.nombre = "";
        this.nombre = "";
        this.genero = "";
        this.autor = "";
    }

    public Libro(String nombre, String autor, String genero, int idLibro)
    {
        this.diponible = true;
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.idLibro = idLibro;
    }

    //getters
    public boolean getDisponibilidad()
    {
        return diponible;
    }
    public int getIdLibro()
    {
        return idLibro;
    }
    public String infoLibro()
    {
        return nombre + autor + genero;
    }


    //metodo que cambia el estado del libro
    public void cambiaEstadoLibro(boolean diponible)
    {
        this.diponible = diponible;
    }


}
