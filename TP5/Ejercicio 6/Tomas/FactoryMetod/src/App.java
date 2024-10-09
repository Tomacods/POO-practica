public class App {
    public static void main(String[] args) throws Exception {
        Juego juegoFisico = JuegoFactory.crearJuego("fisico", "001", 50f, 10f);
        Juego juegoDigital = JuegoFactory.crearJuego("digital", "002", 50f, 1.2f);

        System.out.println("Precio del juego físico: " + juegoFisico.getPrecio());
        System.out.println("Precio del juego digital: " + juegoDigital.getPrecio());
    }
}