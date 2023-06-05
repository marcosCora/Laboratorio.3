package Models;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPersona implements IMetodosCollection {

    private HashSet<Persona> personasH;

    public HashSetPersona()
    {
        personasH = new HashSet<>();
    }

    @Override
    public boolean agregar(Persona p)
    {
        boolean rta = true;
        if(!personasH.add(p))
        {
            rta = false;
        }
        return rta;
    }

    @Override
    public boolean eliminar(Persona p) {
        return personasH.remove(p);
    }

    @Override
    public Persona buscar(String dni) {

        Persona aux = null;
        Persona encontrado = null;
        boolean flag = true;

        Iterator it = personasH.iterator();

        while (it.hasNext() && flag)
        {
            aux = (Persona) it.next();
            if(aux.getDni().equals(dni))
            {
                encontrado = aux;
                flag = false;
            }
        }
        return encontrado;
    }

    @Override
    public String listar() {

        String info = "";
        Iterator it = personasH.iterator();
        Persona aux;
        while (it.hasNext())
        {
            aux = (Persona) it.next();
            info += "\n" + aux;
        }
        return info;
    }

    @Override
    public int contar() {
        int cont = 0;
        Iterator it = personasH.iterator();

        while (it.hasNext())
        {
            cont++;
            it.next();
        }

        return cont;
    }








}
