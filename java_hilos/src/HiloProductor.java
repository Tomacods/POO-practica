public class HiloProductor extends Thread{
    private Compartido compartido;

    public HiloProductor(Compartido compartido) {
        super();
        this.compartido = compartido;
    }

    @Override
    public void run() {
        for (String texto : ("hola desde el hilo "+ this.getName()).split(" ")) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.compartido.agregar(this.getName()+": "+texto);
        }
        
        this.compartido.agregar("");
    }
    
}
