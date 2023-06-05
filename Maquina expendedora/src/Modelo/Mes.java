package Modelo;

import java.time.LocalTime;

public class Mes {

    //atributos
    private int topeBoletos;
    private int precioActual;
    private int recaudacion;
    private int saldo;
    private int cantBoletos;
    private Boleto boletos[];
    private int vBoletos;
    private String fechaEmision;

    //constructores
    public Mes()
    {
        this.precioActual = 0;
        this.recaudacion = 0;
        this.saldo = 0;
        this.cantBoletos = 0;
        this.boletos = new Boleto[topeBoletos];
        this.vBoletos = 0;
        this.fechaEmision = "";
    }

    public Mes(int topeBoletos, int precioActual, int recaudacion, int saldo, int cantBoletos, String fechaEmision)
    {
        this.topeBoletos = topeBoletos;
        this.precioActual = precioActual;
        this.recaudacion = recaudacion;
        this.saldo = saldo;
        this.cantBoletos = cantBoletos;
        this.boletos = new Boleto[topeBoletos];
        this.vBoletos = 0;
        this.fechaEmision = fechaEmision;
    }

    ///usuario

    public int getPrecioActual()
    {
        return precioActual;
    }

    public String getFechaEmision()
    {
        return fechaEmision;
    }
    public int getSaldo()
    {
        return saldo;
    }

    public void setSaldo(int saldo)
    {
        this.saldo = saldo;
    }

    //tecnico
    public int getRecaudacion()
    {
        return recaudacion;
    }
    public int getCantBoletos()
    {
        return  cantBoletos;
    }
    public int getvBoletos()
    {
        return vBoletos;
    }

    public void setPrecioActual(int precioActual)
    {
        this.precioActual = precioActual;
    }
    public void setTopeBoletos(int topeBoletos)
    {
        this.topeBoletos = topeBoletos;
    }

    private String fechaCompleta()
    {
        LocalTime hora = LocalTime.now();
        String fechaCompleta = getFechaEmision() + " " + hora;
        return fechaCompleta;
    }
    public boolean creaBoleto()
    {
        boolean agregado = false;
        if(saldo >= precioActual && cantBoletos < topeBoletos)
        {
            String fechaBoleto = fechaCompleta();
            Boleto boleto = new Boleto(fechaBoleto, getPrecioActual());
            boletos[vBoletos] = boleto;
            vBoletos++;
            saldo -= precioActual;
            cantBoletos++;
            recaudacion += precioActual;
            agregado = true;
        }
        return agregado;
    }

    public String muestraBoleto(int i)//indice para mostrar el arreglo de boletos
    {
        return boletos[i].infoBoleto();
    }

    public void ingresaSaldo(int saldo)
    {
        this.saldo += saldo;
    }



}
