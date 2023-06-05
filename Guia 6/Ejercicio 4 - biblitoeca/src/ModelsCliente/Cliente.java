package ModelsCliente;

import ModelsBiblioteca.Elemento;

import java.util.ArrayList;

public class Cliente {

    private String nombreYApellido;
    private int dni;
    private int idCliente;
    private ArrayList<Elemento> elementos;

    public Cliente()
    {
        this.nombreYApellido = "";
        this.dni = 0;
        this.idCliente = 0;
        this.elementos = new ArrayList<Elemento>();
    }

    public Cliente(String nombreYApellido, int dni, int idCliente)
    {
        this.nombreYApellido = nombreYApellido;
        this.dni = dni;
        this.idCliente = idCliente;
        this.elementos = new ArrayList<Elemento>();
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<Elemento> elementos) {
        this.elementos = elementos;
    }

    public String imprimeLibrosPosee()
    {
        String info = "";
        for(int i=0; i<elementos.size(); i++)
        {
            info += " / " + elementos.get(i).getTitulo() + elementos.get(i).getAnioPublicacion() +elementos.get(i).getCodigo();
        }
        return info;
    }

    public String toString()
    {
        return "\nNombre comleto: " + nombreYApellido
                + "\nDNI: " + dni
                + "\nID cliente: " + idCliente
                + "Libros en posecion: \n" + imprimeLibrosPosee();
    }


}
