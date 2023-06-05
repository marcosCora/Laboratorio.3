package Models;

import java.util.Objects;

public class Persona implements Comparable<Persona> {

    private String nombreCompleto;
    private String dni;
    private String direccion;

    public Persona()
    {
        this.nombreCompleto = "";
        this.dni = "";
        this.direccion = "";
    }

    public Persona(String nombreCompleto, String dni, String direccion)
    {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.direccion = direccion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object obj) {

        boolean rta = false;
        if (obj != null) {
            if (obj instanceof Persona) {
                Persona aux = (Persona) obj;
                if (aux.getNombreCompleto().equals(nombreCompleto) && aux.getDni().equals(dni)) {
                    rta = true;
                }
            }
        }

        return rta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreCompleto, dni, direccion);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }


    @Override
    public int compareTo(Persona obj) {
        int comparacion = 0;
        if(obj != null)
        {
            if(obj instanceof Persona)
            {
                Persona aux = (Persona) obj;
                comparacion = aux.getDni().compareTo(dni);
            }
        }
        return comparacion;
    }


}
