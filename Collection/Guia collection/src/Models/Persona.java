package Models;

import java.util.Objects;
import java.util.Queue;

public class Persona implements Comparable{

    private String nombre;
    private String apellido;
    private String dni;

    public Persona()
    {
        this.nombre = "";
        this.apellido = "";
        this.dni = "";
    }

    public Persona(String nombre, String apellido, String dni)
    {
        this.nombre = nombre;
        this.apellido = apellido;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object obj)
    {
        boolean rta = false;
        if(obj != null)
        {
            if(obj instanceof Persona)
            {
                Persona aux = (Persona) obj;
                if(aux.getNombre().equals(nombre) && aux.getApellido().equals(apellido) && aux.getDni().equals(dni))
                {
                    rta = true;
                }
            }
        }
        return rta;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString()
    {
        return "\nNombre: " + nombre
                +"\nApellido: " + apellido
                +"\nDNI: " + dni;
    }


    @Override
    public int compareTo(Object o) {
        int comparacion = 0;
        if(o != null)
        {
            if(o instanceof Persona)
            {
                Persona aux = (Persona) o;
                comparacion = aux.getDni().compareTo(dni);
            }
        }
        return comparacion;
    }
}
