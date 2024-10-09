public class CocoBuilder implements Builder {
    private Torta torta;

    public CocoBuilder() {
        this.torta = new Torta();
    }

    @Override
    public void buildMasa() {
        torta.setMasa("Masa de coco");
    }

    @Override
    public void buildRelleno() {
        torta.setRelleno("Relleno de crema de coco");
    }

    @Override
    public Torta getTorta() {
        return this.torta;
    }
}