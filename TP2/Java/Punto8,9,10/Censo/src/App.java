package Censo.src;

import java.util.ArrayList;


    public class Censo {
        public static void Main (String[] args) {
            CargarFamilias cargarFamilias = new CargarFamilias("Calle falsa 123", 4);
            cargarFamilias.setCantidadFamilias(3);
            cargarFamilias.cargarFamilias();
            ArrayList<PersonaCenso> personas = cargarFamilias.getPersonas();
            for (PersonaCenso persona : personas) {
                System.out.println("Nombre: " + persona.getNombre() + " " + persona.getApellido());
                System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
                System.out.println("Sexo: " + persona.getSexo());
                System.out.println("Estudia o trabaja: " + persona.getEstudia_Trabaja());
                System.out.println("Edad: " + persona.getEdad());
            }
            
            PersonaCenso persona = new PersonaCenso("Nombre", "Apellido", LocalDate.of(1999, 10, 10), "Masculino", true);
            PersonaCenso persona2 = new PersonaCenso("Nombre2", "Apellido2", LocalDate.of(1999, 10, 10), "Femenino", false);
            PersonaCenso persona3 = new PersonaCenso("Nombre3", "Apellido3", LocalDate.of(1999, 10, 10), "Masculino", true);
            //necesito agregar las 3 personas a la lista de personas de la clase CargarFamilias
            cargarFamilias.addPersona(persona);
            cargarFamilias.addPersona(persona2);
            cargarFamilias.addPersona(persona3);
        }
    }


