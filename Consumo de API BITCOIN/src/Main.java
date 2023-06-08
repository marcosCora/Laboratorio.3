import Models.ControladoraDeArchivo;
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

        ControladoraDeArchivo<DatoBTC> controladoraDeArchivo = new ControladoraDeArchivo<>(datosAPI);
        //controladoraDeArchivo.guardarArchivo();

        ArrayList<DatoBTC> datosArchivo = new ArrayList<>();
        datosArchivo = controladoraDeArchivo.leerArchivo(datosArchivo);


        String info = "";

       for(DatoBTC dato : datosArchivo)
        {
            System.out.println("\nARCHIVO\n");
            System.out.println(dato.toString());
        }

        /*
        private String fecha;
        private double precio;
        private double abierto;
        private double alto;
        private double changePercent;
        private String volumen;
        */
        JSONArray jsonArrayDatoBtc = new JSONArray();
        try {


            for (DatoBTC dato : datosAPI) {
                JSONObject objectDatoBtc = new JSONObject();
                objectDatoBtc.put("Fecha", dato.getFecha());
                objectDatoBtc.put("Precio", dato.getPrecio());
                objectDatoBtc.put("Abierto", dato.getAbierto());
                objectDatoBtc.put("Alto", dato.getAlto());
                objectDatoBtc.put("Change", dato.getChangePercent());
                objectDatoBtc.put("Volumen", dato.getVolumen());
                jsonArrayDatoBtc.put(objectDatoBtc);
            }
        }
        catch (JSONException ex)
        {
            System.out.println("ERROR " + ex.getMessage());
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        //System.out.println(jsonArrayDatoBtc.toString());


    }

    public static DatoBTC jsonToDatoBTC(JSONObject jsonObject, DatoBTC datoBTC) throws JSONException
    {

        datoBTC.setFecha(jsonObject.getString("Date"));
        datoBTC.setPrecio(jsonObject.getDouble("Price"));
        datoBTC.setAbierto(jsonObject.getDouble("Open"));
        datoBTC.setAlto(jsonObject.getDouble("High"));
        datoBTC.setChangePercent(jsonObject.getDouble("ChangePercentFromLastMonth"));
        datoBTC.setVolumen(jsonObject.getString("Volume"));

        return datoBTC;
    }


}