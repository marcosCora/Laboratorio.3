package ModelsObjetos;

public class Muro extends Objeto{

    private int resistencia;

    public Muro() {
        super();
        this.resistencia = 0;
    }

    public Muro(int alto, int ancho, int resistencia) {
        super(alto, ancho);
        this.resistencia = resistencia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public boolean equals(Object obj) {

        boolean rta = false;
        if(obj != null)
        {
            if(obj instanceof Muro)
            {
                Muro aux = (Muro) obj;
                if(resistencia == aux.getResistencia() && super.equals(obj))
                {
                    rta = true;
                }
            }
        }
        return  rta;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nMuro{" +
                "resistencia=" + resistencia +
                '}';
    }
}
