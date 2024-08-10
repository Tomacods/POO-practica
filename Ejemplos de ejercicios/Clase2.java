import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random; // importacion de la clase Random

public class Clase2 {

	public static void main(String[] args) throws IOException {

		// Random con objeto de clase Random
		Random ran = new Random();
		System.out.println(ran.nextInt(10)); // devuelve valor de 0 a 9
		// Random con metodo de clase Math
		System.out.println(Math.random()); // devuelve valor de 0.0 a 1.0

		// Ejemplo de escritura
		File archivo = new File("C:\\archivo.txt");
	
		PrintWriter pw; // Clase para escribir en el archivo

		if (archivo.exists()) {
			FileWriter escribir = new FileWriter(archivo, true);
			pw = new PrintWriter(escribir);
			pw.println("Juan;Perez;1232321");
			escribir.close();
		} else {
			FileWriter escribir = new FileWriter(archivo);
			pw = new PrintWriter(escribir);
			pw.println("Pepe;Juan;23234234");
			escribir.close();
		}
		
		// Ejemplo de lectura de archivo

		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		String linea;
		while ((linea = br.readLine()) != null) {
			String[] datos = linea.split(";");
			System.out.println("Nombre: " + datos[0]);
			System.out.println("Apellido: " + datos[1]);
			System.out.println("DNI: " + datos[2]);
		}

	}
	/*
	 * Con el "throws IOException" hacemos que los posibles errores al operar con el
	 * archivo los maneje quien llame al metodo main
	 */

}
