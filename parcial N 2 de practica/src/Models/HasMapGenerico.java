package Models;

import ModelsExcepciones.MateriaRepetidaExcepcion;
import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HasMapGenerico <K,V> implements IMetodosColeccton
{
    private HashMap<K,V> map;


    public HasMapGenerico()
    {
        map = new HashMap<>();
    }
    public HasMapGenerico(HashMap<K, V> map) {
        this.map = map;
    }

    public void agregar(K clave, V valor) throws MateriaRepetidaExcepcion
    {
        if(map.containsKey(clave))
        {
            throw new MateriaRepetidaExcepcion("ERROR - materia ya ingresada", clave.toString());
        }
        else
        {
            map.put(clave, valor);
        }
    }


    @Override
    public int contar()
    {
        return map.size();
    }

    @Override
    public String listar()
    {
        Iterator it = map.entrySet().iterator();
        String info = "";


        while (it.hasNext())
        {
            Map.Entry me = (Map.Entry) it.next();
            info += "\n" + me.getValue().toString();
        }

        return info;
    }


    public void eliminar(K clave, V valor)
    {
        if(map.containsKey(clave))
        {
            map.remove(clave);
        }
        else
        {
            //lanzo una excepcion
        }
    }

    public ArrayList<V> mapToArrayList()
    {
        Iterator it = map.entrySet().iterator();
        ArrayList<V> arrayList = new ArrayList<>();

        while (it.hasNext())
        {
            Map.Entry me = (Map.Entry) it.next();
            arrayList.add((V) me.getValue());
        }
        return arrayList;
    }








}
