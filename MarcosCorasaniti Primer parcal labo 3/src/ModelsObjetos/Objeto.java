package ModelsObjetos;

import java.util.Objects;

public class Objeto {

    private int alto;
    private int ancho;

    public Objeto() {
        this.alto = 0;
        this.ancho = 0;
    }

    public Objeto(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public boolean equals(Object obj) {

        boolean rta = false;
        if(obj != null)
        {
            if(obj instanceof Objeto)
            {
                Objeto aux = (Objeto) obj;
                if(alto == aux.getAlto() && ancho == aux.getAncho())
                {
                    rta = true;
                }
            }
        }
        return  rta;
       }


    @Override
    public String toString() {
        return "Objeto{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                '}';
    }
}
