public class Main {
    public static void main(String[] args) {
        Creator creatorDigital = new ConcreteCreatorDigital();
       Juego digital=  creatorDigital.factory_method("digital", 23.0, 46.4);
        System.out.println(digital.getPrecio());
        Creator creatorFisico = new ConcreteCreatorFisico();
        Juego fisico=  creatorFisico.factory_method("digital", 28.0, 89.4);
         System.out.println(fisico.getPrecio());

        
     //  Creator creatorDigital = creatorDigital.factory_method("digital", 23.0, 46.4);
     //   creatorDigital.mostrarPrecio();
    
      //  Creator creatorFisico = creatorFisico.factory_method();
      //  creatorFisico.mostrarPrecio

    //  Juego digital = ConcreteCreatorDigital.factory_method("digital", 23.0, 46.4);
    
}
}
