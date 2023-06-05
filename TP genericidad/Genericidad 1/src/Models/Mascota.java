package Models;

public class Mascota {

    private String tipo;
    private String nombre;
    private String vacunas;

    public Mascota()
    {
        this.tipo = "";
        this.nombre = "";
        this.vacunas = "";
    }

    public Mascota(String tipo, String nombre, String vacunas)
    {
        this.tipo = tipo;
        this.nombre = nombre;
        this.vacunas = vacunas;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVacunas() {
        return vacunas;
    }

    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }

    @Override
    public boolean equals(Object obj) {

        boolean rta = false;
        if (obj != null)
        {
            if (obj instanceof Mascota) {
                Mascota aux = (Mascota) obj;
                if (aux.getNombre().equals(nombre) && aux.getTipo().equals(tipo)) {
                    rta = true;
                }
            }
        }
        return rta;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", vacunas='" + vacunas + '\'' +
                '}';
    }
}
