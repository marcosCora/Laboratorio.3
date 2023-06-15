package Models;

import java.time.LocalDateTime;

public class MiExcepcion extends  Exception
{
    private LocalDateTime fecha;

    public MiExcepcion(String mensaje)
    {
        super(mensaje);
        fecha = LocalDateTime.now();
    }

}
