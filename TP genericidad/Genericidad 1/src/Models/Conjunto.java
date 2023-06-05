package Models;

import java.util.HashSet;
import java.util.Iterator;

public class Conjunto<E> implements IMetodos<E>{

    private HashSet<E> conjunto;

    public Conjunto()
    {
        conjunto = new HashSet<>();
    }


    @Override
    public boolean agregar(E elemento) {
        return conjunto.add(elemento);
    }

    @Override
    public boolean eliminar(E elemento) {
        return conjunto.remove(elemento);
    }

    @Override
    public E buscar(E elemento) {

        Iterator it = conjunto.iterator();
        E aux = null;
        E encontrado = null;

        while (it.hasNext() && encontrado == null)
        {
            aux = (E)it.next();
            if(elemento.equals(aux))
            {
                encontrado = aux;
            }
        }


        return encontrado;
    }

    @Override
    public String mostrar() {
        String info = "";
        Iterator it = conjunto.iterator();
        while (it.hasNext())
            {
                info += "\n" + it.next().toString();
            }
        return info;
    }
}
