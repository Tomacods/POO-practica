public class Main {
        public static void main(String[] args) {
                Director director = new Director();

                Builder vainillaBuilder = new VainillaBuilder();
                Builder cocoBuilder = new CocoBuilder();
                Builder chocolateBuilder = new ChocolateBuilder();

                director.setBuilder(vainillaBuilder);
                Torta tortaVainilla = director.construirTorta();
                System.out.println(tortaVainilla);

                director.setBuilder(cocoBuilder);
                Torta tortaCoco = director.construirTorta();
                System.out.println(tortaCoco);

                director.setBuilder(chocolateBuilder);
                Torta tortaChocolate = director.construirTorta();
                System.out.println(tortaChocolate);
        }
}