public class Serie { // clase Serie

    private String urlImg; // url de la imagen
    private String titulo; // titulo de la serie
    private String estreno; // fecha de estreno

    public Serie(String urlImg, String titulo, String estreno){ // constructor
        this.urlImg = urlImg; // asignacion de valores
        this.titulo = titulo; // asignacion de valores
        this.estreno = estreno; // asignacion de valores
    }
    

    public void imprimir(){ // metodo para imprimir los valores
        System.out.println(this.urlImg+"    "+this.titulo+"     "+this.estreno);
    }
}
