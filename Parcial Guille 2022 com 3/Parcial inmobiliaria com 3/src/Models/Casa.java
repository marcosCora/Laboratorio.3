package Models;

public class Casa extends Propiedad implements ICostoAlquiler{
    private int cantPisos;
    private int costoDeAlquiler;

    public Casa()
    {
        super();
        this.cantPisos = 0;
        this.costoDeAlquiler = 0;
    }

    public Casa(String direccion, Persona propietario, int precioBase, int costoDeVenta, int cantPisos, int costoDeAlquiler)
    {
        super(direccion, propietario, precioBase, costoDeVenta);
        this.cantPisos = cantPisos;
        this.costoDeAlquiler = costoDeAlquiler;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public int getCostoDeAlquiler() {
        return costoDeAlquiler;
    }

    public void setCostoDeAlquiler(int costoDeAlquiler) {
        this.costoDeAlquiler = costoDeAlquiler;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCantidad de pisos: " + cantPisos
                +"\nValor de alquiler: " + costoDeAlquiler;
    }

    @Override
    public void CalculoCostoVenta()
    {
        super.setCostoDeVenta(cantPisos * super.getPrecioBase());
    }

    @Override
    public void calculaCostoAlquiler(int cantMeses) {
        costoDeAlquiler = cantMeses*super.getPrecioBase();
    }

    @Override
    public void aumentaCostoDeAlquiler() {
        costoDeAlquiler += costoDeAlquiler*0.1;
    }

}
