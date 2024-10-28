import java.awt.image.BufferedImage;

public class WorkerThread implements Runnable {
    private BufferedImage img;
    private int startY, endY;

    public WorkerThread(BufferedImage img, int startY, int endY) {
        this.img = img;
        this.startY = startY;
        this.endY = endY;
    }

    @Override
    public void run() {
        int width = img.getWidth();
        for (int y = startY; y < endY; y++) {
            for (int x = 0; x < width; x++) {
                int rgb = img.getRGB(x, y);
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = rgb & 0xFF;
                int gray = (r + g + b) / 3;
                int newPixel = (gray << 16) | (gray << 8) | gray;
                img.setRGB(x, y, newPixel); 
            }
        }
    }
}
