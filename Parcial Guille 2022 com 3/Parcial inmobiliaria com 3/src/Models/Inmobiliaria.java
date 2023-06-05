package Models;

import java.util.ArrayList;
import java.util.SimpleTimeZone;

public class Inmobiliaria {

    private ArrayList<Propiedad> propiedades;

    public Inmobiliaria()
    {
        propiedades = new ArrayList<Propiedad>();
    }

    //metodo que agrega una propiedad a el arreglo de propiedades
    public void agregar(Propiedad propiedad)
    {
        propiedad.CalculoCostoVenta();
        propiedades.add(propiedad);
    }

    ///muestra una pripiedad
    public String imprimeUnaPropiedad(Propiedad p)
    {
        return p.toString();
    }

    //metodo que muestra el arrayList
    public String imprimePropiedades()
    {
        String info = "";
        for (int i=0; i<propiedades.size(); i++)
        {
            info += "\n" + imprimeUnaPropiedad(propiedades.get(i));
        }
        return info;
    }

    //metodo que busca una propiedad, buscandola atraves de la direccion retornando el indice
    public int buscaPosPropiedad(String direccion)
    {
        int pos = -1;
        int i = 0;
        while (i < propiedades.size() && pos == -1)
        {
            if(propiedades.get(i).getDireccion().equals(direccion))
            {
                pos = i;
            }
            i++;
        }
        return pos;
    }


    //metodo que elimina una propiedad
    //lo busca por la direccion y retorna la propiedad elimianda
    public String eliminoPropiedad(String direccion)
    {
        int pos = buscaPosPropiedad(direccion);
        String info = "";
        if(pos != -1)
        {
            info = propiedades.get(pos).toString();
            propiedades.remove(pos);
        }
        else
        {
            info = "\nLA PROPIEDAD INGRESADA NO EXISTE\n";
        }
        return info;
    }

    //funcion que le asigna un valor de alquiler a la propiedad que el usuario escogue
    //devuelve la informacion de la propiedad con sus valores

    public String alquilaPropiedad(int cantMese, String direccion)
    {
        int pos = buscaPosPropiedad(direccion);
        String info = "";
        if(pos != -1 && (propiedades.get(pos) instanceof Casa || propiedades.get(pos) instanceof Departamento))
        {
            ((ICostoAlquiler) propiedades.get(pos)).calculaCostoAlquiler(cantMese);
            info = propiedades.get(pos).toString();
        }
        else
        {
            info = "La propiedad ingresada no existe O es una oficina";
        }
        return info;
    }




}
