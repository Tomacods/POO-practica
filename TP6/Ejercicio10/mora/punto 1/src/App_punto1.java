import javax.imageio.ImageIO;//https://www.delftstack.com/es/howto/java/java-imagio/ contiene varios métodos para realizar operaciones como leer o escribir una imagen.
import java.awt.image.BufferedImage; // direct access to image data, enabling a wide range of operations, including pixel manipulation, color space conversion, and raster operations
import java.io.File;
import java.io.IOException;

public class App_punto1 {

    private static BufferedImage img;

    public static void main(String[] args) {
        try {
            String ruta = "C:\\Users\\claud\\Desktop\\webcam-toy-foto1.jpg"; 
            cargarImagen(ruta);
            aplicarFiltroGrisSecuencial();
            guardarImagen("C:\\Users\\claud\\Desktop\\imagen_modificada.jpg"); 
            System.out.println("La imagen  ha sido guardada en: C:\\Users\\claud\\Desktop\\imagen_modificada.jpg");
    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

   
    private static void cargarImagen(String ruta) throws IOException {
        img = ImageIO.read(new File(ruta));
    }

    
    private static void aplicarFiltroGrisSecuencial() {
       // long inicio = System.nanoTime();
        
        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                int rgb = img.getRGB(x, y);
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = rgb & 0xFF;
                int gray = (r + g + b) / 3;
                int newPixel = (gray << 16) | (gray << 8) | gray;
                img.setRGB(x, y, newPixel);
            }
        }
        
      //  long fin = System.nanoTime();
     //   System.out.println("Tiempo secuencial: " + (fin - inicio) / 1_000_000 + " ms");
    }

   
    private static void guardarImagen(String nombreArchivo) throws IOException {
        ImageIO.write(img, "jpg", new File(nombreArchivo));
    }
}
//https://www.baeldung.com/java-image-bufferedimage-conversion
