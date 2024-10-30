public interface Builder {

    public void buildMasa();
    public void buildRelleno();
    public Torta getTorta();

}
// la interface builder en el patron hacer que las clases que la implementen tengan que tener los metodos buildMasa, buildRelleno y getTorta