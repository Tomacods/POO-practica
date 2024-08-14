import java.util.ArrayList;
import java.util.Scanner;

public class Fede_P9_Censo{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Boolean rta = true;
        Integer censados = 0;
        
        System.out.print("Desea ingresar una familia? (S/N)");
        String ingreso = scanner.nextLine();
        while (ingreso != "s" && ingreso != "n") {
            System.out.print("Error, ingrese una respuesta correcta! (s/n)");
            ingreso = scanner.nextLine();
        }
        if (ingreso == "s") rta = true;
        else rta = false;
        while (rta==true){
            ArrayList<Fede_P9_Familia> familia = new ArrayList<>();
            System.out.print("Ingrese el apellido de la familia: ");
        }
        
    }
}