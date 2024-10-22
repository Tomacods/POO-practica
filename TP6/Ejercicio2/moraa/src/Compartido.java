public class Compartido {
    private Integer contador = 0;

    public synchronized void incrementar() {
        
        contador+= 1;
        System.out.println(contador);
        notifyAll(); 
    }

    public synchronized int getContador() {
        return contador;
    }

    
    
}
