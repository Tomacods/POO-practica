public class App {
    public static void main(String[] args) {
        Banco banco = new Banco("Juan");

        Persona persona1 = new Persona("Carlos", 30);
        Persona persona2 = new Persona("Ana", 65);

        banco.abrirCaja();
        banco.atenderPersona(persona1);

        banco.suspenderCaja();
        banco.atenderPersona(persona1);
        banco.atenderPersona(persona2);

        banco.cerrarCaja();
        banco.atenderPersona(persona1);
    }
}