package ModelsPersonajes;

public class Personaje implements IPropiedad {
    private String nombre;
    private String skin;
    private int nivelDeVida;
    private String arma;

    public Personaje()
    {
        this.nombre = "";
        this.skin = "";
        this.arma = "";
        this.nivelDeVida = 0;

    }

    public Personaje(String nombre, String skin, String arma, int nivelDeVida)
    {
        this.nombre = nombre;
        this.skin = skin;
        this.arma = arma;
        this.nivelDeVida = nivelDeVida;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public int getNivelDeVida() {
        return nivelDeVida;
    }

    public void setNivelDeVida(int nivelDeVida) {
        this.nivelDeVida = nivelDeVida;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public boolean equals(Object obj)
    {
        boolean rta = false;
        if(obj != null)
        {
            if(obj instanceof Personaje)
            {
                Personaje aux = (Personaje) obj;
                if(aux.getNombre().equals(nombre) && aux.getSkin().equals(skin) && aux.getArma().equals(arma) && aux.getNivelDeVida() == nivelDeVida)
                {
                    rta = true;
                }
            }
        }
        return rta;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", skin='" + skin + '\'' +
                ", nivelDeVida=" + nivelDeVida +
                ", arma='" + arma + '\'' +
                '}';
    }


    @Override
    public String atacar() {
        return "ESTOY ATACANDO...";
    }

    @Override
    public String defenderse() {
        return "DEFENDIENDOME...";
    }

    @Override
    public String morir() {
        return "ESTOY MUERTO...";
    }

    @Override
    public String cargarEnergia() {
        return "CARGANDO ENERGIA...";
    }
}
