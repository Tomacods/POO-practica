public class HiloProductor extends Thread{
    private Compartido compartido;

    public HiloProductor(Compartido compartido) {
        super();
        this.compartido = compartido;
    }

    @Override
    public void run() {
        for (String texto : ("hola desde el hilo "+ this.getName()).split(" ")) { //esto separa el string en palabras y las recorre
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.compartido.agregar(this.getName()+": "+texto); //agrega el texto al array
        }
        
        this.compartido.agregar("");
    }
    
}
