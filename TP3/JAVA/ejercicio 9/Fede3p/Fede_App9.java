import java.util.Scanner;

public class Fede_App9 {
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de mensajes deseados: ");
        Integer sms = scanner.nextInt();
        System.out.print("Ingrese la cantidad de minutos de llamada deseados: ");
        Integer min = scanner.nextInt();
        System.out.print("Ingrese la cantidad de gigas deseados: ");
        Integer gb = scanner.nextInt();

        Fede_Claro claro = new Fede_Claro("Claro", sms, min, gb);
        Fede_Personal personal = new Fede_Personal("Personal", sms, min, gb);
        Fede_Movistar movistar = new Fede_Movistar("Movistar", sms, min, gb);

        System.out.println("El proveedor " + claro.getNombre() + " ofrece una tarifa de $" + claro.totalTarifa());
        System.out.println("El proveedor " + personal.getNombre() + " ofrece una tarifa de $" + personal.totalTarifa());
        System.out.println("El proveedor " + movistar.getNombre() + " ofrece una tarifa de $" + movistar.totalTarifa());
    }
}
