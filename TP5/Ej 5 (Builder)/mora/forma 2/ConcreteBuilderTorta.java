public class ConcreteBuilderTorta extends BuilderTorta{


public ConcreteBuilderTorta() {
    this.crearTorta();
}

    @Override
    public void vainilla(){
        
        this.torta.addIngrediente("Vainilla");
        this.torta.addIngrediente("relleno1");


    }

    @Override
    public void coco(){
        this.torta.addIngrediente("coco");
        this.torta.addIngrediente("relleno2");


    }

    @Override
    public void chocolate(){
        
        this.torta.addIngrediente("chocolate");
        this.torta.addIngrediente("relleno3");


    }
    


    
  /*  @Override
 public void setMasa(){
    this.torta.setMasa("Coco");
 }

 public void setRelleno(){
    this.torta.setMasa("Dulce de leche");
 }*/ 

    
}
