public class TortaBuilder {
    private String masa;
    private String relleno;
    private String sabor;

    public TortaBuilder setMasa(String masa) {
        this.masa = masa;
        return this;
    }

    public TortaBuilder setRelleno(String relleno) {
        this.relleno = relleno;
        return this;
    }

    public TortaBuilder setSabor(String sabor) {
        this.sabor = sabor;
        return this;
    }

    public Torta build() {
        return new Torta(this);
    }
}