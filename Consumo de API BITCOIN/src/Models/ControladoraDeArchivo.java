package Models;

import java.io.*;
import java.util.ArrayList;

public class ControladoraDeArchivo <T>
{
    private ArrayList<T> datos;

    public ControladoraDeArchivo() {
        datos = new ArrayList<>();
    }

    public ControladoraDeArchivo(ArrayList<T> datos) {
        this.datos = datos;
    }

    public void guardarArchivo()
    {

        FileOutputStream file = null;
        ObjectOutputStream entrada = null;

        try {
            file = new FileOutputStream("DatosBtc.dat");
            entrada = new ObjectOutputStream(file);

            for (T dato : datos)
            {
                entrada.writeObject(dato);
            }

        }
        catch (IOException ex)
        {
            System.out.println("ERROR ENTRADA " + ex.getMessage());
        }
        finally {
            try {
                if(file != null)
                {
                    file.close();
                }
                if(entrada != null)
                {
                    entrada.close();
                }
            }
            catch (IOException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }

    public ArrayList<T> leerArchivo(ArrayList<T> datos)
    {
        FileInputStream file = null;
        ObjectInputStream salida = null;

        try {
            file = new FileInputStream("DatosBtc.dat");
            salida = new ObjectInputStream(file);

            while (true)
            {
                T dato = (T) salida.readObject();
                datos.add(dato);
            }

        }
        catch (EOFException ex)
        {
            System.out.println("Fin del archivo");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally {
            try {
                if(file != null)
                {
                    file.close();
                }
                if(salida != null)
                {
                    salida.close();
                }
            }
            catch (IOException ex)
            {
                System.out.println(ex.getMessage());
            }

        }
        return datos;
    }



}
