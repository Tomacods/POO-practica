// Main.java
public class Main {
	public static void main(String[] args) {
		Modelo modelo = new Modelo();
		VIsta vista = new VIsta();
		Controlador controlador = new Controlador(modelo, vista);

		vista.setVisible(true);
	}
}
