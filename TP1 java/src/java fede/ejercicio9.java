import java.util.Scanner;
import java.util.Random;

public class ejercicio9 {
    
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    System.out.print("Ingrese un valor: ");
    int num = scanner.nextInt();
    int ran = random.nextInt();
    if (num == ran) System.out.println(num + " es igual a " + ran);
    else if (num > ran) System.out.println(num + " es mayor a " + ran);
        else System.out.println(num + " es menor a " + ran);
    scanner.close();
    }
}