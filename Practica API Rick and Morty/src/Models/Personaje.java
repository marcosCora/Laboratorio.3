package Models;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;

public class Personaje implements Serializable {

    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private Origin origin;
    private String create;
    private ArrayList<String> episode;

    public Personaje()
    {
        this.id = 0;
        this.name = "";
        this.status = "";
        this.species = "";
        this.type = "";
        this.gender = "";
        this.origin = new Origin();
        this.create = "";
        this.episode = new ArrayList<>();
    }

    public Personaje(int id, String name, String status, String species, String type, String gender, Origin origin, String create, ArrayList<String> episode) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.species = species;
        this.type = type;
        this.gender = gender;
        this.origin = origin;
        this.create = create;
        this.episode = episode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public String getCreate() {
        return create;
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public ArrayList<String> getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode.add(episode);
    }



    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", species='" + species + '\'' +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", origin=" + origin.toString() +
                ", create='" + create + '\'' +
                ", episode=" + episode +
                '}';
    }
}
