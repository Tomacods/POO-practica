import java.util.Random;

public class Anemometro implements Sensor {
    private Random random = new Random();

    @Override
    public Double sensar() {
        return 60.0* random.nextDouble(); 
    }
}
