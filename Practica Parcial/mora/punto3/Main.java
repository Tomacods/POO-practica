import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Lavarropa> lavarropas = new ArrayList<>();
        List<Heladera> heladeras = new ArrayList<>();
        List<Cocina> cocinas = new ArrayList<>();
        
        List<String> marcas = new ArrayList<>(Arrays.asList("Marca1", "Marca2", "Marca3", "Marca4", "Marca5", "Marca6", "Marca7", "Marca8"));
        List<String> colores = new ArrayList<>(Arrays.asList("Blanco", "Negro", "Gris", "Rojo"));
        //String modelo, int precio, String marca, String color, int capacidad_freezer, int capacidad_total
        for (int i = 1; i <= 10; i++) {
            int indiceMarca = random.nextInt(marcas.size());
            String marca = marcas.get(indiceMarca);
            int indiceColor = random.nextInt(colores.size());
            String color = colores.get(indiceColor);
            String modelo = "ABC" + i;
            int precio = random.nextInt(500) + 300;
            int capacidad = random.nextInt(200) + 100;
            int capacidad2 = random.nextInt(250) + 400;
            Heladera heladera = new Heladera(modelo, precio , marca , color, capacidad, capacidad2);
            heladeras.add(heladera);
    }
    for (int i = 1; i <= 10; i++) {
        lavarropas.add(new Lavarropa("AAA"+i, random.nextInt(500) + 300, marcas.get(random.nextInt(marcas.size())), colores.get(random.nextInt(colores.size())), random.nextBoolean(), random.nextInt(150) + 150));
    }
    for (int i = 1; i <= 10; i++){
        cocinas.add(new Cocina("AZW" + i, random.nextInt(500) + 300, marcas.get(random.nextInt(marcas.size())), colores.get(random.nextInt(colores.size())), random.nextBoolean()));
    }
    System.out.println("Lista recomendacion de heladeras: ");
Collections.shuffle(heladeras);
for (int i = 0; i < 3; i++) {
    System.out.println(heladeras.get(i));
}
System.out.println("Lista recomendacion de lavarropas: ");
Collections.shuffle(lavarropas);
for (int i = 0; i < 3; i++) {
    System.out.println(lavarropas.get(i));
}
System.out.println("Lista recomendacion de cocinas: ");
Collections.shuffle(cocinas);
for (int i = 0; i < 3; i++) {
    System.out.println(cocinas.get(i));
}
List<Electrodomestico> lista_productos = new ArrayList<>();
lista_productos.addAll(heladeras);
lista_productos.addAll(cocinas);
lista_productos.addAll(lavarropas);
Collections.shuffle(lista_productos);

System.out.println("Lista general: ");
System.out.println();
for (int i = 0; i < 3; i++) {
    System.out.println(lista_productos.get(i));
}

    }
}
