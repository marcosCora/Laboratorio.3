package Modelo;

public class Biblioteca {

    private Socio socios[];
    int vSocios;//validos socios
    private Libro libros[];
    int vLibros;//validos libros

    //Constructores
    public Biblioteca()
    {
        this.socios = new Socio[25];
        this.vSocios = 0;
        this.libros = new Libro[100];
        this.vLibros = 0;
    }



    //metodo que crea un libro que es recibido por parametros y lo agrega al arreglo de libros
    public boolean agregarLibros(String nombre, String autor, String genero)
    {
        boolean agregado = false;

        if(vLibros < this.libros.length)
        {
            //le paso validos + 1 ya que los id de los libros comienzan desde el numero 1 en adelante
            Libro libroAgregar = new Libro(nombre, autor, genero, vLibros+1);
            this.libros[vLibros] = libroAgregar;
            vLibros++;
            agregado = true;
        }

        return agregado;
    }

    public boolean agregarSocios(String nombre, int nroCliente, int cantLibrosLeidos, int cantLibrosTiene)
    {
        boolean agregado = false;

        if(vSocios < this.socios.length)
        {
            Socio socioAgregar = new Socio(nombre, nroCliente, cantLibrosLeidos, cantLibrosTiene);
            socios[vSocios] = socioAgregar;
            vSocios++;

            agregado = true;
        }

        return agregado;
    }

    //sett que me devuelve el arreglo de libros
    public libros setLibros()
    {
        return libros;
    }



}
