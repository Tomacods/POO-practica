public class Libro {
    private String titulo; // titulo del libro
    private String autor;  // autor del libro
    private int ejemplares; // cantidad de ejemplares
    private int precio; // precio del libro 
    private double calificacion; // calificacion del libro
    private String urlImg; // url de la imagen del libro



    public Libro(String titulo, String autor, int ejemplares, int precio, double calificacion){ // constructor
        this.titulo = titulo; 
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.precio = precio;
        this.calificacion = calificacion;
        this.urlImg = urlImg;   
    }
    public void imprimir(){
        System.out.println(this.titulo+"    "+this.autor+"    "+this.ejemplares+"    "+this.precio+"    "+this.calificacion+"    "+this.urlImg);
    }
}	
