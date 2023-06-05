package Models;

import java.util.Iterator;
import java.util.SimpleTimeZone;
import java.util.TreeSet;

public class TreeSetPersona implements IMetodosCollection{

    private TreeSet<Persona> personasT;

    public TreeSetPersona()
    {
        personasT = new TreeSet<Persona>();
    }


    @Override
    public boolean agregar(Persona p) {
        return personasT.add(p);
    }

    @Override
    public boolean eliminar(Persona p) {
        return personasT.remove(p);
    }

    @Override
    public Persona buscar(String dni) {

        Persona aBuscar = null;
        Persona aux = null;
        Iterator it = personasT.iterator();

        while (it.hasNext() && aBuscar == null)
        {
            aux = (Persona) it.next();
            if(aux.getDni().equals(dni))
            {
                aBuscar = aux;
            }
        }

        return aBuscar;
    }

    @Override
    public String listar() {
        String info = "";

        for(Persona p: personasT)
        {
            info += p.toString();
        }

        return info;
    }

    @Override
    public int contar() {
        return 0;
    }
}
