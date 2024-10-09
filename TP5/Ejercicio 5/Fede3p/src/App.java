public class App {
    public static void main(String[] args) throws Exception {

        Director director = new Director();

        Builder vainilla = new VainillaBuilder();
        director.setBuilder(vainilla);
        Torta tortaVainilla = director.nuevaTorta();
        System.out.println(tortaVainilla);

        Builder coco = new CocoBuilder();
        director.setBuilder(coco);
        Torta tortaCoco = director.nuevaTorta();
        System.out.println(tortaCoco);

        Builder redvelvet = new RedVelvetBuilder();
        director.setBuilder(redvelvet);
        Torta tortaRedVelvet = director.nuevaTorta();
        System.out.println(tortaRedVelvet);
    }
}
