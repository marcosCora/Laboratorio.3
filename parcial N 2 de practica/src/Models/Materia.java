package Models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Materia
{
    private String codigo;
    private String nombre;
    private String docente;
    private String ayudante;
    private String diasCursada;

    private HasSetGenerico<Nota> notas;

    public Materia()
    {
        this.codigo = "";
        this.nombre = "";
        this.docente = "";
        this.ayudante = "";
        this.diasCursada = "";
        this.notas = new HasSetGenerico<>();
    }

    public Materia(String codigo, String nombre, String docente, String ayudante, String diasCursada, HasSetGenerico<Nota> notas)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.docente = docente;
        this.ayudante = ayudante;
        this.diasCursada = diasCursada;
        this.notas = notas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getAyudante() {
        return ayudante;
    }

    public void setAyudante(String ayudante) {
        this.ayudante = ayudante;
    }

    public String getDiasCursada() {
        return diasCursada;
    }

    public void setDiasCursada(String diasCursada) {
        this.diasCursada = diasCursada;
    }

    public HasSetGenerico<Nota> getNotas() {
        return notas;
    }

    public void setNotas(HasSetGenerico<Nota> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "\nMateria" +
                "\nnombre='" + nombre +
                "\ndocente='" + docente +
                "\nayudante='" + ayudante +
                "\ndiasCursada='" + diasCursada +
                "\nnotas=" + notas.listar();
    }

    public JSONObject toJsonMateria()throws JSONException
    {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("nombre", nombre);
        jsonObject.put("docente", docente);
        jsonObject.put("ayudante", ayudante);
        jsonObject.put("diasCursada", diasCursada);
        jsonObject.put("nota", toJsonGenericoSet());

        return jsonObject;
    }


    public JSONArray toJsonGenericoSet() throws JSONException {
        JSONArray materiasJson = new JSONArray();

        ArrayList<Nota> arrayNota = notas.setToArrayList();
        for (Nota n : arrayNota) {
            materiasJson.put(n.toJsonNota());
        }
        return materiasJson;
    }

}
