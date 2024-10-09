public class Director {
    
    private Builder builder;

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public Torta nuevaTorta(){
        builder.setGusto();
        builder.setRelleno();
        return builder.getTorta();
    }
}
