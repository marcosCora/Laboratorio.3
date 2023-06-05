import Models.*;

public class Main {
    public static void main(String[] args)
    {
        /**
        Almacenamiento<Persona>almacenamientoPersona = new Almacenamiento<>();

        Persona personita = new Persona("Marcos cora", "43392102", "brown 1712");
        almacenamientoPersona.agregar(personita);

        personita = new Persona("karla kjer", "41589652", "san martin 1712");
        almacenamientoPersona.agregar(personita);

        personita = new Persona("gotia betbeder", "44587123", "hipolito 1712");
        almacenamientoPersona.agregar(personita);

        System.out.println("Personas\n" + almacenamientoPersona.mostrar());

        //almacenamientoPersona.eliminar(new Persona("karla kjer", "41589652", "san martin 1712"));

        //System.out.println("Personas\n" + almacenamientoPersona.mostrar());

        //System.out.println(almacenamientoPersona.buscaObjeto(new Persona("gotia betbeder", "44587123", "hipolito 1712")).toString());
        */
        /**
        Almacenamiento<Mascota> almacenamientoMascota = new Almacenamiento<>();
        Mascota mascotita;

        mascotita = new Mascota("perro", "lola", "todas");
        almacenamientoMascota.agregar(mascotita);

        mascotita = new Mascota("gato", "tato", "todas");
        almacenamientoMascota.agregar(mascotita);

        mascotita = new Mascota("perro", "bordona", "todas");
        almacenamientoMascota.agregar(mascotita);

        System.out.println("Mascoras\n" + almacenamientoMascota.mostrar());
        */

        /**PILA
        Pila<Persona> pilita = new Pila<>();
        Persona personita = new Persona("Marcos cora", "43392102", "brown 1712");
        pilita.agregar(personita);

        personita = new Persona("karla kjer", "41589652", "san martin 1712");
        pilita.agregar(personita);

        personita = new Persona("gotia betbeder", "44587123", "hipolito 1712");
        pilita.agregar(personita);

        System.out.println(pilita.mostrar());

        pilita.eliminaTope();

        System.out.println(pilita.mostrar());

        System.out.println("TOPE:\n" + pilita.tope());
         */

        /**
        Conjunto<Persona> conjunto = new Conjunto<>();
        Persona personita = new Persona("Marcos cora", "43392102", "brown 1712");
        conjunto.agregar(personita);

        personita = new Persona("karla kjer", "41589652", "san martin 1712");
        conjunto.agregar(personita);

        personita = new Persona("gotia betbeder", "44587123", "hipolito 1712");
        conjunto.agregar(personita);

        personita = new Persona("Marcos cora", "43392102", "brown 1712");
        conjunto.agregar(personita);

        System.out.println("PERSONAS\n" + conjunto.mostrar());

        Conjunto<Mascota> conjuntoMascota = new Conjunto<>();
        Mascota mascotita;

        mascotita = new Mascota("perro", "lola", "todas");
        conjuntoMascota.agregar(mascotita);

        mascotita = new Mascota("gato", "tato", "todas");
        conjuntoMascota.agregar(mascotita);

        mascotita = new Mascota("perro", "bordona", "todas");
        conjuntoMascota.agregar(mascotita);

        System.out.println("Mascoras\n" + conjuntoMascota.mostrar());
    */

        ListaOrdenada<Persona> lista = new ListaOrdenada<>();
        Persona personita = new Persona("Marcos cora", "43392102", "brown 1712");
        lista.agregar(personita);

        personita = new Persona("karla kjer", "41589652", "san martin 1712");
        lista.agregar(personita);

        personita = new Persona("gotia betbeder", "44587123", "hipolito 1712");
        lista.agregar(personita);

        personita = new Persona("Marcos cora", "43392102", "brown 1712");
        lista.agregar(personita);

        System.out.println("PERSONAS\n" + lista.mostrar());




    }
}