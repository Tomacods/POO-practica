public class VainillaBuilder implements Builder{
    
    private Torta torta;

    public VainillaBuilder(){
        this.torta = new Torta();
    }
    
    @Override
    public void setGusto() {
        torta.setGusto("Vainilla");
    }
    
    @Override
    public void setRelleno() {
        torta.setRelleno("Crema y duraznos");    
    }
    
    @Override
    public Torta getTorta() {
        return this.torta;
    }
}