import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Main {

    static Scanner teclado;
    public static void main(String[] args)
    {
        teclado = new Scanner(System.in);

        ///EJERCICIO 1
        /**
        int notasArray[] = new int[35]; //creo un array de tipo int con una dimension de 35
        cargaArrayInt(notasArray);
        muestraArrayInt(notasArray);
        float promedioArray = promedioArray(notasArray);
        System.out.println("El promedio de notas del array es: "+promedioArray);
        */
        ///EJERCICIO 2
        /**
        numeroPar();
        */
        ///EJERCICIO 3
        /**
        numeroPrimo(100);
        */

        //ejercicio4();

        //ejercicio6();

        ///EJERCICIO 7
        ///sumaNumerosNaturales();

        /// EJERCICIO 8
        ///sumaCantidadPositivosIngresados();

        //EJERCICIO 9
        //anioBisiesto();

        //EJERCICIO 10
        //valorAscciChar();

        //ejercicio 13
        /**
        String nombre = " ";
        System.out.println("Ingrese su nombre");
        nombre = teclado.nextLine();
        System.out.println("Buenos dias " +nombre);
         */

        //EJERCICIO 14
        //dobleYtripleNum();

        ///EJERCICIO 15
        //gradosCentigradosAFahrenheit();

        //EJERCICIO 16
        //longitudYAreaDeUnaCircunferencia();

        ///EJERCICIO 19
        promedioTemperaturas();

    }

    public static void cargaArrayInt(int array[])
    {
        char mander = ' ';
        int i = 0;

        while (i < array.length && mander != 's')
        {
            System.out.println("Ingrese el numero: ");
            array[i] = teclado.nextInt();
            i++;

            teclado.nextLine();

            System.out.println("Ingrese 's' para salir/Otro para continuar");
            String aux = teclado.nextLine();
            mander = aux.charAt(0);
        }
    }

    public static void muestraArrayInt(int array[])
    {
        System.out.println("Este es el arreglo: ");
        for(int i = 0; i< array.length; i++)
        {
            if(array[i] != 0)
            {
                System.out.println(array[i]);
            }
        }
    }
    public static void muestraArrayDouble(double array[])
    {
        System.out.println("Este es el arreglo: ");
        for(int i = 0; i< array.length; i++)
        {
            if(array[i] != 0)
            {
                System.out.println(array[i]);
            }
        }
    }

    public static float promedioArray(int array[])
    {
        int suma = 0;
        int cantidad = 0;
        float promedio = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(array[cantidad] != 0) {
                suma += array[cantidad];
                cantidad++;
            }
        }
        System.out.println("cant" +cantidad);
        System.out.println("suma" +suma);
        promedio = (float) suma/cantidad;
        return promedio;
    }

    public static void numeroPar()
    {
        int numero = 0;
        System.out.println("Ingrese el numero a corroborar");
        numero = teclado.nextInt();

        if(numero % 2 == 0)
        {
            System.out.println("El numero ingresado es par.");
        }
        else
        {
            System.out.println("El numero ingresado NO es par");
        }
    }

    public static void numeroPrimo(int cantidad)
    {
        System.out.println("Primeros" + cantidad + "numeros primos");
        for(int i = 2; i<cantidad; i++)
        {
            if(esPrimo(i))
            {
                System.out.println(i);
            }
        }
    }

    public static boolean esPrimo(int num)
    {
        boolean rta = true;

        for(int i = 2; i<num; i++)
        {
            if(num % i == 0)
            {
                rta = false;
            }
        }
        return rta;

    }

    public static void ejercicio4 ()
    {
        int cantidad = 0;

        System.out.println("Ingrese un numero tope para mostrar los primos anteriros: ");
        cantidad = teclado.nextInt();

        numeroPrimo(cantidad);

    }

    public static void ejercicio6 ()
    {
        int numero = 0;

        System.out.println("Ingrese numero a para corroborar si es primo: ");
        numero = teclado.nextInt();
        if(esPrimo(numero))
        {
            System.out.println("El numero ingresado es primo");
        }
        else
        {
            System.out.println("El numero ingresado NO es primo");
        }
    }

    public static void sumaNumerosNaturales()
    {
        int suma = 0;

        for(int i = 1; i<10; i++)
        {
            suma += i;
        }
        System.out.println("La suma de los 10 primoros numeros naturales es " +suma);
    }

    public static void sumaCantidadPositivosIngresados()
    {
        int numero = 0;//numero que ingresara el usuario
        int suma = 0;
        char mander = ' ';

        while (mander != 's')
        {
            System.out.println("Ingrese un numero a sumar");
            numero = teclado.nextInt();
            if(numero > 1)
            {
                suma += numero;
            }
            teclado.nextLine();

            System.out.println("ingrese 's' para salir/Otro para continuar");
            String aux = teclado.nextLine();
            mander = aux.charAt(0);
        }

        System.out.println("La suma de los numeros positivos ingresados es " +suma);
    }

    public static void anioBisiesto()
    {
        System.out.println("Ingrese el año que desea saber si es bisiesto ");
        int anio = teclado.nextInt();

        if(anio%4 == 0)
        {
            System.out.println("El año ingresao es bisiesto");
        }
        else
        {
            System.out.println("El año ingresao NO es bisiesto");
        }
    }

    public static void valorAscciChar()
    {
        String aux = " ";
        System.out.println("Ingrese el caracter");
        aux = teclado.nextLine();
        char caracter = aux.charAt(0);
        int numeroAscci = caracter;
        System.out.println("El numero ASCCI de " + caracter + " es " +numeroAscci);
    }

    //ejercicio 11
    public static int multiplicaNumeros(int num1, int num2)
    {
       return num1 * num2;
    }

    //ejercicio 14
    public static void dobleYtripleNum()
    {
        int num = 0;
        int doble = 0;
        int triple = 0;

        System.out.println("Ingrese un numero a multiplicar");
        num = teclado.nextInt();
        doble = multiplicaNumeros(num, 2);
        triple = multiplicaNumeros(num, 3);

        System.out.println("El doble de "+num+" es "+doble+" y el triple es " +triple);
    }

    //ejercicio 15
    public static void gradosCentigradosAFahrenheit()
    {
        float gCentigrados = 0;
        float gFahrenheit = 0;

        System.out.println("Ingrese los grados centigrados");
        gCentigrados = teclado.nextInt();

        gFahrenheit = 32+(9*gCentigrados/5);
        System.out.println(gCentigrados+ " grados centigrados son " +gFahrenheit+" grados fahrenheit");
    }

    //ejercicio 16
    public static void longitudYAreaDeUnaCircunferencia()
    {
        float radioC = 0;//radio de una circunferencia


        System.out.println("Ingrese el radio de la circunferencia: ");
        radioC = teclado.nextFloat();

        double longitudC = 2*Math.PI*radioC;
        double areaC = Math.PI*Math.pow(radioC, 2);

        System.out.println("Radio ingresado: "+radioC);
        System.out.println("Longitud de la circunferencia: "+longitudC);
        System.out.println("Area de la circunferencia: "+areaC);

    }

    //ejercicio 19
    public static void promedioTemperaturas()
    {
        double temperaturas[] = new double[30];

        for(int i=0; i<temperaturas.length; i++)
        {
            temperaturas[i] = Math.random()*35+1;
        }
        muestraArrayDouble(temperaturas);


    }


}