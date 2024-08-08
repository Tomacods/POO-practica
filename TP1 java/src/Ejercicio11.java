import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int partidasGanadas = 0;
        int partidasPerdidas = 0;

        boolean jugarDeNuevo = true;

        while (jugarDeNuevo) {
            int numero1, numero2, apuesta;

            do {
                numero1 = random.nextInt(10);
                numero2 = random.nextInt(10);
            } while (numero1 == numero2);

            
            System.out.println("Número 1: " + numero1);
            System.out.println("Número 2: " + numero2);

          
            do {
                System.out.print("Apuesta por el valor 1 o 2 (1 para el mayor): ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor, ingrese un número válido.");
                    scanner.next(); 
                }
                apuesta = scanner.nextInt();
            } while (apuesta != 1 && apuesta != 2);

           
            if ((numero1 > numero2 && apuesta == 1) || (numero2 > numero1 && apuesta == 2)) {
                System.out.println("¡Has ganado!");
                partidasGanadas++;
            } else {
                System.out.println("Has perdido.");
                partidasPerdidas++;
            }

       
            System.out.print("¿Quieres jugar de nuevo? (s/n): ");
            String respuesta = scanner.next();
            jugarDeNuevo = respuesta.equalsIgnoreCase("s");
        }

        System.out.println("Partidas ganadas: " + partidasGanadas);
        System.out.println("Partidas perdidas: " + partidasPerdidas);
    }
}

/*Desarrolle un programa que elija dos números enteros aleatorios. Si los dos números
son iguales, deberá repetir la operación hasta que los dos sean distintos. El programa
deberá preguntar si elegimos apostar por el valor 1 o el valor 2 (Gana el valor más alto).
Una vez el usuario haya introducido su apuesta se deberá mostrar los valores e indicar
si el usuario ha ganado o perdido, tras una jugada nos deberá preguntar si queremos
volver a jugar, en caso de que el usuario no lo desee se deberá mostrar la cantidad de
partidas ganadas y perdidas por este hasta el momento. El programa debe contemplar
las consistencias necesarias para que no se ingresen valores no deseados (cualquier
valor no numérico) */
