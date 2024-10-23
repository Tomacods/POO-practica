import java.util.Random;
public class Corredor extends Thread {
    private Entrega entrega;
    private Integer id;
    private Integer tiempo;

    public Corredor(Entrega entrega, Integer id) {
        super();
        this.entrega = entrega;
        this.id=id;

    }

    @Override
    public void run() {
        Random random = new Random();
       // String texto= "";
        //for (String texto : ("hola desde el hilo "+ this.getName()).split(" ")) {
            try {
                entrega.esperar(id);
                tiempo= random.nextInt(5000,10001);
                
               
              //  texto = "Corredor tarda" + tiempo/1000;
                Thread.sleep(tiempo); 
                System.out.println("Corredor " + id + " tardó " + tiempo/1000 + " segundos en entregarle la posta al siguiente");
              //  System.out.println("Corredor" + id);
                entrega.pasar();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           // this.entrega.agregar(texto);
    //    }
        
      //  this.entrega.agregar("");
    }
    public Integer getTiempo(){
        return tiempo;
    }

    }

