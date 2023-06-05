package Modelo;

public class Auto {

    //Atributos
    private String marca;
    private  String modelo;

    //constructor vacio
    public Auto()
    {
        this.marca = "";
        this.modelo = "";
    }

    //constructor completo
    public Auto(String marca, String modelo)
    {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public  void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    //Metodos
    public String infoCompleta()
    {
        return marca + " " + modelo;
    }


}
