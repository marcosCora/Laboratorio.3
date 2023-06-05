package ModelsPersonajes.Zombies;

public class Acechador extends Zombie{

    private int nivelArrojar;

    public Acechador() {
        super();
        this.nivelArrojar = 0;
    }

    public Acechador(String nombre, String skin, String arma, int nivelDeVida, int nivelArrojar) {
        super(nombre, skin, arma, nivelDeVida);
        this.nivelArrojar = nivelArrojar;
    }

    public int getNivelArrojar() {
        return nivelArrojar;
    }

    public void setNivelArrojar(int nivelArrojar) {
        this.nivelArrojar = nivelArrojar;
    }

    //metodo que acecha cosas y le aumenta el nivel de a 1
    public String acechar()
    {
        setNivelArrojar(getNivelArrojar()+1);
        return "TIRANDO COSAS";
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nAcechador{" +
                "nivelArrojar=" + nivelArrojar +
                '}';
    }
}
