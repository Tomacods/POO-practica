public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Torta construirTorta() {
        builder.buildMasa();
        builder.buildRelleno();
        return builder.getTorta();
    }
}
