public class VainillaBuilder implements Builder {
    private Torta torta;

    public VainillaBuilder() {
        this.torta = new Torta();
    }

    @Override
    public void buildMasa() {
        torta.setMasa("Masa de vainilla");
    }

    @Override
    public void buildRelleno() {
        torta.setRelleno("Relleno de crema de vainilla");
    }

    @Override
    public Torta getTorta() {
        return this.torta;
    }
}