

public class Torta {

    private String relleno, masa;
    // private ArrayList<String> ingredientes = new ArrayList<>();

    public Torta() {
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void mostrar() {
        System.out.println("Torta de: " + masa + ", con: " + relleno);
    } 

}
