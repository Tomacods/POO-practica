

public class Entrega {
    private Integer nro_pasada = 1;

    public synchronized void esperar(Integer id) throws InterruptedException {
        while (id != nro_pasada){
        wait();  }
    }

    public synchronized void pasar () {
        nro_pasada++;
        notifyAll();
    }
    /*private Integer nro_pasada;
    public void pasar_posta(){
        nro_pasada= 0;
        nro_pasada++;
    }
    public boolean listo (){
        return nro_pasada >= 4;

    } */

}
