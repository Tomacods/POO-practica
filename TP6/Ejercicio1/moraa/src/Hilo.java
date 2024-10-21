public class Hilo extends Thread  {
    private Integer id;

    
    public Hilo(Integer id) {
        this.id = id;
    }

    @Override
    public void run (){
        System.out.println("Hola mundo nro" + id+". Desde"+ this.getName() );
        try {
            Thread.sleep(id * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
