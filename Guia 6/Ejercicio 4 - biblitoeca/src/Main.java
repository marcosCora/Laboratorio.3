import ModelsBiblioteca.Elemento;
import ModelsBiblioteca.Gestora;
import ModelsBiblioteca.Libro;
import ModelsBiblioteca.Revista;

public class Main {
    public static void main(String[] args)
    {
        Gestora gestoraBibliteca = new Gestora();

        agregaGestoraRandom(gestoraBibliteca);

        System.out.println(gestoraBibliteca.imprimeBibliteca());





    }

    public static void agregaGestoraRandom(Gestora gestora)
    {
        Elemento elemento1 = new Libro("El casa fantasma", 2015, 8896);
        gestora.agregaElemento(elemento1);

        Elemento elemento2 = new Revista("Gente", 2023, 4587, 150);
        gestora.agregaElemento(elemento2);

        Elemento elemento3 = new Libro("Rey leon", 2008, 8854);
        gestora.agregaElemento(elemento3);

        Elemento elemento4 = new Revista("Caras", 2020, 4563, 85);
        gestora.agregaElemento(elemento4);

        Elemento elemento5 = new Libro("Harry potter", 2001, 8832);
        gestora.agregaElemento(elemento5);

        Elemento elemento6 = new Revista("Todo autos", 2016, 4541, 25);
        gestora.agregaElemento(elemento6);

        Elemento elemento7 = new Revista("Todo moto", 2014, 4125, 14);
        gestora.agregaElemento(elemento7);

        Elemento elemento8 = new Revista("Ford enfierrado", 2023, 4785, 5);
        gestora.agregaElemento(elemento8);

        Elemento elemento9 = new Libro("Los ojos del perro siveriano", 2010, 8543);
        gestora.agregaElemento(elemento9);

        Elemento elemento10 = new Libro("Las 5 obras maestras", 1990, 88519);
        gestora.agregaElemento(elemento10);

    }





}