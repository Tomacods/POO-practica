import java.util.ArrayList;

public class Fede_App {
    
    public static void main(String[] args) throws Exception{
        
        ArrayList<Fede_Titular> titulares = new ArrayList<>();
        ArrayList<Fede_Suplente> suplentes = new ArrayList<>();

        titulares.add(new Fede_Titular("Aldana", "Gutierrez", 40, 40, 15));
        titulares.add(new Fede_Titular("Pedro", "Perez", 30, 30, 4));
        titulares.add(new Fede_Titular("Maria", "Gomez", 29, 40, 1));
        suplentes.add(new Fede_Suplente("Tomas", "Sosa", 28, 40));
        suplentes.add(new Fede_Suplente("Luciana", "Torres", 35, 10));

        for(Fede_Titular prof: titulares){
            System.out.println("Nombre y apellido " + prof.getNombre() + ", " + prof.getApellido());
            System.out.print("Es titular? Si");
            System.out.printf("%nRemuneracion: %.2f", prof.getRemuneracionMensual());
            System.out.println(" ");
        }

        for(Fede_Suplente prof: suplentes){
            System.out.println("Nombre y apellido: " + prof.getNombre() + ", " + prof.getApellido());
            System.out.print("Es titular? No");
            System.out.printf("%nRemuneracion: %.2f", prof.getRemuneracionMensual());
            System.out.println(" ");
        }
    }
}
