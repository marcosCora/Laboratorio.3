import Models.EAsalariado;
import Models.EComision;
import Models.Empleado;
import Models.Gestora;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    static Scanner teclado;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        Gestora gestora = new Gestora();

        Empleado empleado = new EAsalariado("Marcos", "Corasaniti", 43392102, 2010, 800000);
        //empleado.setSalario(empleado.calculoSalario(empleado.getSalario()));
        gestora.agregarEmpleado(empleado);
        Empleado empleado2 = new EComision("David", "lavin", 43598236, 2008, 750000, 900, 1000 );
        empleado2.setSalario(empleado2.calculoSalario(empleado2.getSalario()));
        gestora.agregarEmpleado(empleado2);
        Empleado empleado3 = new EAsalariado("karla", "kjer", 42589635, 2020, 800000);
        gestora.agregarEmpleado(empleado3);
        Empleado empleado4 = new EComision("Gotia", "Betbeder", 44589745, 2018, 750000, 150, 800);
        empleado4.setSalario(empleado4.calculoSalario(empleado4.getSalario()));
        gestora.agregarEmpleado(empleado4);

        String empleadosMuestra = gestora.imprimirEmpleados();
        System.out.println(empleadosMuestra);

        empleadosMuestra = gestora.imprimeTipoDeEmpleado("EAsalariado");
        System.out.println("Estos son los empleados asalariados:\n" + empleadosMuestra);

        empleadosMuestra = gestora.imprimeTipoDeEmpleado("EComision");
        System.out.println("Estos son los empleados por comision:\n" + empleadosMuestra);

        String empleadoMayorSueldo = gestora.buscaEmpleadoMayorSueldo();
        System.out.println("\nEste es el empleado con el mayor sueldo:\n" + empleadoMayorSueldo);


    }
}