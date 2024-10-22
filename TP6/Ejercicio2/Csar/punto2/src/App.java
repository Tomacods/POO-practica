public class App {
    public static void main(String[] args) throws Exception {
        Contador tarea = new Contador();
        Thread hilo = new Thread(tarea);
        Thread hilo2 = new Thread(tarea);
        Thread hilo3 = new Thread(tarea);
        Thread hilo4 = new Thread(tarea);
        
        hilo.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        try{
            hilo.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Valor final del contador "+ tarea.getContador());
        
    }
}
