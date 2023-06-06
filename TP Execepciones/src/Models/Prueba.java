package Models;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class Prueba {


    //ejercicio 1
    public int dividir(int num1, int num2) {
        int rta = 0;

        try {
            rta = num1 / num2;
            //throw new ArithmeticException("division por cero");

        } catch (ArithmeticException ex)
        {
            System.out.println("paso algo 1"+ex.getMessage());
        } catch (Exception ex)
        {
            System.out.println("Paso algo 2");
        }

        return rta;
    }

    //ejercicio 2
    public int longitudCadena(String cadena) throws NumberFormatException
    {
        int longitud = 0;
        if(cadena.matches("[a-zA-Z]+"))
        {
            longitud = cadena.length();
        }
        else
        {
            throw new NumberFormatException("La cadena contiene numeros");
        }
        return longitud;
    }

    //ejercicio 2
    public int controladoraCadenaExcepcion(String cadena)
    {
        int longitud = -1;

        try {
            longitud = longitudCadena(cadena);
            System.out.println("Esta es la ongitud: " + longitud);
        }catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("paso algo");
        }

        return longitud;
    }

    //ejercicio 3
    public void muestraCoche(ArrayList<String> coches, int indice)
    {
        String info = "";

        try {
            info = coches.get(indice);
            System.out.println("Coche " + info);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Indice desfasado " + e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("ERROR " + e.getMessage());
        }
    }

    //ejercicio 6

    public int factorial(int num) throws IllegalArgumentException
    {
        if(num < 0)
        {
            throw new IllegalArgumentException("ERROR NUMERO NEGATIVO");
        }
        else
        {
            num = num * factorial(num-1);
        }

        return num;
    }




}
