package clases;

public class CD extends Elemento{

    private String artista;
    private String discoGrafica;
    private String listaTemas[];
    private int vListaTemas;
    private int cantidadTemas;

    public CD() {
        this.artista = "";
        this.discoGrafica = "";
        this.listaTemas = new String[50];
        this.vListaTemas = 0;
        this.cantidadTemas = cantidadTemas;
    }

    public CD(String nombre, String fechaEmisio, String productor, String genero, String comentarios, int duracion, int peso, int clasificacion, boolean prestado, String artista, String discoGrafica, int cantidadTemas)
    {
        super(nombre, fechaEmisio, productor, genero, comentarios, duracion, peso, clasificacion, prestado);
        this.artista = artista;
        this.discoGrafica = discoGrafica;
        this.listaTemas = new String[50];
        this.vListaTemas = 0;
        this.cantidadTemas = cantidadTemas;
    }

    //getter
    public String getArtista() {
        return artista;
    }

    public String getDiscoGrafica() {
        return discoGrafica;
    }

    public String getTema(int i) {
        return listaTemas[i];
    }

    public int getvListaTemas() {
        return vListaTemas;
    }

    public int getCantidadTemas() {
        return cantidadTemas;
    }

    public String imprimir()
    {
        return super.imprimir()+"Artista: "+artista+"\nDisco grafica: "+discoGrafica+"\nCantidad de temas: "+cantidadTemas+"\n";
    }




}
