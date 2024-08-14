import java.time.LocalDate;
import java.time.Month;
//import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Fede_P9_Censo {
    
    public static void main(String[] args) throws Exception{
        
        Integer cantFamilias = 0;
        Integer cantCensados = 0;

        ArrayList<Fede_P9_Familia> familias = new ArrayList<>();

        //Familia 1

        Fede_P9_Familia fam1 = new Fede_P9_Familia("Familia Roldán");

        Fede_P9_Persona per1 = new Fede_P9_Persona("Federica", "Roldán", LocalDate.of(2003, Month.SEPTEMBER, 22), "Femenino", false, true);
        Fede_P9_Persona per2 = new Fede_P9_Persona("Santiago", "Roldán", LocalDate.of(2006, Month.JUNE, 28), "Masculino", false, true);
        Fede_P9_Persona per3 = new Fede_P9_Persona("Andrea", "Bravo", LocalDate.of(1977, Month.NOVEMBER, 21), "Femenino", true, true);
        Fede_P9_Persona per4 = new Fede_P9_Persona("Marcelo", "Roldán", LocalDate.of(1974, Month.MARCH, 04), "Masculino", true, false);

        fam1.addFamilia(per1);
        fam1.addFamilia(per2);
        fam1.addFamilia(per3);
        fam1.addFamilia(per4);
        familias.add(fam1);

        //Familia 2

        Fede_P9_Familia fam2 = new Fede_P9_Familia("Familia Roldán");

        Fede_P9_Persona per5 = new Fede_P9_Persona("Federica", "Roldán", LocalDate.of(2003, Month.SEPTEMBER, 22), "Femenino", false, true);
        Fede_P9_Persona per6 = new Fede_P9_Persona("Santiago", "Roldán", LocalDate.of(2006, Month.JUNE, 28), "Masculino", false, true);
        Fede_P9_Persona per7 = new Fede_P9_Persona("Andrea", "Bravo", LocalDate.of(1977, Month.NOVEMBER, 21), "Femenino", true, true);
        Fede_P9_Persona per8 = new Fede_P9_Persona("Marcelo", "Roldán", LocalDate.of(1974, Month.MARCH, 04), "Masculino", true, false);

        fam1.addFamilia(per5);
        fam1.addFamilia(per6);
        fam1.addFamilia(per7);
        fam1.addFamilia(per8);
        familias.add(fam2);

        for(FedeFamilia fam:familias){
            System.out.println(fam.getFlia());
            for(Fede8_Persona per: fam.getPersonas()){
                per.imprimir();
            }
        }
    }
}