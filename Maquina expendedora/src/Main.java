import Modelo.Mes;

import java.util.Scanner;
import java.time.*;
import java.time.format.*;

public class Main {
    static Scanner teclado;
    public static void main(String[] args) {

        teclado = new Scanner(System.in);
        boolean boletoAgregado = false;
        char opcion = ' ';
        String aux = "";
        int saldo = 0;


        LocalDate fecha = LocalDate.now();
        String fechaCompleta = fecha + " ";

        Mes maquinaUtn = new Mes(50, 130, 0, 0, 0, fechaCompleta);

        do
        {
            menuPrincipal();
            aux = teclado.nextLine();
            opcion = aux.charAt(0);

            switch (opcion)
            {
                case '1':

                    funcionesUsuario(maquinaUtn);

                    break;
                case '2':

                    funcionesTecnico(maquinaUtn);

                    break;
            }

        }while(opcion != 's');


    }

    public static void menuPrincipal()
    {
        System.out.println("ESCOGA LA OPCION QUE DESEE");
        System.out.println("1- Usario");
        System.out.println("2- Tecnico");
        System.out.println("Ingrese 's' para salir");

    }
    public static void menuUsuario(Mes maquina)
    {

        System.out.println("VALOR DEL BOLETO: "+ maquina.getPrecioActual());
        System.out.println("SALDO ACTUAL: "+ maquina.getSaldo());
        System.out.println("1- Ingresa saldo");
        System.out.println("2- Crea boleto");
        System.out.println("Ingrese el numero de opcion o 's' para salir");
    }


    public static void funcionesUsuario(Mes maquina)
    {
        boolean boletoAgregado = false;
        char opcion = ' ';
        String aux = "";
        int saldo = 0;

        do
        {
            menuUsuario(maquina);
            aux = teclado.nextLine();
            opcion = aux.charAt(0);

            switch (opcion)
            {
                case '1':

                    System.out.println("Ingrese el saldo que desea cargar: ");
                    saldo = teclado.nextInt();
                    teclado.nextLine();
                    maquina.ingresaSaldo(saldo);

                    break;
                case '2':

                    boletoAgregado = maquina.creaBoleto();
                    if(boletoAgregado)
                    {
                        System.out.println("BOLETO CARGADO CON EXITO\n");
                    }
                    else
                    {
                        System.out.println("ERROR VUELVA A CARGAR EL BOLETO\n");
                    }
                    break;
                case '3':

                    break;
                case '4':
                    break;
            }


        }while(opcion != 's');


    }



    public static void funcionesTecnico(Mes maquina)
    {
        System.out.println("Ingrese clave: ");
        int contrasenia = teclado.nextInt();
        teclado.nextLine();

        if (contrasenia == 43392102)
        {

            char opcion = ' ';
            String aux = "";
            int saldo = 0;

            do
            {
                menuTecnico();
                aux = teclado.nextLine();
                opcion = aux.charAt(0);

                switch (opcion)
                {
                    case '1':
                        muestraBoletos(maquina);

                        break;
                    case '2':


                        break;
                    case '3':

                        break;
                    case '4':
                        break;
                }


            }while(opcion != 's');


        }
        else
        {
            System.out.println("\nCONSTRASEÑA INCORRECTA\n");
        }
    }

    public static void menuTecnico()
    {
        System.out.println("ESCOGA LA OPCION QUE DESEE");
        System.out.println("1- Ver todos los boletos emitidos");
        System.out.println("2- Ver catidad de boletos emitidos");
        System.out.println("3- Modificar cantidad de boletos");
        System.out.println("4- Ver recaudacion");
        System.out.println("5- Modificar precio del boleto");
        System.out.println("6- ");

    }

    public static void muestraBoletos(Mes maquina)
    {
        System.out.println("Boletos: ");
        String infoBoleto = "";
        for(int i = 0; i < maquina.getvBoletos(); i++)
        {
            System.out.println("Boleto " + i+1);
           infoBoleto = maquina.muestraBoleto(i);
            System.out.println(infoBoleto + "\n");
        }
    }

}





