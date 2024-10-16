public class Satelite implements Observer {
    private float radiacionUV;

    public Satelite(float radiacionUV) {
        this.radiacionUV = radiacionUV;
    }

    @Override
    public void update() {
        System.out.println("Radiacion UV: " + radiacionUV);
    }
    
}
