package Models;

import java.util.ArrayList;

public class Gestora {

    private ArrayList<Empleado> empleados;

    public Gestora()
    {
        empleados = new ArrayList<Empleado>();
    }

    public void agregarEmpleado(Empleado empleado)
    {
        empleado.setSalario(empleado.calculoSalario(empleado.getSalario()));
        empleados.add(empleado);
    }

    public String imprimirEmpleados()
    {
        String informacion = "";
        for(int i=0; i<empleados.size(); i++)
        {
            informacion += empleados.get(i).toString();
        }
        return informacion;
    }

    //imprime un tipo de empleado resivido por parametro
    public String imprimeTipoDeEmpleado(String tipoEmpleado)
    {
        String informacion = "";

        if(tipoEmpleado.equals("EAsalariado"))
        {
            for(int i=0; i<empleados.size(); i++)
            {
                if(empleados.get(i) instanceof EAsalariado)
                {
                    informacion += empleados.get(i).toString();
                }
            }
        }
        else if(tipoEmpleado.equals("EComision"))
        {
            for (int i = 0; i < empleados.size(); i++) {
                if (empleados.get(i) instanceof EComision) {
                    informacion += empleados.get(i).toString();
                }
            }
        }
        return informacion;
    }


    //funcion que busca y retorna el empleado con mayor sueldo
    public String buscaEmpleadoMayorSueldo()
    {
        String empleado = "";
        float salarioMayor=0;

        for(int i=0; i<empleados.size(); i++)
        {
            if(salarioMayor < empleados.get(i).getSalario())
            {
                salarioMayor = empleados.get(i).getSalario();
                empleado = empleados.get(i).toString();
            }
        }

        return empleado;
    }






}
