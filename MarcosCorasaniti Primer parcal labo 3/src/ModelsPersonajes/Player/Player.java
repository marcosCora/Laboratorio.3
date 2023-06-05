package ModelsPersonajes.Player;

import ModelsPersonajes.Personaje;
import ModelsPersonajes.Zombies.Zombie;

public abstract class  Player extends Personaje
{

    public Player()
    {
        super();
    }

    public Player(String nombre, String skin, String arma, int nivelDeVida) {
        super(nombre, skin, arma, nivelDeVida);
    }

    //este metodo aumenta la vida con una cantidad predeterminada por el juego
    public String curarse()
    {
        int vida = super.getNivelDeVida() * 4;
        super.setNivelDeVida(vida);
        return "Me estoy curando";
    }

    public String recargarArma()
    {
        return "Se esta recargando el arma";
    }

    @Override
    public boolean equals(Object obj)
    {
        boolean rta = false;
        if(obj != null)
        {
            if(obj instanceof Player)
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
