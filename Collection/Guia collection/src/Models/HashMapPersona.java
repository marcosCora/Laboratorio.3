package Models;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapPersona implements IMetodosCollection{

    private HashMap<String, Persona> personasHashM;

    public HashMapPersona()
    {
        personasHashM = new HashMap<>();
    }


    @Override
    public boolean agregar(Persona p) {

        boolean rta = false;
        if(!personasHashM.containsKey(p.getDni()))
        {
            personasHashM.put(p.getDni(), p);
        }
        return rta;
    }

    @Override
    public boolean eliminar(Persona p) {
        return false;
    }

    @Override
    public Persona buscar(String dni) {
        return null;
    }

    @Override
    public String listar() {

        String info = "";
        Iterator<Map.Entry<String, Persona>> it = personasHashM.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry<String, Persona> entrada = it.next();
            info += entrada.getKey() + entrada.getValue() + "\n\n";
        }
        return info;
    }

    @Override
    public int contar() {
        return 0;
    }
}
