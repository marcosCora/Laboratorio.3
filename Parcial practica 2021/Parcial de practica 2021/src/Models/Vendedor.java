package Models;

public class Vendedor extends Empleado{

    private int cantVentas;

    public Vendedor()
    {
        super();
        this.cantVentas = 0;
    }

    public Vendedor(String nombre, String apellido, String direccion, int legajo, int fechaNacimiento, int salario, int cantVentas)
    {
        super(nombre, apellido, direccion, legajo, fechaNacimiento, salario);
        this.cantVentas = cantVentas;
    }

    public int getCantVentas()
    {
        return cantVentas;
    }

    public void setCantVentas(int cantVentas)
    {
        this.cantVentas = cantVentas;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "\nCantidad De Ventas: " + cantVentas;
    }


}
