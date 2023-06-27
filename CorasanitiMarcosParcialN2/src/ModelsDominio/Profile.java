package ModelsDominio;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public class Profile
{
    private String dob;
    private String name;
    private String abaout;
    private String address;
    private String company;
    Location location;

    public Profile()
    {
        this.dob = "";
        this.name = "";
        this.abaout = "";
        this.address = "";
        this.company = "";
        this.location = new Location();
    }

    public Profile(String dob, String name, String abaout, String address, String company, Location location)
    {
        this.dob = dob;
        this.name = name;
        this.abaout = abaout;
        this.address = address;
        this.company = company;
        this.location = location;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbaout() {
        return abaout;
    }

    public void setAbaout(String abaout) {
        this.abaout = abaout;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void fromJson(JSONObject jsonObject)throws JSONException
    {
        dob = jsonObject.getString("dob");
        name = jsonObject.getString("name");
        abaout = jsonObject.getString("about");
        address = jsonObject.getString("address");
        company = jsonObject.getString("company");
        location.fromJson(jsonObject.getJSONObject("location"));
    }


    public boolean existProfile(String nombre)
    {
      return name.equals(nombre);
    }


    @Override
    public String toString() {
        return "\nProfile" +
                "\ndob='" + dob +
                "\nname='" + name +
                "\nabaout='" + abaout +
                "\naddress='" + address +
                "\ncompany='" + company +
                "\nlocation=" + location;
    }


}
