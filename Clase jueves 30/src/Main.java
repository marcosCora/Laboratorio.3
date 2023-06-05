import Modelo.Biblioteca;

import java.util.Scanner;

public class Main {

    static Scanner teclado;
    public static void main(String[] args)
    {
        teclado = new Scanner(System.in);

        char opcion = ' ';
        String aux = "";
        //creo una bibliteca
        Biblioteca biblitecaMunicipal = new Biblioteca();

        do
        {
            muestraMenu();
            aux = teclado.nextLine();
            opcion = aux.charAt(0);

            switch (opcion)
            {
                case '1':
                    agregarLibrosBibliteca(biblitecaMunicipal);
                    break;
                case '2':

                    break;

            }


        }while(opcion != 's');

    }

    public static void muestraMenu()
    {
        System.out.println("Ingrese el numero de opcion o 's' para salir");
        System.out.println("1- Ingresa Libros a la biblioteca municipal");
        System.out.println("2- ");
        System.out.println("3- ");
        System.out.println("4- ");
    }

    //consultar donde iria esta funcion al profe mañana
    //agrega libros por teclado a la bibiliteca
    public static void agregarLibrosBibliteca(Biblioteca biblioteca)
    {
        char opcion = ' ';
        boolean agregado = true;
        String  nombre = "";
        String autor = "";
        String genero = "";

        while (opcion != 's' && agregado)
        {
            System.out.println("Ingrese nombre: ");
            nombre = teclado.nextLine();
            System.out.println("Ingrese autor: ");
            autor = teclado.nextLine();
            System.out.println("Ingrese genero: ");
            genero = teclado.nextLine();

            agregado = biblioteca.agregarLibros(nombre, autor, genero);

            System.out.println("Ingrese 's' para salir Otro para continuar");
            String aux = teclado.nextLine();
            opcion = aux.charAt(0);
        }
    }

    //funcion que muestra los libros de la bibliteca disponibles
    public static void muestraBibliteca(Biblioteca biblioteca)
    {
        
        for(int i=0; i<)
    }


}