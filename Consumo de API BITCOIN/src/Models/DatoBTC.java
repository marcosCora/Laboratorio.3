package Models;

import java.io.Serializable;
import java.util.Date;

public class DatoBTC implements Serializable {

    private String fecha;
    private double precio;
    private double abierto;
    private double alto;
    private double changePercent;
    private String volumen;

    public DatoBTC() {
        this.fecha = "";
        this.precio = 0;
        this.abierto = 0;
        this.alto = 0;
        this.changePercent = 0;
        this.volumen = "";

    }
    public DatoBTC(String fecha, double precio, double abierto, double alto, double changePercent, String volumen) {
        this.fecha = fecha;
        this.precio = precio;
        this.abierto = abierto;
        this.alto = alto;
        this.changePercent = changePercent;
        this.volumen = volumen;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getAbierto() {
        return abierto;
    }

    public void setAbierto(double abierto) {
        this.abierto = abierto;
    }

    public double getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(double changePercent) {
        this.changePercent = changePercent;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "\nDatoBTC" +
                "\nfecha='" + fecha  +
                "\nprecio=" + precio +
                "\nabierto=" + abierto +
                "\nalto=" + alto +
                "\nchangePercent=" + changePercent +
                "\nvolumen='" + volumen;
    }
}
