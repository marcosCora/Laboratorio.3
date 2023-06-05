package Models;

public class Departamento extends Propiedad implements ICostoAlquiler{

    private int cantAmbientes;
    private int costoDeAlquiler;

    public Departamento()
    {
        super();
        this.cantAmbientes = 0;
        this.costoDeAlquiler = 0;
    }

    public Departamento(String direccion, Persona propietario, int precioBase, int costoDeVenta, int cantAmbientes, int costoDeAlquiler) {
        super(direccion, propietario, precioBase, costoDeVenta);
        this.cantAmbientes = cantAmbientes;
        this.costoDeAlquiler = costoDeAlquiler;
    }

    public int getCantAmbientes() {
        return cantAmbientes;
    }

    public void setCantAmbientes(int cantAmbientes) {
        this.cantAmbientes = cantAmbientes;
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
                "\nCantidad de ambientes: " + cantAmbientes
                +"\nValor de alquiler: " + costoDeAlquiler;
    }

    @Override
    public void CalculoCostoVenta()
    {
        super.setCostoDeVenta(cantAmbientes * super.getPrecioBase());
    }

    public void calculaCostoAlquiler(int cantMeses) {
        costoDeAlquiler = cantMeses*super.getPrecioBase();
    }

    @Override
    public void aumentaCostoDeAlquiler() {
        costoDeAlquiler += costoDeAlquiler*0.1;
    }
}
