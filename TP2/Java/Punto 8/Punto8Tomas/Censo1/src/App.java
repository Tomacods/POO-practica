import java.time.LocalDate;



public class App {
    public static void main(String[] args) throws Exception {
            CargarFamilias cargarFamilias = new CargarFamilias("Calle falsa 123",3); //direccion y cantidad de personas
            CargarFamilias cargarFamilias2 = new CargarFamilias("Calle falsa 124",4); //direccion y cantidad de personas
            CargarFamilias cargarFamilias3 = new CargarFamilias("Calle falsa 125",5); //direccion y cantidad de personas

            cargarFamilias.getPersonas(); // esto es para que se cree el array de personas
            cargarFamilias.getFamilias(); // esto es para que se cree el array de familias
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
            //cargarFamilias.addFamilia(cargarFamilias);
            // cargarFamilias.addFamilia(cargarFamilias2);
            //cargarFamilias.addFamilia(cargarFamilias3);
            
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
            //fam.contarPersonas();
           // fam.contarPersonasTrabajan(); /*    cuenta la cantidad de personas que trabajan */
            //fam.promedioEdad();
            fam.PuedenTrabajar();
            fam.PuedenManejar();
        }
    /*10. Usando lo desarrollado en el ejercicio 9, implemente la lógica necesaria para que sea posible consultar a las personas, en base a su edad:
    a. sí tienen permitido trabajar
    b. Si tienen permitido manejar un vehículo particular
    En Argentina, si bien necesitan permiso, las personas están habilitadas para trabajar a partir de los 16 años. Respecto a la licencia B para vehículos particulares, es posible obtenerla a partir de los 17 años.*/ 

}
}