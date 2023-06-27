package ModelsExcepcion;

import java.time.LocalDate;

public class MiExepcion extends Exception
{
    private String fecha;

    public MiExepcion(String mensaje)
    {
        super(mensaje);
        fecha = LocalDate.now().toString();
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "Fecha de la excepcion: " + fecha;
    }
}
