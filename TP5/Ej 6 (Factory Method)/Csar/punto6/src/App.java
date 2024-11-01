public class App {
    public static void main(String[] args) throws Exception {
        Juego juegoDigital = FactoryJuego.crearJuego("Fisico", 123, 60.00, 25.00);
        Juego juegoFisico = FactoryJuego.crearJuego("Digital", 124, 60.00, 15.00);
        System.out.println("Precio final del juego Fisico: "+ juegoFisico.getPrecio());
        System.out.println("Precio final del juego digital: "+juegoDigital.getPrecio());
    }
}
