public abstract class BuilderTorta {
    protected Torta torta;

    public Torta getTorta(){
        return torta;
    }

    public void crearTorta() {
        torta = new Torta();
    }

    public abstract void tortaVainilla();
    public abstract void tortaCoco();
    public abstract void tortaChocolate();


//public abstract void setRelleno();
  //  public abstract void setMasa();

    
    
}
