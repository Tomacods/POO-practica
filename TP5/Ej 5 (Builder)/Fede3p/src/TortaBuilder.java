public class TortaBuilder{

    private String gusto;
    private String relleno;

    public void setGusto(String gusto){
        this.gusto = gusto;
    }

    public void setRelleno(String relleno){
        this.relleno = relleno;
    }

    @Override
    public String toString() {
        return "Bizcochuelo: " + gusto + ", Relleno: " + relleno;
    }
}