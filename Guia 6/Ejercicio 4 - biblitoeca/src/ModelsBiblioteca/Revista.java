package ModelsBiblioteca;

public class Revista extends Elemento {

    private int  stock;


    public Revista()
    {
        super();
        this.stock = 0;
    }

    public Revista(String titulo, int anioPublicacion, int codigo, int stock) {
        super(titulo, anioPublicacion, codigo);
        this.stock = stock;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        stock = stock;
    }

    public String toString()
    {
        return super.toString() +
                "\nStock: " + stock;
    }


}
