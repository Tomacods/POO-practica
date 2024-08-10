public class Serie {

    private String urlImg;
    private String titulo;
    private String estreno;

    public Serie(String urlImg, String titulo, String estreno){
        this.urlImg = urlImg;
        this.titulo = titulo;
        this.estreno = estreno;
    }
    

    public void imprimir(){
        System.out.println(this.urlImg+"    "+this.titulo+"     "+this.estreno);
    }
}
