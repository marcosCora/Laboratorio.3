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






    public void muestraGestora()
    {
        for(Personaje p : personajes)
        {
            System.out.println("\n" + p.toString());
        }
    }


}
