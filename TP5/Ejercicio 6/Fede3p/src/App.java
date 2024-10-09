public class App {
    public static void main(String[] args) throws Exception {
        Juego fisico = JuegoFactory.creadorJuego("Fisico", "abc1", 3455f, 3464f);
        Juego digital = JuegoFactory.creadorJuego("Digital", "def2", 4562f, 2356f);

        System.out.println("El juego físico tiene un costo de: " + fisico.getPrecio());
        System.out.println("El juego digital tiene un costo de: " + digital.getPrecio());
    }
}
