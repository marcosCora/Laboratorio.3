package ModelsExcepciones;

public class MateriaRepetidaExcepcion extends Exception
{
    String codigoMateria;

    public MateriaRepetidaExcepcion(String mensaje, String codigo)
    {
        super(mensaje);
        this.codigoMateria = codigo;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "-Codigo de la materia: " + codigoMateria;
    }
}
