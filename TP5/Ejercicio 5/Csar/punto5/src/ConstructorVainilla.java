public class ConstructorVainilla extends ConstructorTorta {
    @Override
    public  void relleno(){
        torta.setRelleno("Vainilla");
    }
    @Override
    public  void masa(){
        torta.setMasa("Robusta");
    }
    @Override
    public  void decoracion(){
        torta.setDecoracion("Crema pastelera");
    }
}
