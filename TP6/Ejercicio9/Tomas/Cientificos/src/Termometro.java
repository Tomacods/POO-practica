import java.util.Random;
public class Termometro implements Sensor {
    private Random random = new Random();

    @Override
    public Double sensar() {
        return 5.0 + (30.0 - 5.0) * random.nextDouble();
    }
}
