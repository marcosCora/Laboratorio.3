import ModelsObjetos.Muro;
import ModelsObjetos.Objeto;
import ModelsObjetos.Plataforma;
import ModelsPersonajes.Personaje;
import ModelsPersonajes.Player.Ellie;
import ModelsPersonajes.Player.Joel;
import ModelsPersonajes.Zombies.Acechador;
import ModelsPersonajes.Zombies.Chasqueador;
import ModelsPersonajes.Zombies.Corredor;
import ModelsPersonajes.Zombies.Gordinflon;

public class Main {
    public static void main(String[] args) {

        Juego juego1 = new Juego();
        Personaje personaje;
        Objeto objeto;

        personaje = new Joel("pepe", "leon", "escopeta", 100, 15, 50);
        juego1.agregarPersonaje(personaje);
        personaje = new Ellie("Jorgue", "SpiderMan", "Pistola 20MM", 50, 53, 18);
        juego1.agregarPersonaje(personaje);

        personaje = new Corredor("raul", "corredor", "moto tira coetes", 68, 540);
        juego1.agregarPersonaje(personaje);

        personaje = new Acechador("patricio", "acechador", "tijeras", 68, 895);
        juego1.agregarPersonaje(personaje);

        personaje = new Chasqueador("tiago", "chasqueador", "Navajas", 20);
        juego1.agregarPersonaje(personaje);

        personaje = new Gordinflon("ramon", "GOrdinflon", "moto lanza llama", 99, 56);
        juego1.agregarPersonaje(personaje);

        System.out.println("PERSONAJES" + juego1.imprimePersonajes());

        objeto = new Muro(8, 3, 50);
        juego1.agregarObjeto(objeto);

        objeto = new Plataforma(9, 5, "Algarrobo", "Caños tubulares");
        juego1.agregarObjeto(objeto);

        objeto = new Muro(6, 2, 20);
        juego1.agregarObjeto(objeto);

        objeto = new Plataforma(85, 25, "Concreto", "Caños aluminio");
        juego1.agregarObjeto(objeto);

        System.out.println("\nOBJETOS: " + juego1.imprimeObjetos());






    }
}