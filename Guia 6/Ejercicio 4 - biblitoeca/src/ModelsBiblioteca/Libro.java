package ModelsBiblioteca;

public class Libro extends Elemento implements IPrestado
{
    private boolean prestado;

    public Libro() {
        super();
        this.prestado = false;
    }

    public Libro(String titulo, int anioPublicacion, int codigo) {
        super(titulo, anioPublicacion, codigo);
        this.prestado = false;
    }

    public boolean isPrestado()
    {
        return prestado;
    }

    public void setPrestado(boolean prestado)
    {
        this.prestado = prestado;
    }

    public String toString()
    {
        return super.toString() +
                "\nPrestado: " + prestado;
    }


    @Override
    public boolean prestar()
    {
        boolean aux = false;
        if(!prestado)
        {
            prestado = true;
        }
        return aux;
    }

    @Override
    public void devolver()
    {
        if(prestado)
        {
            prestado = false;
        }
    }
}
