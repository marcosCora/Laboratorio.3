import ModelsObjetos.Objeto;
import ModelsPersonajes.Personaje;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Personaje> personajes;
    private ArrayList<Objeto> objetos;

    public Juego() {
        this.personajes = new ArrayList<Personaje>();
        this.objetos = new ArrayList<Objeto>();
    }

    public void agregarPersonaje(Personaje p)
    {
        personajes.add(p);
    }

    public void agregarObjeto(Objeto obj)
    {
        objetos.add(obj);
    }

    public String imprimePersonajes()
    {
        String info = "";
        for(int i=0; i<personajes.size();i++)
        {
            info += "\n\n" + personajes.get(i).toString();
        }
        return info;
    }

    public String imprimeObjetos()
    {
        String info = "";
        for(int i=0; i<objetos.size();i++)
        {
            info += "\n\n" + objetos.get(i).toString();
        }
        return info;
    }


}
