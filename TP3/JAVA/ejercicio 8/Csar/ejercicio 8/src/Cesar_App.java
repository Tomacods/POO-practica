import java.util.ArrayList;

public class Cesar_App {
    public static void main(String[] args) throws Exception {
        ArrayList<Cesar_Titular> titulares = new ArrayList<>();
        ArrayList<Cesar_Suplente> suplentes = new ArrayList<>();

        titulares.add(new Cesar_Titular("Aldana", "Gutierrez", 40, 40, 15));
        titulares.add(new Cesar_Titular("Pedro", "Perez", 30, 30, 4));
        titulares.add(new Cesar_Titular("Maria", "Gomez", 29, 40, 1));
        suplentes.add(new Cesar_Suplente("Tomas", "Sosa", 28, 40));
        suplentes.add(new Cesar_Suplente("Luciana", "Torres", 35, 10));

        for(Cesar_Titular prof: titulares){
            System.out.println("Nombre y apellido " + prof.getNombre() + ", " + prof.getApellido());
            System.out.print("Es titular? Si");
            System.out.printf("%nRemuneracion: %.2f", prof.getRemuneracionMensual());
            System.out.println(" ");
        }
        for(Cesar_Suplente prof: suplentes){
            System.out.println("Nombre y apellido: " + prof.getNombre() + ", " + prof.getApellido());
            System.out.print("Es titular? No");
            System.out.printf("%nRemuneracion: %.2f", prof.getRemuneracionMensual());
            System.out.println(" ");
        }
    }
}
