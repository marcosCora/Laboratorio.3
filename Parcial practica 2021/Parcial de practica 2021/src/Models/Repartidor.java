package Models;

import java.util.Objects;

public class Repartidor {

    private String nombreCompleto;
    private int idRepartidor;

    public Repartidor()
    {
        this.nombreCompleto = "";
        this.idRepartidor = 0;
    }
    public Repartidor(String nombreCompleto, int idRepartidor)
    {
        this.nombreCompleto = nombreCompleto;
        this.idRepartidor = idRepartidor;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(int idRepartidor) {
        this.idRepartidor = idRepartidor;
    }


    @Override
    public boolean equals(Object obj)
    {
        boolean rta = false;

        if(obj != null)
        {


        }

        return rta;
    }

    /**
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repartidor that = (Repartidor) o;
        return idRepartidor == that.idRepartidor && Objects.equals(nombreCompleto, that.nombreCompleto);
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(nombreCompleto, idRepartidor);
    }

    @Override
    public String toString() {
        return "\nRepartidor" +
                "\nNombre Completo: " +nombreCompleto
                +"\nID Repartidor: " +idRepartidor;
    }
}
