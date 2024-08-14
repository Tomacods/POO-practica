import java.time.LocalDate;
import java.util.ArrayList;



public class App {
    public static void main(String[] args) throws Exception {
            CargarFamilias cargarFamilias = new CargarFamilias("Calle falsa 123",3); //direccion y cantidad de personas
            CargarFamilias cargarFamilias2 = new CargarFamilias("Calle falsa 124",4); //direccion y cantidad de personas
            CargarFamilias cargarFamilias3 = new CargarFamilias("Calle falsa 125",5); //direccion y cantidad de personas

            cargarFamilias.getPersonas(); //array de personas
            ArrayList<CargarFamilias> familias = cargarFamilias.getFamilias(); //array de familias
            //pertenecen a la familia 1:
            PersonaCenso persona = new PersonaCenso("Tomas", "Da silva", LocalDate.of(1999, 10, 10), "Masculino", true);
            PersonaCenso persona2 = new PersonaCenso("Martina", "Da silva", LocalDate.of(1999, 10, 10), "Femenino", false);
            PersonaCenso persona3 = new PersonaCenso("Paola", "Quiroga", LocalDate.of(1999, 10, 10), "Masculino", true);
            //pertenecen a la familia 2:
            PersonaCenso persona4 = new PersonaCenso("Carlos", "Perez", LocalDate.of(1985, 5, 15), "Masculino", true);
            PersonaCenso persona5 = new PersonaCenso("Lucia", "Gomez", LocalDate.of(1990, 8, 20), "Femenino", false);
            PersonaCenso persona6 = new PersonaCenso("Juan", "Martinez", LocalDate.of(2000, 12, 5), "Masculino", true);
            //pertenecen a la familia 3:
            PersonaCenso persona7 = new PersonaCenso("Maria", "Rodriguez", LocalDate.of(1995, 3, 25), "Femenino", false);
            PersonaCenso persona8 = new PersonaCenso("Pedro", "Gonzalez", LocalDate .of(1998, 7, 30), "Masculino", true);

            //familia 1
            cargarFamilias.addPersona(persona);
            cargarFamilias.addPersona(persona2);
            cargarFamilias.addPersona(persona3);
            //familia 2
            cargarFamilias2.addPersona(persona4);
            cargarFamilias2.addPersona(persona5);
            cargarFamilias2.addPersona(persona6);
            //familia 3
            cargarFamilias3.addPersona(persona7);
            cargarFamilias3.addPersona(persona8);

            //agregar familias al array de familias
            cargarFamilias.addFamilia(cargarFamilias);
            cargarFamilias.addFamilia(cargarFamilias2);
            cargarFamilias.addFamilia(cargarFamilias3);
            
        /* for (PersonaCenso per : personas){ //implementacion del ejericicio 8
            per.imprimir();
        }
        cargarFamilias.contarPersonas(); */ 


        /*ejercicio 9 :utlizando lo implementado en el ejercicio anterior, desarrollar una simnulacion que cense entre tres y cinco familias y finalmente imprima en pantalla:
        cantidad de familias censadas
        cantidad de personas censadas
        cantidad de personas que trabajan
        promedio de edad de las personas censadas */
            
        for (CargarFamilias fam : cargarFamilias.getFamilias()){
            fam.contarPersonas();
            fam.contarPersonasTrabajan(); /*    cuenta la cantidad de personas que trabajan */
            fam.promedioEdad();
        }
        int totalFamilias = familias.size();
        int totalPersonas = 0;
        int totalPersonasTrabajan = 0;
        int sumaEdades = 0;


        double promedioEdad = (double) sumaEdades / totalPersonas;

        System.out.println("Cantidad de familias censadas: " + totalFamilias);
        System.out.println("Cantidad de personas censadas: " + totalPersonas);
        System.out.println("Cantidad de personas que trabajan: " + totalPersonasTrabajan);
        System.out.println("Promedio de edad de las personas censadas: " + promedioEdad);
    
}
}