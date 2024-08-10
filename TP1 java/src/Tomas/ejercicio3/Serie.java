

public  class Serie {
    private String titulo;
    private String genero;
    private int numeroDeTemporadas;
    private double calificacion;

    public Serie(String titulo, String genero, int numeroDeTemporadas, double calificacion) {
        this.titulo = titulo;
        this.genero = genero;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public double getCalificacion() {
        return calificacion;
    }


    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", numeroDeTemporadas=" + numeroDeTemporadas +
                ", calificacion=" + calificacion +
                '}';
    }
}