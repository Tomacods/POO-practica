public class Torta extends TortaBuilder{
    
    public String gusto;
    public String relleno;

    public Torta(){
        this.reset();
    }

    public Torta(String gusto, String relleno){
        setGusto(gusto);
        setRelleno(relleno);
    }
}
