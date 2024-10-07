import java.util.ArrayList;
public abstract class BuilderTorta {
    protected Torta torta;

    public Torta getTorta(){
        return torta;
    }

    public void crearTorta() {
        torta = new Torta(new ArrayList<String>());
    }

    public abstract void vainilla();
    public abstract void coco();
    public abstract void chocolate();





   // public abstract void relleno();
  //  public abstract void setMasa();

    
    
}
