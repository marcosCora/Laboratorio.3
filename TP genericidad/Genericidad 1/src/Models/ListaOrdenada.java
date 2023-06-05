package Models;

import java.util.ArrayList;
import java.util.Collections;


public class ListaOrdenada <E extends Comparable<E>> implements IMetodos<E>
{


    private ArrayList<E> listaOrdenada;


    public ListaOrdenada()
    {
        listaOrdenada = new ArrayList<>();
    }

    @Override
    public boolean agregar(E elemento) {
        boolean rta = listaOrdenada.add(elemento);
        Collections.sort(listaOrdenada);
        return  rta;
    }

    @Override
    public boolean eliminar(E elemento) {
        return listaOrdenada.remove(elemento);
    }

    @Override
    public E buscar(E elemento) {

        E encontrado = null;
        int i = 0;

        if(elemento != null)
        {
            while (i < listaOrdenada.size() && encontrado == null) {
                if (listaOrdenada.get(i).equals(elemento)) {
                    encontrado = listaOrdenada.get(i);
                }
                i++;
            }
        }
        return encontrado;
    }

    @Override
    public String mostrar() {
        String info = "";
        for(E e : listaOrdenada)
        {
            info += "\n" +e.toString();
        }
        return  info;
    }
}
