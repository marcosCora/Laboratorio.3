package Models;

public class Oficina extends Propiedad{

    private int cantBoxes;

    public Oficina()
    {
        super();
        this.cantBoxes = cantBoxes;
    }

    public Oficina(String direccion, Persona propietario, int precioBase, int costoDeVenta, int cantBoxes) {
        super(direccion, propietario, precioBase, costoDeVenta);
        this.cantBoxes = cantBoxes;
    }

    public int getCantBoxes() {
        return cantBoxes;
    }

    public void setCantBoxes(int cantBoxes) {
        this.cantBoxes = cantBoxes;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCantidad de boxes: " + cantBoxes;
    }

    @Override
    public void CalculoCostoVenta()
    {
        super.setCostoDeVenta(cantBoxes * super.getPrecioBase());
    }

}
