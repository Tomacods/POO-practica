import java.util.ArrayList;

public class Compartido {
    private ArrayList<String> array = new ArrayList<String>();

    public synchronized void agregar(String dato) {
        array.add(dato);
        notifyAll(); //no hagan el notify y vean que sucede. 
        //aca se suele agregar alguna condición como que el array solo puede tener X cantidad de elementos
        //entonces se tiene que usar un wait con un while como en el método quitar, pero con una condición
        //distinta. 
    }

    public synchronized String quitar() {
        try {
            while (array.isEmpty()) { //cambien a if y vean que pasa ¿Por qué tiene que ser while?
                wait(0);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return array.remove(0);
    }

}
//otra variante es que en estos metodos se imprima lo que se esta agregando y quitando
// y en consumidor se guarden los datos, haciendo luego algún reporte u operación matematica sobre el conjunto.