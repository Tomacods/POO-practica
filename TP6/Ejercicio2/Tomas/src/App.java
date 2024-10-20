
public class App {
    public static void main(String[] args) {

Contador tarea = new Contador();
Thread hilo1 = new Thread(tarea);
Thread hilo2 = new Thread(tarea);
Thread hilo3 = new Thread(tarea);
Thread hilo4 = new Thread(tarea);

hilo1.start();
hilo2.start();
hilo3.start();
hilo4.start();

try {
    hilo1.join();
    hilo2.join();
    hilo3.join();
    hilo4.join();
} catch (InterruptedException e) {
    e.printStackTrace();
}

System.out.println("Valor final del contador: " + tarea.getContador());
}
}

// Runnable: Es una interfaz funcional que debe ser implementada por cualquier clase cuyas instancias están destinadas a ser ejecutadas por un hilo. 
// La clase que implementa Runnable debe definir el método run(). Se utiliza cuando se desea que una clase sea capaz de ejecutar en un hilo, pero también puede extender otra clase.
// por otro lado thread: Es una clase que representa un hilo de ejecución. Si una clase extiende Thread, no puede extender ninguna otra clase debido a la limitación de herencia simple en Java. Se utiliza cuando se desea crear un hilo directamente.