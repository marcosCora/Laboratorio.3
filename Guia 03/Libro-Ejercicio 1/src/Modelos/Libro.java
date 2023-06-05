package Modelos;

import javax.swing.plaf.LabelUI;

public class Libro {

    private String titulo;
    private int precio;
    private int stock;
    private Autor autor;

    public Libro()
    {
        this.titulo = "";
        this.precio = 0;
        this.stock = 0;
        this.autor = new Autor();
    }

    public Libro(String titulo, int precio, int stock, Autor autor)
    {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void modificaStock(int stockSumar)
    {
        this.stock += stockSumar;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor=" + autor.toString() +
                '}';
    }
}
