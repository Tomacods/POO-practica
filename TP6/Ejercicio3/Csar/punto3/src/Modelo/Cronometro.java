package Modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cronometro implements Runnable, Observable {
    private Integer segundos;
    private Integer minutos;
    private Integer hora;
    private Thread hiloDeEjecucion;
    private ArrayList<Cronometrar> observers;

    public Cronometro(Integer hora, Integer minutos,Integer segundos)throws SecurityException {
        this.segundos = segundos;
        this.minutos = minutos;
        this.hora = hora;
        this.observers = new ArrayList<Cronometrar>();
        this.hiloDeEjecucion = new Thread(this);
        this.hiloDeEjecucion.setName("inicio");
    }

    public Thread getHiloDeEjecucion() {
        return hiloDeEjecucion;
    }

    @Override
    public void run(){
        synchronized (this){

            while (this.hiloDeEjecucion == Thread.currentThread()){
                try{
                    this.wait(1000);
                    if(this.segundos + 1 == 60){
                        this.segundos = 0;
                        if(this.minutos + 1 == 60){
                            this.minutos = 0;
                            if(this.hora + 1 == 24){
                                this.hora = 0;
                            }else {
                                this.hora += 1;
                            }
                        }else {
                            this.minutos += 1;
                        }
                        
                        }
                        else {
                        this.segundos += 1;
                        }
                        notificar();
                    } catch(InterruptedException ex){
                        Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE,"Se produjo una excepcion en la ejecucion.",ex);
                    }
                }
            }
        }
        public void stop(){
            Thread.currentThread().interrupt();
            this.hiloDeEjecucion = null;
        }

        @Override
        public void addObserver(Cronometrar observer) {
            observers.add(observer);
        }

        @Override
        public void removeObserver(Cronometrar observer) {
            observers.remove(observer);
        }
        @Override
        public String toString() {
            return (this.hora < 10 ? "0" + this.hora : this.hora) + ":"
                    + (this.minutos < 10 ? "0" + this.minutos : this.minutos) + ":"
                    + (this.segundos < 10 ? "0" + this.segundos : this.segundos);
            
        }
        private void notificar() {
            for (Iterator<Cronometrar> it = observers.iterator(); it.hasNext();) {
                Cronometrar iObserver = it.next();
                iObserver.update();
            }
        }
        public void start() {
            this.hiloDeEjecucion.start();
        }
}
