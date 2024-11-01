import java.util.ArrayList;
public class Torta {

    //private String relleno;
    private ArrayList<String> ingredientes = new ArrayList<>();

    public Torta(ArrayList<String> ingredientes) {
        //this.relleno = relleno;
        this.ingredientes = ingredientes;
    }

  /*   public void setRelleno(String relleno) {
        this.relleno = relleno;
    }*/

    public void addIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public void imprimir() {
        System.out.println("Torta con: ");
        for (String ingrediente : ingredientes) {
            System.out.println(ingrediente);
        }
    }
    
}
