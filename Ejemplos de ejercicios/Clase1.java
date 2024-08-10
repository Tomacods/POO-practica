import java.util.Scanner; //importacion de la clase Scanner

public class Clase1 {

	public static void main(String[] args) { //Metodo principal de la clase
		
		//Ejemplo de if
		if (2 == 2) { //Comparacion de dos valores
			//Impresion por consola
			System.out.println("entro");
		} else {
			System.out.println("no entro");
		}

		//Ejemplo de for(inicializo la variable; condicion; incremento de variable)
		for (int i = 0; i < 5; i = i + 2) {
			System.out.println("cantidad de veces: " + i);
		}
		// esto es un comentario
		/*
		 * Esto igual es un comentario
		 */
		
		//Ejemplo de utilizacion de un While
		int i = 0;
		while (i < 5) {
			System.out.println("i vale  = " + i);
			i++; //incremento de la variable
		}
		
		//Ejemplo de repetir
		int j = 0;
		do {
			System.out.println("hace algo: " + j);
			j++;
		} while (j < 5);

		int p = 3;
		
		//Ejemplo de switch, case en Ada
		switch (p) {
		case 3:
			System.out.println("entro en 3");
			break;
		case 4:
			System.out.println("entro en 4");
			break;
		default:
			System.out.println("no encontro ninguna de las opciones");
		}

		int suma = 0;
		//arreglo estatico de enteros
		int[] arreglo = { 1, 2, 3, 4, 5 };
		
		//Ejemplo de for each
		for (int a : arreglo) {
			suma = suma + a;
			System.out.println("el valor de la suma es : " + suma);
		}
		
		//Ejemplo de solicitud de elemento ingresado por teclado
		//Se crea un objeto de la clase Scanner
		Scanner ingreso = new Scanner(System.in);

		Integer numeroIngresado = 0;
		String texto;

		System.out.println("ingrese un valor: ");
		//Solicitud de ingreso de elementos de tipo integer
		numeroIngresado = ingreso.nextInt();
		//Solicitud de ingreso de elemento de cualquier tipo transformandolo a String
		System.out.println("ingrese un texto: ");
		texto = ingreso.next();

		System.out.println("se ingreso el numero: " + numeroIngresado + " y el texto: " + texto);

	}
}
