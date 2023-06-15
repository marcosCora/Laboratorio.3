package Models;

import java.util.HashSet;
import java.util.Iterator;
import java.util.PrimitiveIterator;

public class Almacenamiento <T>
{
    private HashSet<T> hashSet;

    public Almacenamiento()
    {
        this.hashSet = new HashSet<>();
    }

    public void agregar(T dato) throws MiExcepcion
    {
        if (!hashSet.add(dato))
        {
            throw new MiExcepcion("ERROR - dato ya ingresado");
        }
    }

    public T buscar(String titulo, String autor) throws MiExcepcion
    {
        Iterator it = hashSet.iterator();
        T encontrado = null;
        while (it.hasNext())
        {
            T dato = (T)it.next();
            if(dato.equals(titulo) && dato.equals(autor))
            {
                encontrado = dato;
            }
        }
        if(encontrado == null)
        {
            throw new MiExcepcion("ERROR - no encontrado");
        }
        return encontrado;
    }

    public String listar()
    {
        String info = "";
        Iterator it = hashSet.iterator();
        T dato = null;
        while (it.hasNext())
        {
            dato = (T)it.next();
            info = "\n" + dato.toString();
        }
        return toString();
    }

    public void elimiar(String titulo, String autor) throws MiExcepcion
    {
        Iterator it = hashSet.iterator();
        boolean flag= false;
        while (it.hasNext())
        {
            T dato = (T)it.next();
            if(dato.equals(titulo) && dato.equals(autor))
            {
                hashSet.remove(dato);
                flag = true;
            }
        }
        if(flag == false)
        {
            throw new MiExcepcion("ERROR - no encontrado");
        }
    }


}
