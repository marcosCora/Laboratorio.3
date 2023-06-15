import Models.*;
import ModelsExcepciones.MateriaRepetidaExcepcion;
import ModelsExcepciones.NotaRepetidaExcepcion;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Nota nota1 = new Nota(10, 1, "31/05/2023");
        Nota nota2 = new Nota(9, 2, "31/06/2023");
        Nota nota3 = new Nota(7, 1, "31/07/2023");

        HasSetGenerico<Nota> notas = new HasSetGenerico<>();
        try {
            notas.agregar(nota1);
            notas.agregar(nota2);
            notas.agregar(nota3);
        }
        catch (NotaRepetidaExcepcion e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        Materia materia1 = new Materia("orgEm", "Organizacion empresarial", "Micaela ban burk", "yo", "Miercoles 8 30 - 13 00", notas);
        //--------------------------------------------------------------------------------------------------------------------------
        Nota nota4 = new Nota(7, 1, "5/04/2023");
        Nota nota5 = new Nota(10, 1, "8/06/2023");

        HasSetGenerico<Nota> notas2 = new HasSetGenerico<>();
        try {
            notas2.agregar(nota4);
            notas2.agregar(nota5);
        }
        catch (NotaRepetidaExcepcion e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


        Materia materia2 = new Materia("prog", "Programacion 3", "Gonzalo Benoffi", "juan", "Martes - jueves", notas2);
        //--------------------------------------------------------------------------------------------------------------------------
        Nota nota6 = new Nota(9, 2, "25/03/2023");
        Nota nota7 = new Nota(8, 2, "16/06/2023");

        HasSetGenerico<Nota> notas3 = new HasSetGenerico<>();
        try {
            notas3.agregar(nota6);
            notas3.agregar(nota7);
        }
        catch (NotaRepetidaExcepcion e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        Materia materia3 = new Materia("labo3", "Laboratorio 3", "Gonza Benoffi", "juan", "Viernes", notas3);

        HasMapGenerico<String, Materia> materias = new HasMapGenerico<>();
        try
        {
            materias.agregar(materia1.getCodigo(), materia1);
            materias.agregar(materia2.getCodigo(), materia2);
            materias.agregar(materia3.getCodigo(), materia3);
        }
        catch (MateriaRepetidaExcepcion ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        Estudiante estudiante1 = new Estudiante("Marcos", "Corasaniti", "18/05/2002", "marcoscorasaniti07@gmail.com", 758, materias);
       // System.out.println(estudiante1.toString());

        try {
            JSONObject json = estudiante1.toJsonEstudiante();
            System.out.println(json.toString());

            JsonUtiles.grabar(json, "archivoJsonEstudiante");
        }
        catch (JSONException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }




    }



}