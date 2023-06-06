package Models;

public class CuentaBancariaExcepcion extends Exception{

    public CuentaBancariaExcepcion(String mensaje)
    {
        super(mensaje);
    }
/**
    public void retiroSalarioExcepcion(CuentaBancaria cuenta, int dinero)
    {
        try {
            cuenta.retiroDinero(dinero);
        }
        catch (CuentaBancariaExcepcion e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Otro erros " + e.getMessage());
        }
    }

*/


}
