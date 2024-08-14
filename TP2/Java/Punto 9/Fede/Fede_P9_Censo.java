import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
//import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Fede_P9_Censo {
    
    public static void main(String[] args) throws Exception{
        
        Integer cantFamilias = 0;
        Integer cantCensados = 0;
        Double totalEdad = 0.0;
        Double promEdad;
        Integer trabajan = 0;

        ArrayList<Fede_P9_Familia> familias = new ArrayList<>();

        //Familia 1

        Fede_P9_Persona per1 = new Fede_P9_Persona("Federica", "Roldán", LocalDate.of(2003, Month.SEPTEMBER, 22), "Femenino", false, true);
        Fede_P9_Persona per2 = new Fede_P9_Persona("Santiago", "Roldán", LocalDate.of(2006, Month.JUNE, 28), "Masculino", false, true);
        Fede_P9_Persona per3 = new Fede_P9_Persona("Andrea", "Bravo", LocalDate.of(1977, Month.NOVEMBER, 21), "Femenino", true, true);
        Fede_P9_Persona per4 = new Fede_P9_Persona("Marcelo", "Roldán", LocalDate.of(1974, Month.MARCH, 04), "Masculino", true, false);

        Fede_P9_Familia fam1 = new Fede_P9_Familia("Familia Roldán");

        fam1.addPersona(per1);
        fam1.addPersona(per2);
        fam1.addPersona(per3);
        fam1.addPersona(per4);
        familias.add(fam1);
        cantCensados = cantCensados + fam1.cantidad();

        //Familia 2

        Fede_P9_Familia fam2 = new Fede_P9_Familia("Familia Berrios");

        Fede_P9_Persona per5 = new Fede_P9_Persona("Lorena", "Bravo", LocalDate.of(2003, Month.SEPTEMBER, 22), "Femenino", true, true);
        Fede_P9_Persona per6 = new Fede_P9_Persona("Lonkimey", "Berrios", LocalDate.of(2006, Month.JUNE, 28), "Masculino", false, true);
        Fede_P9_Persona per7 = new Fede_P9_Persona("Maiten", "Berrios", LocalDate.of(1977, Month.NOVEMBER, 21), "Femenino", false, true);

        fam2.addPersona(per5);
        fam2.addPersona(per6);
        fam2.addPersona(per7);
        familias.add(fam2);
        cantCensados = cantCensados + fam2.cantidad();

        //Familia 3

        Fede_P9_Familia fam3 = new Fede_P9_Familia("Familia Bravo");

        Fede_P9_Persona per8 = new Fede_P9_Persona("Leonardo", "Bravo", LocalDate.of(2003, Month.SEPTEMBER, 22), "Masculino", true, false);
        Fede_P9_Persona per9 = new Fede_P9_Persona("Catalina", "Bravo", LocalDate.of(2006, Month.JUNE, 28), "Femenino", false, true);
        Fede_P9_Persona per10 = new Fede_P9_Persona("Paula", "Bravo", LocalDate.of(1977, Month.NOVEMBER, 21), "Femenino", false, true);

        fam3.addPersona(per8);
        fam3.addPersona(per9);
        fam3.addPersona(per10);
        familias.add(fam3);
        cantCensados = cantCensados + fam3.cantidad();

        for(Fede_P9_Familia fam:familias){
            System.out.println(fam.getFlia());
            cantFamilias = cantFamilias + 1;
            System.out.println("Esta familia tiene " + fam.cantidad() + " integrantes:");
            for(Fede_P9_Persona per: fam.getPersonas()){
                per.imprimir();
                totalEdad = totalEdad + ChronoUnit.YEARS.between(per.getNacimiento(), LocalDate.now());
                if (per.getTrabaja() == true){
                    trabajan = trabajan + 1;
                }
            }
        }
        System.out.println("Hay " + cantFamilias + " familias censadas.");
        promEdad = totalEdad/cantCensados;
        System.out.println("La edad promedio es " + promEdad + ".");
        System.out.println("En total, trabajan " + trabajan + " personas.");
    }
}