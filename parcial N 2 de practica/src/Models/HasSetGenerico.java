package Models;

import ModelsExcepciones.NotaRepetidaExcepcion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class HasSetGenerico <V> implements IMetodosColeccton
{
    private HashSet<V> set;
    private int limiteNotas;


    public HasSetGenerico()
    {
        this.set = new HashSet<>();
        this.limiteNotas = 0;
    }
    public HasSetGenerico(int limiteNotas)
    {
        this.set = new HashSet<>();
        this.limiteNotas = limiteNotas;
    }


    public HasSetGenerico(HashSet<V> set, int limiteNotas)
    {
        this.set = set;
        this.limiteNotas = limiteNotas;
    }

    public void agregar(V dato) throws NotaRepetidaExcepcion
    {
        if(set.contains(dato))
        {
            throw new NotaRepetidaExcepcion("ERROR - Nota ya ingresada", dato.toString());
        }
        else
        {
            set.add(dato);
        }
    }

    @Override
    public int contar()
    {
        return set.size();
    }

    @Override
    public String listar() {

        String info = "";
        Iterator it = set.iterator();
        while (it.hasNext())
        {
            V aux = (V)it.next();
            info += "\n" + aux.toString();
        }
        return info;
    }

    public void eliminar(V dato)
    {
        if(set.contains(dato))
        {
          set.remove(dato);
        }
        else
        {
            //lanzo excepcion
        }
    }

    public ArrayList<V> setToArrayList()
    {
        Iterator it = set.iterator();
        ArrayList<V> arrayList = new ArrayList<>();

        while (it.hasNext())
        {
            V aux = (V) it.next();
            arrayList.add((V) aux);
        }
        return arrayList;
    }



}
