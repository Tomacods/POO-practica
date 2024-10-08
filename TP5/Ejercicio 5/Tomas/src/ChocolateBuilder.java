public class ChocolateBuilder implements Builder {
    private Torta torta;

    public ChocolateBuilder() {
        this.torta = new Torta();
    }

    @Override
    public void buildMasa() {
        torta.setMasa("Masa de chocolate");
    }

    @Override
    public void buildRelleno() {
        torta.setRelleno("Relleno de crema de chocolate");
    }

    @Override
    public Torta getTorta() {
        return this.torta;
    }
}