package ModelsPersonajes.Zombies;

import ModelsPersonajes.Personaje;

public abstract class Zombie extends Personaje {

    public Zombie()
    {
        super();
    }

    public Zombie(String nombre, String skin, String arma, int nivelDeVida)
    {
        super(nombre, skin, arma, nivelDeVida);
    }

    public String morder()
    {
        return "MORDIENDO";
    }

    @Override
    public boolean equals(Object obj)
    {
        boolean rta = false;
        if(obj != null)
        {
            if(obj instanceof Zombie)
            {
                if(super.equals(obj))
                {
                    rta = true;
                }
            }
        }
        return rta;
    }

}
