package Models;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public class Nota
{
    private int nota;
    private int instancia;
    private String fecha;

    public Nota()
    {
        this.nota = 0;
        this.instancia = 0;
        this.fecha = "";
    }

    public Nota(int nota, int instancia, String fecha)
    {
        this.nota = nota;
        this.instancia = instancia;
        this.fecha = fecha;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getInstancia() {
        return instancia;
    }

    public void setInstancia(int instancia) {
        this.instancia = instancia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object obj)
    {
        boolean rta = false;
        if(obj != null)
        {
            if(obj instanceof Nota)
            {
                Nota aux = (Nota) obj;
                if(nota == aux.nota && instancia == aux.instancia && Objects.equals(fecha, aux.fecha))
                {
                    rta = true;
                }
            }
        }
        return rta;
       }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString()
    {
        return "\nNota" +
                "\nnota=" + nota +
                "\ninstancia=" + instancia +
                "\nfecha='" + fecha;
    }

    public JSONObject toJsonNota()throws JSONException
    {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("nota", nota);
        jsonObject.put("instancia", instancia);
        jsonObject.put("fecha", fecha);

        return jsonObject;
    }



}



