import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de SMS: ");
        double total_sms = scan.nextInt();
        System.out.println("Ingrese la cantidad de minutos: ");
        double total_minutos = scan.nextInt();
        System.out.println("Ingrese la cantidad de gigas: ");
        double total_gigas = scan.nextInt();
        scan.close();

        TarifaProveedor proveedor1 = new Claro();
        TarifaProveedor proveedor2 = new Movistar();
        TarifaProveedor proveedor3 = new Personal();

        System.out.println(proveedor1.getNombre() + ": " + proveedor1.calcular(total_sms, total_minutos, total_gigas));
        System.out.println(proveedor2.getNombre() + ": " + proveedor2.calcular(total_sms, total_minutos, total_gigas));
        System.out.println(proveedor3.getNombre() + ": " + proveedor3.calcular(total_sms, total_minutos, total_gigas));
        // Movistar proveedor2 = new Movistar("Movistar");
        // Personal proveedor3 = new Personal("Personal");

        System.out.println("claro:" + proveedor1.calcular(total_sms, total_minutos, total_gigas));
    }

}
