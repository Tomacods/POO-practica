/*  Desarrolle un ingreso por teclado que permita ingresar la cantidad de SMS, minutos de
llamada, Gigas y muestre como resultado la tarifa que se obtendría con cada proveedor.*/
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
            Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de SMS: ");
        int totalSMS = scan.nextInt();
        System.out.println("Ingrese la cantidad de minutos de llamada: ");
        int totalMinutos = scan.nextInt();
        System.out.println("Ingrese la cantidad de Gigas: ");
        int totalGigas = scan.nextInt();
        scan.close();
        
        TarifaProveedor claro = new Claro("Claro", totalSMS, totalMinutos, totalGigas);
        TarifaProveedor movistar = new Movistar("Movistar", totalSMS, totalMinutos, totalGigas);
        TarifaProveedor personal = new Personal("Personal", totalSMS, totalMinutos, totalGigas);

        System.out.println("Tarifa con Claro: " + claro.calcular(totalSMS, totalMinutos, totalGigas));
        System.out.println("Tarifa con Movistar: " + movistar.calcular(totalSMS, totalMinutos, totalGigas));
        System.out.println("Tarifa con Personal: " + personal.calcular(totalSMS, totalMinutos, totalGigas));
    }
}
