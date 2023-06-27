package ModelsDominio;

import ModelsExcepcion.MiExepcion;

import java.util.*;

public class HashMapGenerico<K, V>
{
    private HashMap<K, V> map;

    public HashMapGenerico()
    {
        map = new HashMap<>();
    }

    public HashMapGenerico(HashMap<K, V> map)
    {
        this.map = map;
    }

    public HashMap<K, V> getMap()
    {
        return map;
    }

    public void setMap(HashMap<K, V> map) {
        this.map = map;
    }

    public void agregar(K clave, V dato)
    {
        try
        {
            if(map.containsKey(clave))
            {
                throw new MiExepcion("ERROR - usuario ya registrado ");
            }
            else
            {
                map.put(clave, dato);
            }
        }catch (MiExepcion ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }

    public String listar()
    {
        String info = "";
        Iterator it = map.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry mp = (Map.Entry) it.next();
            info += "\n" + mp.getValue();
        }
        return  info;
    }

    public ArrayList<V> returnValue()
    {
        ArrayList<V> datos = new ArrayList<>();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry mp = (Map.Entry) it.next();
            datos.add((V) mp.getValue());
        }
        return  datos;
    }







}
