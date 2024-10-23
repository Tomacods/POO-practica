package Modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sound.midi.Track;

public class Cronometro implements Runnable, Observable {

    private Integer seg;
    private Integer min;
    private Integer hs;
    private Thread hilos;
    private ArrayList<Cronometrar> observers;

    public Cronometro (Integer hs, Integer min, Integer seg) throws SecurityException {
        this.seg = seg;
        this.min = min;
        this.hs = hs;
        this.observers = new ArrayList<Cronometrar>();
        this.hilos = new Thread(this);
        this.hilos.setName("inicio");
    }

    public Thread getHilo() {
        return hilos;
    }

    @Override
    public void run() {
        synchronized (this) {
            while (this.hilos == Thread.currentThread()) {
                try {
                    this.wait(1000);
                    if (this.seg + 1 == 60) {
                        this.seg = 0;
                        if (this.min == 60) {
                            this.min = 0;
                            if (this.hs + 1 == 24) {
                                this.hs = 0;
                            } else {
                                this.hs += 1;
                            }
                        } else {
                            this.min += 1;
                        }
                    } else {
                        this.seg += 1;
                    }
                    notificar();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, "Se produjo una excepcion en la ejecucion.", ex);
                }
            }
        }
    }
    
    public void stop() {
        Thread.currentThread().interrupt();
        this.hilos = null;
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
        return (this.hs < 10 ? "0" + this.hs : this.hs) + ":" + (this.min < 10 ? "0" + this.min : this.min) + ":" + (this.seg < 10 ? "0" + this.seg : this.seg);
    }

    private void notificar() {
        for (Iterator<Cronometrar> it = observers.iterator(); it.hasNext();) {
            Cronometrar iObserver = it.next();
            iObserver.update();
        }
    }

    public void start() {
        this.hilos.start();
    }
}