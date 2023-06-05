package Models;

public class Lancha extends Barco implements IPescar{

    private int cantHoras;

    public Lancha()
    {
        super();
        this.cantHoras = 0;
    }

    public Lancha(String marca, String modelo, String patente, int capacidadCombustible, int capacidadCarga, int recolectado, boolean estado, int cantHoras) {
        super(marca, modelo, patente, capacidadCombustible, capacidadCarga, recolectado, estado);
        this.cantHoras = cantHoras;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    @Override
    public String toString() {
        return  super.toString() + "\nLancha{" +
                "cantHoras=" + cantHoras +
                '}';
    }

    @Override
    public boolean pescar() {
        boolean rta = false;

        if (super.getEstado())
        {
            rta = true;
            super.setRecolectado(cantHoras*20);
        }

        return rta;
    }
}
