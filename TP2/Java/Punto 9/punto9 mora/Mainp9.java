import java.util.ArrayList;

public class Mainp9{

    public static void main(String [] args) throws Exception{
    

        PersonaCenso persona1 = new PersonaCenso("Mora Molina", 21, "f", "estudia");
        PersonaCenso persona2 = new PersonaCenso("Claudia Antileff", 52, "f", "trabaja");

        Familia familia1 = new Familia("casa 34 codigo2341");
        familia1.addPersona(persona1);
        familia1.addPersona(persona2);

        //for (PersonaCenso persona : familia1.getPersonas()) {
           // System.out.println(persona);
       // }

        PersonaCenso persona3 = new PersonaCenso("Marta Dominguez", 62, "f", "trabaja");
        Familia familia2 = new Familia("casa 37 codigo2341");
        familia2.addPersona(persona3);
        //System.out.println(persona3);

        PersonaCenso persona4 = new PersonaCenso("Gonzalo Jaime", 52, "m", "trabaja");
        PersonaCenso persona5 = new PersonaCenso("Rocio Martel", 48, "f", "trabaja");
        PersonaCenso persona6 = new PersonaCenso("Francisco Jaime", 23, "f", "trabaja y estudia");
        PersonaCenso persona7 = new PersonaCenso("Luz Jaime Martel", 11, "f", "estudia");
        Familia familia3 = new Familia("casa 42 codigo2341");
        familia3.addPersona(persona4);
        familia3.addPersona(persona5);
        familia3.addPersona(persona6);
        familia3.addPersona(persona7);
        //for (PersonaCenso persona : familia3.getPersonas()) {
            //System.out.println(persona); }
            
        ArrayList<Comuna> comunas = new ArrayList<>();
            Comuna comuna1 = new Comuna("1");
            comuna1.addFamilia(familia3);
            comuna1.addFamilia(familia2);
            comuna1.addFamilia(familia1);

            comunas.add(comuna1);
            
        int totalPersonas = 0;
        for (Comuna comuna: comunas){
            System.out.println(comuna);
            for (Familia familia: comuna.getFamilias()){
                totalPersonas += familia.cont_personas(); 
                promedioEdad = familia.sumaEdades() / totalPersonas;
            }
            System.out.println("-----------");
        }
    System.out.println("Total de personas censadas: "+totalPersonas);
    System.out.println(promedioEdad);

    }
}