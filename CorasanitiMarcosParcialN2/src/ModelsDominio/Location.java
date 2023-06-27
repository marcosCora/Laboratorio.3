package ModelsDominio;

import org.json.JSONException;
import org.json.JSONObject;

public class Location
{
    private double latitud;
    private double longitud;

    public Location()
    {
        this.latitud = 0;
        this.longitud = 0;
    }

    public Location(double latitud, double longitud)
    {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void fromJson(JSONObject jsonObject) throws JSONException
    {
        latitud = jsonObject.getDouble("lat");
        longitud = jsonObject.getDouble("long");

    }


    @Override
    public String toString() {
        return "\nLocation" +
                "\nlatitud=" + latitud +
                "\nlongitud=" + longitud;
    }
}
