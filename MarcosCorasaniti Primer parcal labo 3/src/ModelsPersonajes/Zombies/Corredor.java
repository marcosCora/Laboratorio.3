package ModelsPersonajes.Zombies;

public class Corredor extends Zombie {
    //este artibuto almacena el nivel de volcidad del zombie corredor
    private int nivelDeVelocidad;


    //el nivel de volocidad de un zombie siempre comienza en 10
    public Corredor() {
        super();
        this.nivelDeVelocidad = 10;
    }

    public Corredor(String nombre, String skin, String arma, int nivelDeVida) {
        super(nombre, skin, arma, nivelDeVida);
        this.nivelDeVelocidad = 10;
    }

    public Corredor(String nombre, String skin, String arma, int nivelDeVida, int nivelDeVelocidad) {
        super(nombre, skin, arma, nivelDeVida);
        this.nivelDeVelocidad = nivelDeVelocidad;
    }

    public void setNivelDeVelocidad(int nivelDeVelocidad) {
        this.nivelDeVelocidad = nivelDeVelocidad;
    }

    public int getNivelDeVelocidad() {
        return nivelDeVelocidad;
    }

    ///lo que hace este metodo es que dependiendo el nivel de vida del zombie es depende cuanto baja
    //nivel de veolocidad
    public void refactorizaNivelDevolcidad()
    {
        if(super.getNivelDeVida() < 50)
        {
            nivelDeVelocidad = nivelDeVelocidad - 3;
        }
        else if(super.getNivelDeVida() < 20)
        {
            nivelDeVelocidad = nivelDeVelocidad - 8;
        }
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nCorredor{" +
                "nivelDeVelocidad=" + nivelDeVelocidad +
                '}';
    }
}
