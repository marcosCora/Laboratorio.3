package clases;

public class Elemento {

    //atributos
    private String nombre;
    private String fechaEmisio;
    private String productor;
    private String  genero;//genero de la pelicula o cd musical
    private String comentarios;
    private int duracion;
    private int peso;///puede ser en memoria o peso fisico
    private int clasificacion; //del 1 al 5
    private boolean prestado;//indica si el elemento esta prestado o no
    //private int idElemento;


    public Elemento()
    {
        this.nombre = "";
        this.fechaEmisio = "";
        this.productor = "";
        this.genero = "";
        this.comentarios = "";
        this.duracion = 0;
        this.peso = 0;
        this.clasificacion = 0;
        this.prestado = false;

    }

    public Elemento(String nombre, String fechaEmisio, String productor, String genero, String comentarios, int duracion, int peso, int clasificacion, boolean prestado)
    {
        this.nombre = nombre;
        this.fechaEmisio = fechaEmisio;
        this.productor = productor;
        this.genero = genero;
        this.comentarios = comentarios;
        this.duracion = duracion;
        this.peso = peso;
        this.clasificacion = clasificacion;
        this.prestado = prestado;
        //this.idElemento = idElemento;
    }


    //getter
    public String getNombre() {
        return nombre;
    }

    public String getFechaEmisio() {
        return fechaEmisio;
    }

    public String getProductor() {
        return productor;
    }

    public String getGenero() {
        return genero;
    }

    public String getComentarios() {
        return comentarios;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getPeso() {
        return peso;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public boolean getPrestado() {
        return prestado;
    }

    //setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaEmisio(String fechaEmisio) {
        this.fechaEmisio = fechaEmisio;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String imprimir()
    {
        return "Nombre: "+nombre+"\nFecha emision: "+fechaEmisio+"\nProductos: "+productor+"\nGenero: "+genero+"\nComentarios: "+comentarios+"\nDuracion: "+duracion+"\nPeso: "+peso+"Clasificacion(1 A 5): "+clasificacion+"\n";
    }

}
