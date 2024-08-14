import java.time.LocalDate;

public class Main {
    public static void main (String[] args){
        Persona persona1 = new Persona ("Mora", "Molina", LocalDate.of(2003, 7, 25) );
        Persona persona2 = new Persona ("Anibal", "Molina", LocalDate.of(1975, 8, 25) );
        Persona persona3 = new Persona ("Tobias", "Molina", LocalDate.of(2012, 7, 11) );

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        
    } 
}
