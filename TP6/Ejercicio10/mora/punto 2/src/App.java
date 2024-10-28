import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        try {
            BufferedImage img = ImageIO.read(new File("C:\\Users\\claud\\Desktop\\webcam-toy-foto1.jpg"));

            int numThreads = Runtime.getRuntime().availableProcessors(); //  núcleos disponibles
            System.out.println(numThreads);
            List<Thread> threads = new ArrayList<>();

            // pool
            int alturaSeccion = img.getHeight() / numThreads;

            for (int i = 0; i < numThreads; i++) { //se crean 8 hilos ya que esta compu tiene 8 nucleos
                int startY = i * alturaSeccion;
                int endY;
                    if (i == numThreads - 1) {
                        endY = img.getHeight(); 
                    } else {
                    endY = (i + 1) * alturaSeccion; 
                    }


                WorkerThread runnable = new WorkerThread(img, startY, endY);
                Thread thread = new Thread(runnable);
                threads.add(thread);
                thread.start();
            }

            
            for (Thread thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            
            ImageIO.write(img, "jpg", new File("C:\\Users\\claud\\Desktop\\imagen_pool.jpg"));
            System.out.println("La imagen  ha sido guardada en: C:\\Users\\claud\\Desktop\\imagen_pool.jpg");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
