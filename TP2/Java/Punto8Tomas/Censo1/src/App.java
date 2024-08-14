import java.time.LocalDate;
import java.util.ArrayList;



public class App {
    public static void main(String[] args) throws Exception {
            CargarFamilias cargarFamilias = new CargarFamilias("Calle falsa 123", 4);
            ArrayList<PersonaCenso> personas = cargarFamilias.getPersonas();
            
            PersonaCenso persona = new PersonaCenso("Tomas", "Da silva", LocalDate.of(1999, 10, 10), "Masculino", true);
            PersonaCenso persona2 = new PersonaCenso("Martina", "Da silva", LocalDate.of(1999, 10, 10), "Femenino", false);
            PersonaCenso persona3 = new PersonaCenso("Paola", "Quiroga", LocalDate.of(1999, 10, 10), "Masculino", true);
            //necesito agregar las 3 personas a la lista de personas de la clase CargarFamilias
            cargarFamilias.addPersona(persona);
            cargarFamilias.addPersona(persona2);
            cargarFamilias.addPersona(persona3);

            for (PersonaCenso per : personas){
                per.imprimir();
            }
            cargarFamilias.contarPersonas();  
            }
            


    
}
