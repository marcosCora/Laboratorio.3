package ModelsExcepciones;

public class NotaRepetidaExcepcion extends Exception
{
    String infoNota;

    public NotaRepetidaExcepcion(String mensaje, String infoNota)
    {
        super(mensaje);
        this.infoNota = infoNota;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "-Informacion de la nota: " + infoNota;
    }
}
