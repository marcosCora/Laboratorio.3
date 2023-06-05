package Models;

public interface IMetodosCollection {

    boolean agregar(Persona p);
    boolean eliminar(Persona p);
    Persona buscar(String dni);
    String listar();
    int contar();

}
