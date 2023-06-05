package Modelo;

public class Socio {

    //atributos
    private String nombre;
    private int nroCliente;
    private int cantLibrosLeidos;

    private int librosObtenidos[];//alamcena el id de los libros que tiene cada socio
    private int vLibrosObtenidos;//validos del arreglo que tiene los id de los libros

    //Constructores
    public Socio()
    {
        this.nombre = "";
        this.nroCliente = 0;
        this.cantLibrosLeidos = 0;
        this.librosObtenidos = new int[5];
        this.vLibrosObtenidos = 0;
    }
    public Socio(String nombre, int nroCliente, int cantLibrosLeidos, int cantLibrosTiene)
    {
        this.nombre = nombre;
        this.nroCliente =nroCliente;
        this.cantLibrosLeidos = cantLibrosLeidos;

        this.librosObtenidos = new int[5];
        this.vLibrosObtenidos = 0;
    }

    //getters
    public int getvLibrosObtenidos()
    {
        return vLibrosObtenidos;
    }
    public int getCantLibrosLeidos()
    {
        return cantLibrosLeidos;
    }

    public String getNombre()
    {
        return nombre;
    }
    public int getNroCliente()
    {
        return nroCliente;
    }

    //setters
    public void setCantLibrosLeidos()
    {
        cantLibrosLeidos++;
    }

    //este metodo agrega el id del libro al campo del arreglo que alamcena los libros que puede tener
    //un cliente
    public boolean agregoIdLibro(int idLibro)
    {
        boolean agregado = false;

        if(vLibrosObtenidos < this.librosObtenidos.length)
        {
            this.librosObtenidos[vLibrosObtenidos] = idLibro;
            vLibrosObtenidos++;
            agregado = true;
        }

        return agregado;
    }

    //Metodo que devuelve la informacion de un socio completa



}
