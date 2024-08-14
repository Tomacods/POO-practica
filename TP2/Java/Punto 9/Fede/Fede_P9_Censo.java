import java.time.LocalDate;
import java.time.Month;
//import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Fede_P9_Censo {

    public static void main(String[] args) throws Exception{
        Fede_P9_Persona per1 = new Fede_P9_Persona("Federica", "Roldán", LocalDate.of(2003, Month.SEPTEMBER, 22), "Femenino", false, true);
        Fede_P9_Persona per2 = new Fede_P9_Persona("Santiago", "Roldán", LocalDate.of(2006, Month.JUNE, 28), "Masculino", false, true);
        Fede_P9_Persona per3 = new Fede_P9_Persona("Andrea", "Bravo", LocalDate.of(1977, Month.NOVEMBER, 21), "Femenino", true, true);
        Fede_P9_Persona per4 = new Fede_P9_Persona("Marcelo", "Roldán", LocalDate.of(1974, Month.MARCH, 04), "Masculino", true, false);

        ArrayList<Fede_P9_Familia> familia = new ArrayList<>();
        Fede_E9_Familia fam1 = new Fede_E9_Familia("Familia Roldán");
        fam1.addFamilia(per1);
        fam1.addFamilia(per2);
        fam1.addFamilia(per3);
        fam1.addFamilia(per4);
        familia.add(fam1);

        for(Fede_E9_Familia fam:familia){
            System.out.println(fam.getFlia());
            for(Fede_E9_Persona per: fam.getPersonas()){
                per.imprimir();
            }
        }
    }
}
