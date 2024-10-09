public class RedVelvetBuilder implements Builder{
    
    private Torta torta;

    public RedVelvetBuilder(){
        this.torta = new Torta();
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
    public Torta getTorta() {
        return this.torta;
    }
}
