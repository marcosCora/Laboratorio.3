import Models.GestoraPersonaje;
import Models.Origin;
import Models.Personaje;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {

        GestoraPersonaje gestora = new GestoraPersonaje();
        //System.out.println(ConsumoAPI.getInfo());
        //fromJson(gestora);
        //gestora.muestraGestora();

        //JSONArray json = gestora.toJson();
        //System.out.println(json.toString());

        //gestora.guardaPersonajeArch();
        gestora.leerPersonajesArch();
        //gestora.muestraGestora();

        JsonUtiles.grabar(gestora.toJson(), "archivoJson");

        try {
            JSONArray jsonArray = new JSONArray(JsonUtiles.leer("archivoJson"));
            for(int i=0; i<jsonArray.length(); i++)
            {
                JSONObject jsonObjectPersonaje = jsonArray.getJSONObject(i);
                gestora.fromJsonPersonaje(jsonObjectPersonaje);
            }


        }
        catch (JSONException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public static void fromJson(GestoraPersonaje gestora)
    {
        try {
            JSONObject jsonObject = new JSONObject(ConsumoAPI.getInfo());
            JSONObject jsonObject = new JSONObject(ConsumoAPI.getInfo());
            JSONArray resultsJsonArray = jsonObject.getJSONArray("results");

            for(int i=0; i<resultsJsonArray.length(); i++)
            {
                JSONObject jsonObjectPersonaje = resultsJsonArray.getJSONObject(i);
                gestora.fromJsonPersonaje(jsonObjectPersonaje);
            }
        }
        catch (JSONException ex)
        {
            System.out.println("ERROR DECODIDICADO DE JSON" + ex.getMessage());
        }
    }



}