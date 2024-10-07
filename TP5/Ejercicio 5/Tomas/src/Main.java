public class Main {
        public static void main(String[] args) {
        Torta tortaVainilla = new Torta.TortaBuilder()
                .setMasa("Bizcocho")
                .setRelleno("Crema de Vainilla")
                .setSabor("Vainilla")
                .build();

        Torta tortaCoco = new Torta.TortaBuilder()
                .setMasa("Bizcocho de Coco")
                .setRelleno("Crema de Coco")
                .setSabor("Coco")
                .build();

        Torta tortaChocolate = new Torta.TortaBuilder()
                .setMasa("Bizcocho de Chocolate")
                .setRelleno("Crema de Chocolate")
                .setSabor("Chocolate")
                .build();

        System.out.println(tortaVainilla);
        System.out.println(tortaCoco);
        System.out.println(tortaChocolate);
        }
}