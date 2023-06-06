import Models.CuentaBancaria;
import Models.CuentaBancariaExcepcion;
import Models.Prueba;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   static Scanner teclado;
    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        Prueba prueba = new Prueba();

        //ejercicio 1
        /**
        int rta = prueba.dividir(6, 0);
        System.out.println("RTA: " + rta);
        */
        //ejercico 2
        /**
        String cadena = "";

        System.out.println("Ingrese una cadena de texto: ");
        cadena = teclado.nextLine();

        int longi = prueba.controladoraCadenaExcepcion(cadena);
        */

        //ejercicio 3
        /**
        ArrayList<String> coches = new ArrayList<>();
        coches.add("toro");
        coches.add("onix");
        coches.add("focus");
        coches.add("mondeo");
        prueba.muestraCoche(coches, 5);
        */

        //ejercicio 5
        /**
        CuentaBancaria cuenta = new CuentaBancaria(500, 50000);
        try {
            cuenta.retiroDinero(55000);
            System.out.println("El dinero fue retirado");
        }
        catch (CuentaBancariaExcepcion e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("Dinero en cuenta: " + cuenta.getSaldo());
        */

        //ejercicio 6

        try {
            int factorial = prueba.factorial(5);
            System.out.println("El factorial es: " + factorial);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }





    }







}