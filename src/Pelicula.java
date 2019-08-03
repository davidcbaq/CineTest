public class Pelicula {
    private String titulo;
    private int duracionEnMinutos;
    private int edadMinima;
    private String nombreDirector;

    public Pelicula(String titulo, int duracionEnMinutos, int edadMinima, String nombreDirector) {
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.edadMinima = edadMinima;
        this.nombreDirector = nombreDirector;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }
}
