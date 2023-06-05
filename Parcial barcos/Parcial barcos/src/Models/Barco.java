package Models;

import java.util.PrimitiveIterator;

public class Barco {

    private String marca;
    private String modelo;
    private String patente;
    private int capacidadCombustible;
    private int capacidadCarga;
    private int recolectado; //almacena los kilos recolectados
    private boolean estado; //marca si el barco esta diponible para ir a pescar o no

    public Barco()
    {
        this.marca = "";
        this.modelo = "";
        this.patente = "";
        this.capacidadCombustible = 0;
        this.capacidadCarga = 0;
        this.recolectado = 0;
        this.estado = true;
    }

    public Barco(String marca, String modelo, String patente, int capacidadCombustible, int capacidadCarga, int recolectado, boolean estado)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.capacidadCombustible = capacidadCombustible;
        this.capacidadCarga = capacidadCarga;
        this.recolectado = recolectado;
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(int capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getRecolectado() {
        return recolectado;
    }

    public void setRecolectado(int recolectado) {
        this.recolectado = recolectado;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", patente='" + patente + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", capacidadCarga=" + capacidadCarga +
                ", recolectado=" + recolectado +
                ", estado=" + estado +
                '}';
    }
}
