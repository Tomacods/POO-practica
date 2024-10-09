public class RedVelvetBuilder implements Builder{
    
    private TortaBuilder torta;

    public RedVelvetBuilder(){
        this.torta = new TortaBuilder();
    }
    
    @Override
    public void setGusto() {
        torta.setGusto("Red velvet");
    }
    
    @Override
    public void setRelleno() {
        torta.setRelleno("Crema");    
    }
    
    @Override
    public TortaBuilder getTorta() {
        return this.torta;
    }
}
