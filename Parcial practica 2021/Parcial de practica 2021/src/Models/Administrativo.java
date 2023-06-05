package Models;

public class Administrativo extends Empleado {

    private String area;

    public Administrativo()
    {
        super();
        this.area = "";
    }

    public Administrativo(String nombre, String apellido, String direccion, int legajo, int fechaNacimiento, int salario, String area)
    {
        super(nombre, apellido, direccion, legajo, fechaNacimiento, salario);
        this.area = area;
    }

    public void getArea(String area)
    {
        this.area = area;
    }

    public String setArea()
    {
        return area;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "\nArea: "+area;
    }

}
