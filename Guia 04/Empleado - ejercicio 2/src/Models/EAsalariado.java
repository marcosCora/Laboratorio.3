package Models;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EAsalariado extends Empleado
{
    private float porcentajeAdicional;

    public EAsalariado()
    {
        super();

        this.porcentajeAdicional = 0;
    }

    public EAsalariado(String nombre, String apellido, int dni, int anioIngreso, float salario)
    {
        super(dni, nombre, apellido, anioIngreso, salario);
        this.porcentajeAdicional = 0;
    }



    public float getPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public void setPorcentajeAdicional(float porcentajeAdicional) {
        this.porcentajeAdicional = porcentajeAdicional;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPorcentaje agregado: " + porcentajeAdicional + "\n\n";
    }


    @Override
    public float calculoSalario(float salario)
    {
        int antiguedad = super.calculaAntiguedad();

        if(antiguedad >= 2 && antiguedad <= 3)
        {
            salario += salario * 0.05;
            setPorcentajeAdicional((float) (salario*0.05));

        } else if (antiguedad >= 4 && antiguedad <= 7)
        {
            salario += salario * 0.1;
            setPorcentajeAdicional((float) (salario*0.1));

        } else if (antiguedad >= 8 && antiguedad <= 15)
        {
            salario += salario * 0.15;
            setPorcentajeAdicional((float) (salario*0.15));
        }
        else
        {
            salario += salario * 0.2;
            setPorcentajeAdicional((float) (salario*0.2));
        }

        return  salario;

    }
}
