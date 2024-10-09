public class ConcreteCreatorDigital extends Creator  {
    
   /*  @Override
    public Juego factory_method() {
        return new Digital("Juego Digital", 1000.0, 1.5);
    }*/
    @Override
    public Juego factory_method(String id, Double importe, Double precio) {
        return new Digital(id, importe, precio);
    }
    
}
