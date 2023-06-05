package ModelsPersonajes.Player;

public class Joel extends Player {

    private int malaOnda; //a mayor numero mas mala onda
    private int testarudo;//a meyor numero mas testarudo

    public Joel() {
        super();
        this.malaOnda = 0;
        this.testarudo = 0;
    }

    public Joel(String nombre, String skin, String arma, int nivelDeVida, int malaOnda, int testarudo) {
        super(nombre, skin, arma, nivelDeVida);
        this.malaOnda = malaOnda;
        this.testarudo = testarudo;
    }

    public int getMalaOnda() {
        return malaOnda;
    }

    public void setMalaOnda(int malaOnda) {
        this.malaOnda = malaOnda;
    }

    public int getTestarudo() {
        return testarudo;
    }

    public void setTestarudo(int testarudo) {
        this.testarudo = testarudo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nJoel{" +
                "malaOnda=" + malaOnda +
                ", testarudo=" + testarudo +
                '}';
    }


}
