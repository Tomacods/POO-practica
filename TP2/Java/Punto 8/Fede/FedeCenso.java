import java.time.LocalDate;
import java.time.Month;
//import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class FedeCenso {
    
    public static void main(String[] args) throws Exception{
        Fede8_Persona per1 = new Fede8_Persona("Federica", "Roldán", LocalDate.of(2003, Month.SEPTEMBER, 22), "Femenino", false, true);
        Fede8_Persona per2 = new Fede8_Persona("Santiago", "Roldán", LocalDate.of(2006, Month.JUNE, 28), "Masculino", false, true);
        Fede8_Persona per3 = new Fede8_Persona("Andrea", "Bravo", LocalDate.of(1977, Month.NOVEMBER, 21), "Femenino", true, true);
        Fede8_Persona per4 = new Fede8_Persona("Marcelo", "Roldán", LocalDate.of(1974, Month.MARCH, 04), "Masculino", true, false);

        ArrayList<FedeFamilia> familia = new ArrayList<>();
        FedeFamilia fam1 = new FedeFamilia("Familia Roldán");
        fam1.addFamilia(per1);
        fam1.addFamilia(per2);
        fam1.addFamilia(per3);
        fam1.addFamilia(per4);
        familia.add(fam1);

        for(FedeFamilia fam:familia){
            System.out.println(fam.getFlia());
            for(Fede8_Persona per: fam.getPersonas()){
                per.imprimir();
            }
        }
    }
}
