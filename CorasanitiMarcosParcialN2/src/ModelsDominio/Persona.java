package ModelsDominio;

import ModelsExcepcion.MiExepcion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Persona
{
    private String id;
    private String email;
    private String apiKey;
    private String userName;
    private String createdAt;
    private String upDateAt;
    private Profile profile;
    private HashSetGenerico<String> roles;

    public Persona()
    {
        this.id = "";
        this.email = "";
        this.apiKey = "";
        this.userName = "";
        this.createdAt = "";
        this.upDateAt = "";
        this.profile = new Profile();
        this.roles = new HashSetGenerico<>();
    }

    public Persona(String id, String email, String apiKey, String userName, String createdAt, String upDateAt, Profile profile, HashSetGenerico<String> roles)
    {
        this.id = id;
        this.email = email;
        this.apiKey = apiKey;
        this.userName = userName;
        this.createdAt = createdAt;
        this.upDateAt = upDateAt;
        this.profile = profile;
        this.roles = roles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpDateAt() {
        return upDateAt;
    }

    public void setUpDateAt(String upDateAt) {
        this.upDateAt = upDateAt;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public HashSetGenerico<String> getRoles() {
        return roles;
    }

    public void setRoles(HashSetGenerico<String> roles) {
        this.roles = roles;
    }






    public void fromJson(JSONObject jsonObject)throws JSONException
    {
        id = jsonObject.getString("id");
        email = jsonObject.getString("email");

        JSONArray jsonArray = jsonObject.getJSONArray("roles");
        for(int i=0; i<jsonArray.length(); i++)
        {
            roles.agregar(jsonArray.getString(i));
        }

        apiKey = jsonObject.getString("apiKey");
        profile.fromJson(jsonObject.getJSONObject("profile"));
        userName = jsonObject.getString("username");
        createdAt = jsonObject.getString("createdAt");
        upDateAt = jsonObject.getString("updatedAt");
    }


    @Override
    public String toString() {
        return "\nPersona" +
                "\nid='" + id +
                "\nemail='" + email +
                "\napiKey='" + apiKey +
                "\nuserName='" + userName +
                "\ncreatedAt='" + createdAt +
                "\nupDateAt='" + upDateAt +
                "\nprofile=" + profile.toString() +
                "\nroles=" + roles.listar();
    }
}
