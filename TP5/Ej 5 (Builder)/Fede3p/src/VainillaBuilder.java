public class VainillaBuilder implements Builder{
    
    private TortaBuilder torta;

    public VainillaBuilder(){
        this.torta = new TortaBuilder();
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
    public TortaBuilder getTorta() {
        return this.torta;
    }
}