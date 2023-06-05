package Models;

public interface IMetodos<E>
{

    boolean agregar(E elemento);
    boolean eliminar(E elemento);
    E buscar(E elemento);
    String mostrar();



}
