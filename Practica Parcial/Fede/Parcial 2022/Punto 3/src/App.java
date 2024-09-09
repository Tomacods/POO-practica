import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        String[] colores = {"Negro", "Blanco", "Gris", "Rojo", "Azul"};
        String[] marcas = {"Samsung", "LG", "Whirlpool"};
        Lavarropa[] lavarropas = new Lavarropa[10];
        Heladera[] heladeras = new Heladera[10];
        Cocina[] cocinas = new Cocina[10];
        for (Integer i = 0; i < 10; i++){
            Integer precio = random.nextInt(1000000);
            String marca = marcas[random.nextInt(marcas.length)];
            String color = colores[random.nextInt(colores.length)];
            Boolean cargaFrontal = random.nextBoolean();
            Integer capKilo = random.nextInt(31);
            lavarropas[i] = new Lavarropa("Modelo " + i, precio, marca, color, cargaFrontal, capKilo);
        }
        for (Integer i = 0; i < 10; i++){
            Integer precio = random.nextInt(1000000);
            String marca = marcas[random.nextInt(marcas.length)];
            String color = colores[random.nextInt(colores.length)];
            Integer capTotal = random.nextInt(31);
            Integer litros = random.nextInt(31);
            heladeras[i] = new Heladera("Modelo " + i, precio, marca, color, capTotal, litros);
        }
        for (Integer i = 0; i < 10; i++){
            Integer precio = random.nextInt(1000000);
            String marca = marcas[random.nextInt(marcas.length)];
            String color = colores[random.nextInt(colores.length)];
            Boolean elec = random.nextBoolean();
            cocinas[i] = new Cocina("Modelo " + i, precio, marca, color, elec);
        }
        System.out.println("Cocinas recomendadas: ");
        for (Integer i = 0; i < 3; i++){
            System.out.println(cocinas[random.nextInt(cocinas.length)].toString());
        }
        System.out.println("----------");
        System.out.println("Heladeras recomendadas: ");
        for (Integer i = 0; i < 3; i++){
            System.out.println(heladeras[random.nextInt(heladeras.length)].toString());
        }
        System.out.println("----------");
        System.out.println("Lavarropas recomendados: ");
        for (Integer i = 0; i < 3; i++){
            System.out.println(lavarropas[random.nextInt(lavarropas.length)].toString());
        }
        System.out.println("----------");
        System.out.println("Electrodomésticos recomendados: ");
        for (Integer i = 0; i < 3; i++){
            if (random.nextInt(4) == 1){
                System.out.println(cocinas[random.nextInt(cocinas.length)].toString());
            } else {
                if (random.nextInt(4) == 2){
                    System.out.println(heladeras[random.nextInt(heladeras.length)].toString());
                } else {
                    System.out.println(lavarropas[random.nextInt(lavarropas.length)].toString());
                }
            }
        }
    }
}
