package Models;

import java.util.ArrayList;

public class Almacenamiento <E> implements IMetodos<E>
{

    private ArrayList<E> almacenamiento;

    public Almacenamiento()
    {
        almacenamiento = new ArrayList<>();
    }

    @Override
    public boolean agregar(E elemento)
    {
        return almacenamiento.add(elemento);
    }

    @Override
    public boolean eliminar(E datoEliminar)
    {
        return almacenamiento.remove(datoEliminar);
    }
    @Override
    public E buscar(E elemento)
    {
        E encontrado = null;
        int i = 0;

        if(elemento != null)
        {
            while (i < almacenamiento.size() && encontrado == null) {
                if (almacenamiento.get(i).equals(elemento)) {
                    encontrado = almacenamiento.get(i);
                }
                i++;
            }
        }
        return encontrado;
    }
    public String mostrar()
    {
        String info = "";
        for(E e : almacenamiento)
        {
            info += "\n" +e.toString();
        }
        return  info;
    }



}
