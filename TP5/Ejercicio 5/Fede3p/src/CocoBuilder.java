public class CocoBuilder implements Builder {
    
    private Torta torta;

    public CocoBuilder(){
        this.torta = new Torta();
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
    public Torta getTorta() {
        return this.torta;
    }
}
