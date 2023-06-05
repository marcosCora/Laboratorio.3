package Models;

import java.util.Objects;

public class Empleado {

    private  String nombre;
    private String apellido;
    private String direccion;
    private int legajo;
    private int fechaNacimiento;

    private int salario;



    public Empleado()
    {
        this.nombre = "";
        this.apellido = "";
        this.direccion = "";
        this.legajo = 0;
        this.fechaNacimiento = 0;
        this.salario = 0;
    }

    public Empleado(String nombre, String apellido, String direccion, int legajo, int fechaNacimiento, int salario)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.legajo = legajo;
        this.fechaNacimiento = fechaNacimiento;
        this.salario = salario;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public int getLegajo()
    {
        return legajo;
    }

    public void setLegajo(int legajo)
    {
        this.legajo = legajo;
    }

    public int getFechaNacimiento()
    {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento)
    {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getSalario()
    {
        return salario;
    }

    public void setSalario(int salario)
    {
        this.salario = salario;
    }
        /*
        this.nombre = "";
        this.apellido = "";
        this.direccion = "";
        this.legajo = 0;
        this.fechaNacimiento = 0;
        this.salario = 0;
        */
    @Override
    public boolean equals(Object obj) {
        boolean rta = false;
        if(obj != null)
        {
            if(obj instanceof Empleado)
            {
                Empleado aux = (Empleado) obj;
                if(getNombre().equals(aux.getNombre()) && getApellido().equals(aux.getApellido()) && getDireccion().equals(aux.getDireccion()) && getLegajo() == aux.getLegajo() && getFechaNacimiento() == aux.getFechaNacimiento() && getSalario() == aux.getSalario())
                {
                    rta = true;
                }
            }
        }
        return rta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, direccion, legajo, fechaNacimiento, salario);
    }

    @Override
    public String toString() {
        return "\nEmpleado" +
                "\nNombre: " + nombre
                +"\nApellido: " +apellido
                +"\nSalario: " +salario
                +"\nLegajo: " +legajo
                +"\nDireccion: " +direccion
                +"\nFecha Nacimiento: " +fechaNacimiento;

    }
}
