public class Serie {
    
    private String titulo;
    private String urlJpg;
    private String estreno;

    public Serie(String titulo, String urlJpg, String estreno){
        this.urlJpg = urlJpg;
        this.titulo = titulo;
        this.estreno = estreno;
    }

    public void imprimirSer(){
        System.out.println(this.urlJpg + "   " + this.titulo + "  " + this.estreno);
    }
}
