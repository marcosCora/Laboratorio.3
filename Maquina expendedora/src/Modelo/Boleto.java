package Modelo;

public class Boleto {

    //atributos
    private String fechaEmision;
    private int precioBoleto;

    //constructores
    public Boleto()
    {
        this.fechaEmision = "";
        this.precioBoleto = 0;
    }
    public Boleto(String fechaEmision, int precioBoleto)
    {
        this.fechaEmision = fechaEmision;
        this.precioBoleto = precioBoleto;
    }

    //setters
    public int getPrecioBoleto()
    {
        return precioBoleto;
    }
    public String getFechaBoleto()
    {
        return fechaEmision;
    }

    public String infoBoleto()
    {
        return fechaEmision + "\n" + precioBoleto;
    }





}
