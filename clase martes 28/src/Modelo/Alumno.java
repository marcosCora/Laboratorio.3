package Modelo;

import javax.swing.*;

public class Alumno {

    //atributos
    private String nombre;
    private String apellido;
    private int legajo;


    //constructores
    public Alumno()
    {
        this.nombre = "";
        this.apellido = "";
        this.legajo = 0;
    }

    public Alumno(String nombre, String apellido, int legajo)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    //geters
    public String getNombre()
    {
        return nombre;
    }
    public String getApellido()
    {
        return apellido;
    }
    public int getLegajo()
    {
        return legajo;
    }

    //seters
    public void setLegajo(int legajo)
    {
        this.legajo = legajo;
    }

    //metodos




}
