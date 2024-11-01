public class ConcreteCreatorDigital extends Creator  {
    
    @Override
    public Juego factory_method(String id, Double importe, Double precio) {
        return new Digital(id, importe, precio);
    }
    
}
