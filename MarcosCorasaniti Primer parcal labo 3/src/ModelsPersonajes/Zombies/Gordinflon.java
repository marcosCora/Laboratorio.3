package ModelsPersonajes.Zombies;

public class Gordinflon extends Zombie implements ICamuflarse{

    private int cantPersonasComidas;//dice la cantidad de personas que se come

    public Gordinflon() {
        super();
        this.cantPersonasComidas = 0;
    }

    public Gordinflon(String nombre, String skin, String arma, int nivelDeVida, int cantPersonasComidas) {
        super(nombre, skin, arma, nivelDeVida);
        this.cantPersonasComidas = cantPersonasComidas;
    }

    public int getCantPersonasComidas() {
        return cantPersonasComidas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nGordinflon{" +
                "cantPersonasComidas=" + cantPersonasComidas +
                '}';
    }


    //este metodo recibe la cantidad de personas que el gordinflon se comio
    //y la suma a las que ya se habia comido antes
    public void comeindoPersonas(int personas)
    {
        cantPersonasComidas += personas;
    }

    @Override
    public String camuflarse()
    {
        return "ESTOY CAMUFLADO" ;
    }
}
