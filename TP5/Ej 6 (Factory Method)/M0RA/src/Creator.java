public abstract class Creator {

    public abstract Juego factory_method(String id, Double importe, Double precio);
    public void precio(String id, Double importe, Double precio){
        Juego juego = factory_method(id, importe, precio);
     System.out.println(juego.getPrecio()) ;  
    }

  
    
}
