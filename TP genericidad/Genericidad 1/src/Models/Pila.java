package Models;

import java.util.ArrayList;

public class Pila<E> implements IMetodos<E>{

    ArrayList<E> Pila;

    public Pila()
    {
        Pila = new ArrayList<>();
    }


    @Override
    public boolean agregar(E elemento)
    {
        return Pila.add(elemento);
    }

    @Override
    public boolean eliminar(E elemento)
    {
        return Pila.remove(elemento);
    }

    @Override
    public E buscar(E elemto) {

        E encontrado = null;
        int i = 0;

        if(Pila != null)
        {
            while (i < Pila.size() && encontrado == null) {
                if (Pila.get(i).equals(Pila)) {
                    encontrado = Pila.get(i);
                }
                i++;
            }
        }
        return encontrado;


    }

    @Override
    public String mostrar()
    {
        String info = "";
        info += "\n................BASE.................";
        for(E e : Pila)
        {
            info += "\n" +e.toString();
        }
        info += "\n................TOPE.................";
        return  info;
    }

    public String tope()
    {
        return Pila.get(Pila.size()-1).toString();
    }

    public boolean eliminaTope()
    {
        return Pila.remove(Pila.get(Pila.size()-1));
    }


}
