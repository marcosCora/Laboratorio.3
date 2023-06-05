package clases;

public class DVD extends Elemento{
    private String actores;
    private String distribuidora;
    private String estudio;
    private String idioma;
    private String premios;
    private String director;

    //constructores
    public DVD()
    {
        super();
        this.actores = "";
        this.distribuidora = "";
        this.estudio = "";
        this.idioma = "";
        this.premios = "";
        this.director = "";
    }

    public DVD(String nombre, String fechaEmisio, String productor, String genero, String comentarios, int duracion, int peso, int clasificacion, boolean prestado, String actores, String distribuidora, String estudio, String idioma, String premios, String director)
    {
        super(nombre, fechaEmisio, productor, genero, comentarios, duracion, peso, clasificacion, prestado);
        this.actores = actores;
        this.distribuidora = distribuidora;
        this.estudio = estudio;
        this.idioma = idioma;
        this.premios = premios;
        this.director = director;
    }

    //getter
    public String getActores() {
        return actores;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public String getEstudio() {
        return estudio;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getPremios() {
        return premios;
    }

    public String getDirector() {
        return director;
    }

    public String imprimir()
    {
        return super.imprimir()+"Actores: "+actores+"\nDistribuidora: "+distribuidora+"\nEstudio: "+estudio+"\nIdioma: "+idioma+"\nPremios: "+premios+"\nDirector: "+director+"\n";
    }



}
