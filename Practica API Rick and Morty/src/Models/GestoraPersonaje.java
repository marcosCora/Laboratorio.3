package Models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class GestoraPersonaje {

    private ArrayList<Personaje> personajes;

    public GestoraPersonaje()
    {
        personajes = new ArrayList<>();
    }



    public void fromJsonPersonaje(JSONObject jsonObject) throws JSONException
    {
        Personaje personaje = new Personaje();

        personaje.setId(jsonObject.getInt("id"));
        personaje.setName(jsonObject.getString("name"));
        personaje.setStatus(jsonObject.getString("status"));
        personaje.setSpecies(jsonObject.getString("species"));
        personaje.setType(jsonObject.getString("type"));
        personaje.setGender(jsonObject.getString("gender"));

        personaje.setOrigin(fromJsonOrigin(jsonObject.getJSONObject("origin")));
        JSONArray jsonArrayEpisode = jsonObject.getJSONArray("episode");
        for(int i=0; i<jsonArrayEpisode.length(); i++)
        {
            personaje.setEpisode(jsonArrayEpisode.getString(i));
        }
        personaje.setCreate(jsonObject.getString("created"));

        personajes.add(personaje);
    }

    public Origin fromJsonOrigin(JSONObject jsonObject) throws JSONException
    {
        Origin origin = new Origin();
        origin.setName(jsonObject.getString("name"));
        origin.setUrl(jsonObject.getString("url"));

        return origin;
    }

    public JSONArray toJson()
    {
        JSONArray jsonArray = new JSONArray();
        try {
            for (Personaje p : personajes) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("ID", p.getId());
                jsonObject.put("name", p.getName());
                jsonObject.put("status", p.getStatus());
                jsonObject.put("species", p.getSpecies());
                jsonObject.put("type", p.getType());
                jsonObject.put("gender", p.getGender());

                JSONObject jsonObjectOrigin = new JSONObject();
                Origin origin = p.getOrigin();
                jsonObjectOrigin.put("Name", origin.getName());
                jsonObjectOrigin.put("Url", origin.getUrl());

                jsonObject.put("Origin", jsonObjectOrigin);
                jsonObject.put("create", p.getCreate());

                JSONArray jsonArrayEpisodios = new JSONArray();
                ArrayList<String> episiodios = p.getEpisode();
                for (String s: episiodios)
                {
                    jsonArrayEpisodios.put(s);
                }
                jsonObject.put("episode", jsonArrayEpisodios);

                jsonArray.put(jsonObject);
            }
        }
        catch (JSONException ex)
        {
            System.out.println(ex.getMessage());
        }

        return jsonArray;
    }

    public void guardaPersonajeArch()
    {
        ControladoraArchivo<Personaje> controladora= new ControladoraArchivo<>(personajes);
        controladora.guardar("Personajes.dat");
    }

    public void leerPersonajesArch()
    {
        ControladoraArchivo<Personaje> controladora= new ControladoraArchivo<>(personajes);
        controladora.leer(personajes,"Personajes.dat");
    }




    public void muestraGestora()
    {
        for(Personaje p : personajes)
        {
            System.out.println("\n" + p.toString());
        }
    }






}
