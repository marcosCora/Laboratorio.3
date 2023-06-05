import Modelos.Autor;
import Modelos.Libro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner teclado;
    public static void main(String[] args) {

        teclado = new Scanner(System.in);
        ArrayList<Libro> libros = new ArrayList<Libro>();

        //agrego libros al array list
        cargoLibros(libros);

        //muestro el array list de libros
        muestroArrayList(libros);

        //busco libro por titulo y le cambio el precio
        System.out.println("Ingrese el nombre del libro para cambiar el precio:");
        modificaPrecioLibro(libros, teclado.nextLine());

        muestroArrayList(libros);



        teclado.close();
    }

    public static void agegaUnLibro(ArrayList<Libro> libros)
    {
        System.out.println("Datos del libro:\n");
        System.out.println("Ingrese el titulo: ");
        String titulo = teclado.nextLine();
        int pos = buscaPosLibro(libros, titulo);
        if(pos != -1)
        {
            System.out.println("El libro ya existe, ingrese el stock a sumar:");
            libros.get(pos).modificaStock(teclado.nextInt());
            teclado.nextLine();
        }
        else
        {
            teclado.nextLine();
            System.out.println("ingrese precio: ");
            int precio = teclado.nextInt();
            System.out.println("Ingrese stock: ");
            int stock = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Datos del autor:\n");
            System.out.println("Nombre: ");
            String nombre = teclado.nextLine();
            System.out.println("Apellido: ");
            String apellido = teclado.nextLine();
            System.out.println("Email: ");
            String email = teclado.nextLine();
            System.out.println("Genero(M/F:" );
            String genero = teclado.nextLine();

            Autor autor = new Autor(nombre, apellido, email, genero);
            Libro libro = new Libro(titulo, precio, stock, autor);
            libros.add(libro);
        }
    }

    public static void cargoLibros(ArrayList<Libro> libros)
    {
        String aux = "";
        char opcion = ' ';


        while (opcion != 's')
        {
            agegaUnLibro(libros);

            System.out.println("\n's' para salir otro para continuar");
            aux = teclado.nextLine();
            opcion = aux.charAt(0);
            teclado.nextLine();
        }
    }


    //FUNCION QUE BUSCA SI EXISTE UN LIBRO EN EL ARRAY LIST
    //SI EXISTE RETORNA LA POS Y SI NO EXISTE -1
    public  static int buscaPosLibro(ArrayList<Libro> libros, String titulo)
    {
        int i = 0;
        int pos = -1;
        boolean flag = false;


        while (i < libros.size() && !flag)
        {

            if(libros.get(i).getTitulo().equals(titulo))
            {
                pos = i;
                flag = true;
            }
            i++;
        }
        return pos;
    }

    public static void muestroArrayList(ArrayList<Libro> libros)
    {
        System.out.println("Estos son los libros en stock\n");


        for(int i=0; i<libros.size(); i++)
        {

            System.out.println(libros.get(i).toString());
        }
    }


    //funcion que busca un libro con la funcion de pos y le modifica el precio
    public static void modificaPrecioLibro(ArrayList<Libro> libros, String tiutlo)
    {

        int posLibro = buscaPosLibro(libros, tiutlo);

        if(posLibro != -1)
        {
            System.out.println("Libro: "+libros.get(posLibro).getTitulo()+"\nPrecio actual: "+libros.get(posLibro).getPrecio());
            System.out.println("Ingrese el nuevo precio: ");
            libros.get(posLibro).setPrecio(teclado.nextInt());
        }
        else
        {
            System.out.println("El libro no existe");
        }


    }


}