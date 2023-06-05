package clases;

import java.util.Arrays;

public class Dome {

    private Elemento elementos[];
    private int vElementos;

    public Dome()
    {
        elementos = new Elemento[100];
        vElementos = 0;
    }

    ///metodo que agrega un elemento al Dome
    public void agregaElemento(Elemento elemento)
    {

        if(vElementos < elementos.length)
        {
            elementos[vElementos] = elemento;
            vElementos++;
        }
    }

    //muestra toda la informacion que contiene el arreglo de elementos
    public String muestaElementos()
    {
        String informacion = "";

        for (int i = 0; i<vElementos;i++)
        {
            informacion += elementos[i].imprimir();
        }
        return informacion;
    }

    //metodo que imprime todos los elementos del arreglo
    public String muestaElementosCD()
    {
        String informacion = "";

        for (int i = 0; i<vElementos;i++)
        {
            if(elementos[i] instanceof CD)
            {
                informacion += elementos[i].imprimir();
            }
        }
        return informacion;
    }

    public String muestraElementosDVD()
    {
        String informacion = "";
        for (int i = 0; i<vElementos;i++)
        {
            if(elementos[i] instanceof DVD)
            {
                informacion += elementos[i].imprimir();
            }
        }
        return informacion;
    }




}
