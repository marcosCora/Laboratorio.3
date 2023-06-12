package Models;

import java.io.*;
import java.util.ArrayList;

public class ControladoraArchivo <T>
{
    private ArrayList<T> datosArray;

    public ControladoraArchivo()
    {
        this.datosArray = new ArrayList<>();
    }
    public ControladoraArchivo(ArrayList<T> datosArray)
    {
        this.datosArray = datosArray;
    }

    public void guardar(String nombreArch)
    {
        FileOutputStream fileDatos = null;
        ObjectOutputStream objDatos =null;
        try
        {
            fileDatos = new FileOutputStream(nombreArch);
            objDatos = new ObjectOutputStream(fileDatos);

            for(T dato : datosArray)
            {
                objDatos.writeObject(dato);
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally {
            try
            {
                if(fileDatos != null && objDatos != null)
                {
                    fileDatos.close();
                    objDatos.close();
                }
            }
            catch (IOException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void leer(ArrayList<T> datos, String nombreArch)
    {
        FileInputStream fileDatos = null;
        ObjectInputStream objDatos =null;
        try
        {
            fileDatos = new FileInputStream(nombreArch);
            objDatos = new ObjectInputStream(fileDatos);
            while (true)
            {
                T dato = (T)objDatos.readObject();
                datos.add(dato);
            }
        }
        catch (EOFException ex)
        {
            System.out.println("FIN ARCHIVO");
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
            try
            {
                if(fileDatos != null && objDatos != null)
                {
                    fileDatos.close();
                    objDatos.close();
                }
            }
            catch (IOException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }







}
