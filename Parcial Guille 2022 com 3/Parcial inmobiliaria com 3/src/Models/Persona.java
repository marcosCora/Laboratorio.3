package Models;

import java.util.Objects;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.dni = 0;
    }

    public Persona(String nombre, String apellido, int dni) {
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    ///toString
    public String toString()
    {
        return "\nNombre: " + nombre
                + "\nApellido: " + apellido
                + "\nDNI: " + dni;
    }



    ///equals
    @Override
    public boolean equals(Object obj) {
        boolean rta = false;
        if (obj != null) {
            if (obj instanceof Persona) {
                Persona aux = (Persona) obj;
                if (nombre.equals(aux.getNombre()) && apellido.equals(aux.getApellido()) && dni == aux.getDni()) {
                    rta = true;
                }
            }
        }
        return rta;
    }

}
