public class App {
    public static void main(String[] args) throws Exception {

        Director director = new Director();

        Builder vainilla = new VainillaBuilder();
        director.setBuilder(vainilla);
        TortaBuilder tortaVainilla = director.nuevaTorta();
        System.out.println(tortaVainilla);

        Builder coco = new CocoBuilder();
        director.setBuilder(coco);
        TortaBuilder tortaCoco = director.nuevaTorta();
        System.out.println(tortaCoco);

        Builder redvelvet = new RedVelvetBuilder();
        director.setBuilder(redvelvet);
        TortaBuilder tortaRedVelvet = director.nuevaTorta();
        System.out.println(tortaRedVelvet);
    }
}
