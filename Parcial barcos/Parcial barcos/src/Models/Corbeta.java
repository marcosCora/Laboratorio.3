package Models;

public class Corbeta extends Barco implements IPescar{
    private int cantJaulas;

    public Corbeta()
    {
        super();
        this.cantJaulas = 0;
    }

    public Corbeta(String marca, String modelo, String patente, int capacidadCombustible, int capacidadCarga, int recolectado, boolean estado, int cantJaulas) {
        super(marca, modelo, patente, capacidadCombustible, capacidadCarga, recolectado, estado);
        this.cantJaulas = cantJaulas;
    }

    public int getCantJaulas() {
        return cantJaulas;
    }

    public void setCantJaulas(int cantJaulas) {
        this.cantJaulas = cantJaulas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCorbeta{" +
                "cantJaulas=" + cantJaulas +
                '}';
    }

    @Override
    public boolean pescar() {

    }
}
