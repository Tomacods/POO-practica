public class CocoBuilder implements Builder {
    
    private TortaBuilder torta;

    public CocoBuilder(){
        this.torta = new TortaBuilder();
    }

    @Override
    public void setGusto() {
        torta.setGusto("Coco");
    }

    @Override
    public void setRelleno() {
        torta.setRelleno("Dulce de leche");
        
    }

    @Override
    public TortaBuilder getTorta() {
        return this.torta;
    }
}
