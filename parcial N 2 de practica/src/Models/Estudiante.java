package Models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Estudiante
{
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String email;
    private int legajo;
    HasMapGenerico<String, Materia> materias;


    public Estudiante()
    {
        this.nombre = "";
        this.apellido = "";
        this.fechaNacimiento = "";
        this.email = "";
        this.legajo = 0;
        this.materias = new HasMapGenerico<>();
    }

    public Estudiante(String nombre, String apellido, String fechaNacimiento, String email, int legajo, HasMapGenerico<String, Materia> materias)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.legajo = legajo;
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public HasMapGenerico<String, Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(HasMapGenerico<String, Materia> materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Estudiante" +
                "\nnombre='" + nombre  +
                "\napellido='" + apellido +
                "\nfechaNacimientp='" + fechaNacimiento +
                "\nemil='" + email +
                "\nlegajo=" + legajo +
                "\nmaterias=" + materias.listar() + "\n";
    }

    public JSONObject toJsonEstudiante()throws JSONException
    {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("nombre", nombre);
        jsonObject.put("apellido", apellido);
        jsonObject.put("fechaNacimiento", fechaNacimiento);
        jsonObject.put("email", email);
        jsonObject.put("legajo", legajo);
        jsonObject.put("materias", toJsonGenerico());

        return jsonObject;
    }



    public JSONArray toJsonGenerico() throws JSONException
    {
        JSONArray materiasJson = new JSONArray();

        ArrayList<Materia> arrayMaterias = materias.mapToArrayList();
        for(Materia m: arrayMaterias)
        {
            materiasJson.put(m.toJsonMateria());
        }
        return materiasJson;
    }




}

