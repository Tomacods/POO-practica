import java.time.LocalDate;
import java.time.Month;

public class FedeApp {
    
    public static void main(String[] args) throws Exception {
        
        FedePersona persona1 = new FedePersona("Marcos", "Rodriguez", LocalDate.of(1974, Month.MARCH, 04));
        FedePersona persona2 = new FedePersona("Juana", "Viale", LocalDate.of(1977, Month.NOVEMBER, 21));
        FedePersona persona3 = new FedePersona("Mauricio", "Macri", LocalDate.of(2003, Month.SEPTEMBER, 22));
        System.out.println(persona1.toString());
        System.out.println(persona1.edad());
        System.out.println(persona2.toString());
        System.out.println(persona2.edad());
        System.out.println(persona3.toString());
        System.out.println(persona3.edad());
    }
}
