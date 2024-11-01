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

//el director es el encargado de construir el objeto, en este caso la torta, y para eso necesita un builder que le diga como construirlo