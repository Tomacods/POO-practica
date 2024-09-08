package paginaweb;
/*Implemente una solución que:
● Genere 10 lavarropas, 10 cocinas y 10 heladeras. Los modelos deben ser únicos y el precio debe ser random. El resto de los datos no tiene exigencias particulares.
● Imprima un listado de recomendados
○ En Cocinas
■ 3 de ellas de forma aleatoria, no repetidas. Debe mostrar precio, marca y
si es eléctrica o no.
○ En heladeras
■ 3 de ellas en forma aleatoria, no repetidas.
● Debe mostrar precio, marca y capacidad total en litros.
○ En lavarropas
■ 3 de ellos en forma aleatoria, no repetidos.
● Debe mostrar precio, marca y capacidad en kilogramos.
○ General - Primeros recomendados
■ 3 productos aleatorios no repetidos que pueden ser de cualquier tipo
● Debe mostrar su información.*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Lavarropas> lavarropasList = new ArrayList<>();
        List<Cocina> cocinaList = new ArrayList<>();
        List<Heladera> heladeraList = new ArrayList<>();

        String[] marcas = {"Samsung", "LG", "Whirpool", "Philips", "Atma", "Gafa", "Drean", "Candy", "Bosch", "Electrolux"};
        String[] modelos = {"Modelo1", "Modelo2", "Modelo3", "Modelo4", "Modelo5", "Modelo6", "Modelo7", "Modelo8", "Modelo9", "Modelo10"};
        //minimo 5 colores
        String[] colores = {"Blanco", "Rojo", "Azul"};
        Random random = new Random();

        //genero 10 lavarropas
        for (int i = 0; i < 10; i++) {
            Lavarropas lavarropas = new Lavarropas(marcas[random.nextInt(marcas.length)], random.nextInt(10000), modelos[random.nextInt(modelos.length)], colores[random.nextInt(colores.length)], random.nextInt(10), "Carga Frontal");
            lavarropasList.add(lavarropas);
        }
        //genera 10 heladeras
        for (int i = 0; i < 10; i++) {
            Heladera heladera = new Heladera(marcas[random.nextInt(marcas.length)], random.nextInt(10000), modelos[random.nextInt(modelos.length)], colores[random.nextInt(colores.length)], random.nextInt(1000), random.nextInt(1000));
            heladeraList.add(heladera);
        }
        //genera 10 cocinas
        for (int i = 0; i < 10; i++) {
            Cocina cocina = new Cocina(marcas[random.nextInt(marcas.length)], random.nextInt(10000), modelos[random.nextInt(modelos.length)], colores[random.nextInt(colores.length)], random.nextBoolean());
            cocinaList.add(cocina);
        }

        // Seleccionar y mostrar 3 cocinas aleatorias
        Collections.shuffle(cocinaList);
        System.out.println("recomendaciones de cocinas:");
        for (int i = 0; i < 3; i++) {
            System.out.println(cocinaList.get(i));
        }

        // Seleccionar y mostrar 3 heladeras aleatorias
        Collections.shuffle(heladeraList);
        System.out.println("recomendaciones de heladeras:");
        for (int i = 0; i < 3; i++) {
            System.out.println(heladeraList.get(i));
        }
        // Seleccionar y mostrar 3 lavarropas aleatorias
        Collections.shuffle(lavarropasList);
        System.out.println("recomendaciones de lavarropas:");
        for (int i = 0; i < 3; i++) {
            System.out.println(lavarropasList.get(i));
        }
        // Seleccionar y mostrar 3 productos generales
        List<Electrodomesctico> generalList = new ArrayList<>();
        generalList.addAll(cocinaList);
        generalList.addAll(heladeraList);
        generalList.addAll(lavarropasList);
        Collections.shuffle(generalList);
        System.out.println("recomendaciones generales:");
        for (int i = 0; i < 3; i++) {
            System.out.println(generalList.get(i));
        }

    }
}
