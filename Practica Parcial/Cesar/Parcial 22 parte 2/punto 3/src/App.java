import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        String[] Colores = { "Blanco", "Gris", "Rojo", "Ploteado", "Negro" };
        String[] Marca = { "Samsung", "LG", "Whirlpool" };
        Lavarropa[] lavarropas = new Lavarropa[10];
        Cocina[] cocinas = new Cocina[10];
        Heladera[] heladeras = new Heladera[10];
        for (Integer i = 0; i < 10; i++) {
            lavarropas[i] = new Lavarropa("Modelo " + i, Marca[random.nextInt(Marca.length)],
                    Colores[random.nextInt(Colores.length)], random.nextInt(10000), random.nextBoolean(),
                    random.nextInt(25));
        }
        System.out.println("-----------");
        for (Integer i = 0; i < 10; i++) {
            cocinas[i] = new Cocina("Modelo " + i, Marca[random.nextInt(Marca.length)],
                    Colores[random.nextInt(Colores.length)], random.nextInt(10000), random.nextBoolean());
        }
        System.out.println("-----------");
        for (Integer i = 0; i < 10; i++) {
            heladeras[i] = new Heladera("Modelo " + i, Marca[random.nextInt(Marca.length)],
                    Colores[random.nextInt(Colores.length)], random.nextInt(10000), random.nextInt(31),
                    random.nextInt(10));
        }
        System.out.println("-----------");
        System.out.println("Heladeras recomendadas: ");
        for (Integer i = 0; i < 3; i++) {
            System.out.println(heladeras[random.nextInt(heladeras.length)].toString());
        }
        System.out.println("-----------");
        System.out.println("Cocinas recomendadas: ");
        for (Integer i = 0; i < 3; i++) {
            System.out.println(cocinas[random.nextInt(cocinas.length)].toString());
        }
        System.out.println("-----------");
        System.out.println("Lavarropas recomendadas: ");
        for (Integer i = 0; i < 3; i++) {
            System.out.println(lavarropas[random.nextInt(lavarropas.length)].toString());
        }
        System.out.println("-----------");
        System.out.println("Electrodomesticos recomendados c:");
        for (Integer i = 0; i < 3; i++) {
            if (random.nextInt(4) == 1) {
                System.out.println(heladeras[random.nextInt(heladeras.length)].toString());
            } else {
                if (random.nextInt(4) == 2) {
                    System.out.println(cocinas[random.nextInt(cocinas.length)].toString());
                } else {
                    System.out.println(lavarropas[random.nextInt(lavarropas.length)].toString());
                }
            }
        }
    }
}
