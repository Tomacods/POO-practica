import java.time.LocalDate; 



public class AppTomasP5 {
    
    public static void main(String[] args) {
    
    PersonaTomas persona1 = new PersonaTomas("Tomas", "Gonzalez", LocalDate.of(1999, 10, 10));

    PersonaTomas persona2 = new PersonaTomas("Juan", "Perez", LocalDate.of(1998, 11, 11));
    PersonaTomas persona3 = new PersonaTomas("Pedro", "Gomez", LocalDate.of(1997, 12, 12));


    System.out.println(persona1.toString());
    System.out.println("Edad: " + persona1.getEdad()); //parte del ejercicio 7 del trabajo practico 2
    System.out.println(persona2.toString());
    System.out.println("Edad: " + persona2.getEdad()); //parte del ejercicio 7 del trabajo practico 2
    System.out.println(persona3.toString());
    System.out.println("Edad: " + persona3.getEdad()); //parte del ejercicio 7 del trabajo practico 2
    }
}

