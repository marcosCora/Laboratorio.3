import clases.CD;
import clases.DVD;
import clases.Dome;
import clases.Elemento;

import java.util.Scanner;

public class Main
{

    static Scanner teclado;
    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        char opcion = ' ';
        String aux = "";

        Dome domeMio = new Dome();


        do
        {
            menuPrincipal();
            aux = teclado.nextLine();
            opcion = aux.charAt(0);

            switch (opcion)
            {
                case '1':

                    funcionesCD(domeMio);

                    break;
                case '2':

                    funcionesDVD(domeMio);

                    break;
            }

        }while(opcion != 's');


    }

    public static void menuPrincipal()
    {
        System.out.println("ESCOGA UNA OPCION");
        System.out.println("1- CD");
        System.out.println("2- DVD");
        System.out.println("Ingrese 's' para salir");

    }

    public static void funcionesCD(Dome dome)
    {

        char opcion = ' ';
        String aux = "";
        String informacionElemento = "";
        //CD cd = new CD();

        do
        {
            menuCD();
            aux = teclado.nextLine();
            opcion = aux.charAt(0);

            switch (opcion)
            {
                case '1':

                    dome = agregaElementos(dome, 1);


                    break;
                case '2':
                    System.out.println("Esto son todos los CDs que hay disponibles:");
                    informacionElemento = dome.muestaElementosCD();
                    System.out.println(informacionElemento);
                    break;
            }

        }while(opcion != 's');

    }
    public static void menuCD()
    {
        System.out.println("ESCOGA UNA OPCION");
        System.out.println("1- Agregar CD");
        System.out.println("2- Mostrar CDs");
        System.out.println("Ingrese 's' para salir");
    }

    public static void funcionesDVD(Dome dome)
    {

        char opcion = ' ';
        String informacionElemento = "";
        String aux = "";

        do
        {
            menuDVD();
            aux = teclado.nextLine();
            opcion = aux.charAt(0);

            switch (opcion)
            {
                case '1':
                    dome = agregaElementos(dome, 0);
                    break;
                case '2':
                    System.out.println("Esto son todos los DVDs que hay disponibles:");
                    informacionElemento = dome.muestraElementosDVD();
                    System.out.println(informacionElemento);
                    break;
            }

        }while(opcion != 's');

    }
    public static void menuDVD()
    {
        System.out.println("ESCOGA UNA OPCION");
        System.out.println("1- Agregar DVD");
        System.out.println("2- Mostrar DVDs");
        System.out.println("Ingrese 's' para salir");
    }



    public static Elemento agregarUnElemento(int flag)
    {
        Elemento elemento;

        System.out.println("NOMBRE:");
        String nombre = teclado.nextLine();
        System.out.println("FECHA DE EMISION:");
        String fecha = teclado.nextLine();
        System.out.println("PRODUCTOR:");
        String productor = teclado.nextLine();
        System.out.println("GENERO:");
        String genero = teclado.nextLine();
        System.out.println("COMENTARIOS ");
        String comentarios = teclado.nextLine();
        System.out.println("DURACION (minuetos):");
        int duracion = teclado.nextInt();
        System.out.println("PESO (bytes):");
        int peso = teclado.nextInt();
        System.out.println("CLASIFICACION (1 A 5):");
        int clasifiacion = teclado.nextInt();
        teclado.nextLine();
        if(flag == 1)
        {
            //datos del CD
            System.out.println("ARTISTA:");
            String artista = teclado.nextLine();
            System.out.println("DISCO GRAFICA:");
            String discoGrafica = teclado.nextLine();
            System.out.println("CANTIDAD DE TEMAS:");
            int cantTemas = teclado.nextInt();
            elemento = new CD(nombre, fecha, productor, genero, comentarios, duracion, peso, clasifiacion, false, artista, discoGrafica, cantTemas);

        }else
        {
            //Datos del dvd
            System.out.println("ACTORES:");
            String actores = teclado.nextLine();
            System.out.println("DISTRIBUIDORA:");
            String distribuidora = teclado.nextLine();
            System.out.println("IDIOMA:");
            String idioma = teclado.nextLine();
            System.out.println("PREMIOS:");
            String premios = teclado.nextLine();
            System.out.println("DIRECTOR:");
            String director = teclado.nextLine();
            System.out.println("ESTUDIO:");
            String estudio = teclado.nextLine();

            elemento = new DVD(nombre,fecha, productor, genero, comentarios,duracion, peso, clasifiacion, false, actores, distribuidora, estudio, idioma, premios, director);
        }


        return elemento;
    }

    //funcion que agrega varios CD al dome
    public static Dome agregaElementos(Dome dome, int flag)//el flag sirve para saber si voy a cargar un CD o un DVD
    {
        char opcion = ' ';
        String aux = "";
        Elemento elemento;

        while (opcion != 's')
        {
            elemento = agregarUnElemento(flag);
            dome.agregaElemento(elemento);

            teclado.nextLine();
            System.out.println("\n's' para salir/Otro para continuar\n");
            aux = teclado.nextLine();
            opcion = aux.charAt(0);
        }

        return dome;
    }


/*
    public static void muestraElemento(Dome dome)
    {



    }


*/

}
