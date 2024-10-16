public class App {
    public static void main(String[] args) throws Exception {
        ConstructorTorta constructorChocolate = new ConstructorChocolate();
        ConstructorTorta constructorVainilla = new ConstructorVainilla();
        ConstructorTorta constructorCoco = new ConstructorCoco();

        DirectorTorta director = new DirectorTorta();
        director.setConstructorTorta(constructorChocolate);
        director.armarTortaDecorada();
        Torta chocolateDecorada = director.getTorta();
        director.armarTortaSimple();
        Torta chocolateSimple = director.getTorta();

        director.setConstructorTorta(constructorVainilla);
        director.armarTortaDecorada();
        Torta vainillaDecorada = director.getTorta();
        director.armarTortaSimple();
        Torta vainillaSimple = director.getTorta();


        director.setConstructorTorta(constructorCoco);
        director.armarTortaDecorada();
        Torta cocoDecorada = director.getTorta();
        director.armarTortaSimple();
        Torta cocoSimple = director.getTorta();

        System.out.println();
        System.out.println(chocolateDecorada);
        System.out.println();
        System.out.println(chocolateSimple);
        System.out.println();
        System.out.println(cocoDecorada);
        System.out.println();
        System.out.println(cocoSimple);
        System.out.println();
        System.out.println(vainillaDecorada);
        System.out.println();
        System.out.println(vainillaSimple);
    }
}
