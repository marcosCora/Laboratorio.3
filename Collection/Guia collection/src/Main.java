import Models.HashMapPersona;
import Models.HashSetPersona;
import Models.Persona;
import Models.TreeSetPersona;

public class Main {
    public static void main(String[] args) {

        /** PRUEBA DE HASHSET
        HashSetPersona personasHashSet = new HashSetPersona();

        Persona p;

        p = new Persona("Marcos", "Corasaniti", "43392102");
        personasHashSet.agregar(p);

        p = new Persona("David", "Lavin", "44589654");
        personasHashSet.agregar(p);

        p = new Persona("Marcos", "Corasaniti", "43392102");
        personasHashSet.agregar(p);

        p = new Persona("Damian", "Lambrech", "35698874");
        personasHashSet.agregar(p);

        System.out.println(personasHashSet.listar());

        Persona aBuscar = personasHashSet.buscar("35698874");
        System.out.println("Persona que buscaba:\n" + aBuscar.toString());

        System.out.println(personasHashSet.contar());
        */

        /**TREE SET
        TreeSetPersona personasTreeSet = new TreeSetPersona();
        Persona p;

        p = new Persona("Marcos", "Corasaniti", "43392102");
        personasTreeSet.agregar(p);

        p = new Persona("David", "Lavin", "44589654");
        personasTreeSet.agregar(p);

        p = new Persona("raul", "pedron", "42856985");
        personasTreeSet.agregar(p);

        p = new Persona("Damian", "Lambrech", "35698874");
        personasTreeSet.agregar(p);

        System.out.println("TreeSet: " + personasTreeSet.listar());


        System.out.println("\nBuscado:\n" + personasTreeSet.buscar("4589632"));
        */

        HashMapPersona personaHashMap = new HashMapPersona();
        Persona p;

        p = new Persona("Marcos", "Corasaniti", "43392102");
        personaHashMap.agregar(p);

        p = new Persona("David", "Lavin", "44589654");
        personaHashMap.agregar(p);

        p = new Persona("raul", "pedron", "42856985");
        personaHashMap.agregar(p);

        p = new Persona("Damian", "Lambrech", "35698874");
        personaHashMap.agregar(p);

        System.out.println("TreeSet: " + personaHashMap.listar());




    }
}