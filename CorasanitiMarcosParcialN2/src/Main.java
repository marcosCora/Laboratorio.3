import ModelsDominio.HashMapGenerico;
import ModelsDominio.Persona;
import ModelsDominio.Profile;
import ModelsExcepcion.MiExepcion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {

        HashMapGenerico<String, Persona> personas = new HashMapGenerico<>();

        try
        {
            JSONArray jsonArray = new JSONArray(JsonUtiles.leer("datos"));
            for(int i=0; i<jsonArray.length(); i++)
            {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Persona p = new Persona();
                //Persona p2 = new Persona(); linea usada para mostrar la excepcion de usuario repetido
                p.fromJson(jsonObject);
                //p2.fromJson(jsonObject); linea usada para mostrar la excepcion de usuario repetido
                personas.agregar(p.getUserName(), p);
                //personas.agregar(p2.getUserName(), p); linea usada para mostrar la excepcion de usuario repetido
            }
        }
        catch (JSONException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        System.out.println(personas.listar());

        /*
        boolean existePersona = existPersona(personas, "marcos");
        System.out.println("la persona: "+ existePersona);
        */

    }

    //no funciona
    public static boolean existPersona(HashMapGenerico map, String nombre)
    {
        ArrayList<Persona> personas = map.returnValue();
        boolean flag = false;
        int i = 0;
        while (i<personas.size() && flag == false)
        {
            Persona p = personas.get(i);
            Profile profile = p.getProfile();
            if(nombre.equals(profile.getName()));
            {
                flag = true;
            }
            i++;
        }

        return flag;
    }



}