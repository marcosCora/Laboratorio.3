package ModelsPersonajes.Player;

public class Ellie extends Player{

    private int gradoDeHumor;//a mayor grado mayor el mal humor
    private int cantChistesMalos;

    public Ellie() {
        super();
        this.gradoDeHumor = 0;
        this.cantChistesMalos = 0;
    }

    public Ellie(String nombre, String skin, String arma, int nivelDeVida, int gradoDeHumor, int cantChistesMalos) {
        super(nombre, skin, arma, nivelDeVida);
        this.gradoDeHumor = gradoDeHumor;
        this.cantChistesMalos = cantChistesMalos;
    }

    public int getGradoDeHumor() {
        return gradoDeHumor;
    }

    public void setGradoDeHumor(int gradoDeHumor) {
        this.gradoDeHumor = gradoDeHumor;
    }

    public int getCantChistesMalos() {
        return cantChistesMalos;
    }

    public void setCantChistesMalos(int cantChistesMalos) {
        this.cantChistesMalos = cantChistesMalos;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nJoel{" +
                "gradoDeHumor=" + gradoDeHumor +
                ", cantChistesMalos=" + cantChistesMalos +
                '}';
    }
}
