public abstract class ConstructorTorta {
    protected Torta torta;
    public Torta getTorta(){
        return torta;
    }
    public void crearNuevaTorta (String nombre){
        torta = new Torta(nombre);
    }

    public abstract void relleno();
    public abstract void masa();
    public abstract void decoracion();

}
