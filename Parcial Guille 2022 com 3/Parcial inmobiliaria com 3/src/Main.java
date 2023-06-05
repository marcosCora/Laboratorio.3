import Models.*;

import java.util.Scanner;

public class Main {

    static Scanner teclado;
    public static void main(String[] args)
    {
        teclado = new Scanner(System.in);

        Inmobiliaria inmobiliariaND = new Inmobiliaria();

        Persona persona = new Persona("Marcos", "Corasaniti", 43392102);
        Propiedad propiedad = new Casa("48-3344", persona, 200000, 0, 1, 0);
        inmobiliariaND.agregar(propiedad);

        persona = new Persona("Karla", "Kjer", 42385102);
        propiedad = new Departamento("521-589", persona, 150000, 0, 4, 0);
        inmobiliariaND.agregar(propiedad);

        persona = new Persona("Gotia", "Betbeder", 44589632);
        propiedad = new Oficina("narnia a la vuelta", persona, 98000, 0, 15);
        inmobiliariaND.agregar(propiedad);

        persona = new Persona("rama", "madera", 43392102);
        propiedad = new Casa("hipolito yrigoyen", persona, 50000, 0, 3, 0);
        inmobiliariaND.agregar(propiedad);

        persona = new Persona("Bauti", "loba", 15258963);
        propiedad = new Departamento("brown 1712", persona, 20000, 0, 2, 0);
        inmobiliariaND.agregar(propiedad);

        persona = new Persona("zorra", "fernandez", 25369874);
        propiedad = new Oficina("99-1054", persona, 200, 0, 74);
        inmobiliariaND.agregar(propiedad);

        System.out.println("ESTAS SON NUESTRAS PROPIEDADES EN VENTA, CONSULTE POR ALQUILER.\n" + inmobiliariaND.imprimePropiedades());
        /*
        System.out.println("Ingrese la direccion de la propiedad que desea eliminar:");
        String direccion = teclado.nextLine();
        */
        //System.out.println(inmobiliariaND.eliminoPropiedad(direccion));

        //System.out.println("ESTAS SON NUESTRAS PROPIEDADES EN VENTA, CONSULTE POR ALQUILER.\n" + inmobiliariaND.imprimePropiedades());

        System.out.println("Ingrese la direccion de la propiedad que desea alquilar:");
        String direccion = teclado.nextLine();

        //teclado.nextLine();
        System.out.println("\nIngrese la cantidad de meses por la que usted quiere alquilar la propiedad:");
        int cantMeses = teclado.nextInt();

        System.out.println("Esta es la propiedad con su valor de alquiler en total: \n\n" + inmobiliariaND.alquilaPropiedad(cantMeses, direccion));


    }
}