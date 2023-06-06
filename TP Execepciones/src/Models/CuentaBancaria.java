package Models;

public class CuentaBancaria {

    private int numeroDeCuenta;
    private int saldo;

    public CuentaBancaria()
    {
        this.numeroDeCuenta = 0;
        this.saldo = 0;
    }

    public CuentaBancaria(int numeroDeCuenta, int saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    public void retiroDinero(int cantDinero) throws CuentaBancariaExcepcion
    {

        if(cantDinero < saldo)
        {
            saldo = saldo-cantDinero;
        }
        else
        {
            throw new CuentaBancariaExcepcion("ERROS SALDO INSUFICIENTE");
        }
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
