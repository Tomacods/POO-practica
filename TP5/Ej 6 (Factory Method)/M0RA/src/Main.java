public class Main {
    public static void main(String[] args) {
        Creator creatorDigital = new ConcreteCreatorDigital();
        creatorDigital.precio("digital", 23.0, 46.4);
        Creator creatorFisico = new ConcreteCreatorFisico();
        creatorFisico.precio("Fisico", 43.0, 8.5);



        
   
    
}
}
