import java.util.Scanner;

public class ejercicio10 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese su estatura: ");
        double estatura = scanner.nextDouble();
        double total = (peso / (estatura*estatura));
        System.out.println("El indice de masa corporal para una estatura de " + estatura + "cm y un peso de " + peso + "kg es: " + total);
        scanner.close();
    }
}
