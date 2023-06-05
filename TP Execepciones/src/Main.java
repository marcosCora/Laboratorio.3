import Models.Prueba;

import java.util.Scanner;

public class Main {

   static Scanner teclado;
    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        Prueba prueba = new Prueba();

        //float rta = prueba.dividir(6, 0);

        float rta = 0;


        try {
            rta = (float) 6 / 0;
            //throw new ArithmeticException("division por cero");

        } catch (ArithmeticException ex)
        {
            System.out.println("paso algo 1"+ex.getMessage());
        } catch (Exception ex)
        {
            System.out.println("Paso algo 2");
        }



        System.out.println("RTA: " + rta);

    }
}