import java.util.ArrayList;

public class Compartido {
    private ArrayList<String> array = new ArrayList<String>();

    public synchronized void agregar(String dato) {
        array.add(dato);
         notifyAll(); //no hagan el notify y vean que sucede. 
        //aca se suele agregar alguna condición como que el array solo puede tener X cantidad de elementos
        //entonces se tiene que usar un wait con un while como en el método quitar, pero con una condición
        //distinta. 
    }//si no se agrega el notifyall, el hilo consumidor se queda esperando a que se agregue algo al array, lo que produce que el hilo consumidor no termine nunca. un deadlock.

    public synchronized String quitar() {
        try {
            while (array.isEmpty()) { //cambien a if y vean que pasa ¿Por qué tiene que ser while?
                wait(0);
            wait (1000); //cambien el tiempo de espera y vean que sucede
            }
        } catch (InterruptedException e) {
            //e.printStackTrace();
            Thread.currentThread().interrupt();
            System.out.println("Se interrumpió el hilo"  + e.getMessage());
        }
        return array.remove(0);
    }
}
//otra variante es que en estos metodos se imprima lo que se esta agregando y quitando
// y en consumidor se guarden los datos, haciendo luego algún reporte u operación matematica sobre el conjunto.