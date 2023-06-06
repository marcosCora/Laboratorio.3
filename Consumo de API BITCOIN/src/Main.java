import Models.DatoBTC;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        //System.out.println(ConsumoAPI.getInfo());
        ArrayList<DatoBTC> datosAPI = new ArrayList<>();


        try {
            JSONArray jsonArray = new JSONArray(ConsumoAPI.getInfo());
            for(int i =0; i<jsonArray.length(); i++)
            {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                DatoBTC datoBTC = new DatoBTC();
                datosAPI.add(jsonToDatoBTC(jsonObject, datoBTC));
            }
        }
        catch (JSONException ex)
        {
            System.out.println(ex.getMessage());
        }

        String info = "";

        for(DatoBTC dato : datosAPI)
        {
            System.out.println(dato.toString());
        }

    }

    public static DatoBTC jsonToDatoBTC(JSONObject jsonObject, DatoBTC datoBTC)
    {
        try
        {
            datoBTC.setFecha(jsonObject.getString("Date"));
            datoBTC.setPrecio(jsonObject.getDouble("Price"));
            datoBTC.setAbierto(jsonObject.getDouble("Open"));
            datoBTC.setAlto(jsonObject.getDouble("High"));
            datoBTC.setChangePercent(jsonObject.getDouble("ChangePercentFromLastMonth"));
            datoBTC.setVolumen(jsonObject.getString("Volume"));
        }
        catch (JSONException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (Exception ex)
        {
            System.out.println("ERROR "+ ex.getMessage());
        }
        return datoBTC;
    }


}