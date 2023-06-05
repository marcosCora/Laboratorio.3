package ModelsObjetos;

public class Plataforma extends Objeto{
    private String material;
    private String soporte;

    public Plataforma() {
        super();
        this.material = "";
        this.soporte = "";
    }

    public Plataforma(int alto, int ancho, String material, String soporte) {
        super(alto, ancho);
        this.material = material;
        this.soporte = soporte;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    @Override
    public boolean equals(Object obj) {

        boolean rta = false;
        if(obj != null)
        {
            if(obj instanceof Plataforma)
            {
                Plataforma aux = (Plataforma) obj;
                if(aux.getMaterial().equals(material) && aux.getSoporte().equals(soporte) && super.equals(obj))
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
                "\nPlataforma{" +
                "material='" + material + '\'' +
                ", soporte='" + soporte + '\'' +
                '}';
    }
}
