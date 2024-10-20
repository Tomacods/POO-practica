public class Boya  implements  Observer {
    private float temperatura;
    private float salinidad;

    public Boya( float temperatura, float salinidad) {
        this.temperatura = temperatura;
        this.salinidad = salinidad;
    }
    @Override
    public void update() {
        System.out.println("Temperatura: " + temperatura + " Salinidad: " + salinidad);
    }
    
}
