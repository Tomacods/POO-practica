public class App {
    public static void main(String[] args) throws Exception {
        Banco banco1 = new Banco("Carlos");

        Cliente p1 = new Cliente("Marta", 70);
        Cliente p2 = new Cliente("Marcelo", 50);

        banco1.abrirCaja();

        banco1.atender(p1);
        banco1.atender(p2);

        System.out.println("--------");

        banco1.suspenderCaja();

        banco1.atender(p1);
        banco1.atender(p2);

        System.out.println("--------");

        banco1.cerrarCaja();

        banco1.atender(p1);
        banco1.atender(p2);
    }
}
