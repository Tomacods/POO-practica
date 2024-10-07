public class App {
    public static void main(String[] args) {
        Vehiculo miCoche = new Coche();
        miCoche.arrancar();
        System.out.println("Velocidad del coche: " + miCoche.obtenerVelocidad() + " km/h");
        miCoche.detener();

        Vehiculo miMoto = new Moto();
        miMoto.arrancar();
        System.out.println("Velocidad de la moto: " + miMoto.obtenerVelocidad() + " km/h");
        miMoto.detener();
    }
}
