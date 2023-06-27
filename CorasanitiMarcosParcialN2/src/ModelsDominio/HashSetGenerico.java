package ModelsDominio;

import ModelsExcepcion.MiExepcion;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetGenerico <V>
{
    private HashSet<V> set;

    public HashSetGenerico()
    {
        this.set = new HashSet<>();
    }


    public HashSetGenerico(HashSet set)
    {
        this.set = set;
    }

    public void agregar(V dato)
    {
        try {
            if(set.contains(dato))
            {
                throw new MiExepcion("ERROR - el rol ya se enceuntra cargado");
            }
            else
            {
                set.add(dato);
            }
        }
        catch (MiExepcion ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }


    }

    public int cuenta()
    {
        return set.size();
    }

    public String listar()
    {
        String info = "";
        Iterator it = set.iterator();
        while (it.hasNext())
        {
            String rol = (String) it.next();
            info += "\n" + rol;
        }
        return  info;
    }


    public void eliminar(V dato)
    {
        set.remove(dato);
    }




}
