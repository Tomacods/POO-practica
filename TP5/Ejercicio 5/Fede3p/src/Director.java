public class Director {
    
    private Builder builder;

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public TortaBuilder nuevaTorta(){
        builder.setGusto();
        builder.setRelleno();
        return builder.getTorta();
    }
}
