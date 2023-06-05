package Models;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Empleado {

    private int dni;
    private String nombre;
    private String apellido;
    private int anioIngreso;
    private float salario;

    public Empleado() {
        this.dni = 0;
        this.nombre = "";
        this.apellido = "";
        this.anioIngreso = 0;
        this.salario = 0;
    }

    public Empleado(int dni, String nombre, String apellido, int anioIngreso, float salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
        this.salario = salario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado " +
                "\nNombre: " + nombre +
                "\nApellido: " + apellido +
                "\nDni: " + dni +
                "\nAño de Ingreso: " + anioIngreso +
                "\nSalario: " + salario;
    }




    //metodo que calcula la antiguedad de un empleado y lo retorna
    public int calculaAntiguedad()
    {
        Calendar fecha = new GregorianCalendar();
        int anio = fecha.get(Calendar.YEAR);

        return anio - anioIngreso;
    }


    public abstract float calculoSalario(float salario);
}
