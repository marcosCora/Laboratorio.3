package Models;

import java.util.Objects;

public abstract class Propiedad {

    private String direccion;
    private Persona propietario;
    private int precioBase;
    private int costoDeVenta;

    public Propiedad()
    {
        this.direccion = direccion;
        this.propietario = new Persona();
        this.precioBase = precioBase;
        this.costoDeVenta = costoDeVenta;
    }

    public Propiedad(String direccion, Persona propietario, int precioBase, int costoDeVenta)
    {
        this.direccion = direccion;
        this.propietario = propietario;
        this.precioBase = precioBase;
        this.costoDeVenta = costoDeVenta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public int getCostoDeVenta() {
        return costoDeVenta;
    }

    public void setCostoDeVenta(int costoDeVenta) {
        this.costoDeVenta = costoDeVenta;
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta = false;
        if (obj != null) {
            if (obj instanceof Propiedad) {
                Propiedad aux = (Propiedad) obj;
                if (precioBase == aux.precioBase && costoDeVenta == aux.costoDeVenta && Objects.equals(direccion, aux.direccion) && equals(aux.propietario)) {
                    rta = true;
                }
            }
        }
        return rta;
    }

    public String toString()
    {
        return "\nPropiedad:"
                +"\nPropietario:" + propietario.toString()
                +"\nDireccion: " + direccion
                +"\nPrecio base: " + precioBase
                +"\nCosto de venta: " + costoDeVenta;
    }


    public abstract void CalculoCostoVenta();

}
