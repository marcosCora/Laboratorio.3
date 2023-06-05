package ModelsPersonajes.Zombies;

public class Chasqueador extends Zombie{

    private int velocidadDeChasqueo;

    public Chasqueador() {
        super();
        this.velocidadDeChasqueo = 30;
    }

    public Chasqueador(String nombre, String skin, String arma, int nivelDeVida) {
        super(nombre, skin, arma, nivelDeVida);
        this.velocidadDeChasqueo = 30;
    }

    public Chasqueador(String nombre, String skin, String arma, int nivelDeVida, int velocidadDeChasqueo) {
        super(nombre, skin, arma, nivelDeVida);
        this.velocidadDeChasqueo = velocidadDeChasqueo;
    }

    public int getVelocidadDeChasqueo() {
        return velocidadDeChasqueo;
    }

    public void setVelocidadDeChasqueo(int velocidadDeChasqueo) {
        this.velocidadDeChasqueo = velocidadDeChasqueo;
    }

    ///MODIFICAR
    //metodo que aumenta el nivel de chasqueo de un chasqueador
    public void aumentaNivelChasqueo(int nivel)
    {
        velocidadDeChasqueo += nivel;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nChasqueador{" +
                "velocidadDeChasqueo=" + velocidadDeChasqueo +
                '}';
    }
}
