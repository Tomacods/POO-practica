
import java.util.Scanner;
import java.time.LocalDate;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Puesto puesto1 = new Puesto("Gerente");
        Puesto puesto2 = new Puesto("Administrativo");
        Puesto puesto3 = new Puesto("Tesorero");

        PersonaTomas persona1 = new PersonaTomas("Juan", "Perez", LocalDate.of(1990, 1, 1), "Masculino", true, puesto2);
        PersonaTomas persona2 = new PersonaTomas("Maria", "Gomez", LocalDate.of(1995, 2, 2), "Femenino", false, puesto2);
        PersonaTomas persona3 = new PersonaTomas("Pedro", "Gonzalez", LocalDate.of(2000, 3, 3), "Masculino", true, puesto2);
        PersonaTomas persona4 = new PersonaTomas("Ana", "Rodriguez", LocalDate.of(2005, 4, 4), "Femenino", false, puesto1);
        PersonaTomas persona5 = new PersonaTomas("Lucas", "Fernandez", LocalDate.of(2010, 5, 5), "Masculino", true, puesto3);


        EmpresaTomas empresa = new EmpresaTomas("Empresa1", "Direccion1");
        empresa.addEmpleado(persona1);
        empresa.addEmpleado(persona2);
        empresa.addEmpleado(persona3);
        empresa.addEmpleado(persona4);
        empresa.addEmpleado(persona5);

        empresa.imprimirEmpleados();
        empresa.ContarEmpleados();

        while (true) { 
            System .out.println("desea agregar un empleado? (s/n)");
            String respuesta = scanner.nextLine();
            if (respuesta.equals("n")) {
                break;
            }
            System.out.println("Ingrese el nombre del empleado: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el apellido del empleado: ");
            String apellido = scanner.nextLine();
            System.out.println("Ingrese la fecha de nacimiento del empleado: ");
            String fechaNacimiento = scanner.nextLine();
            System.out.println("Ingrese el sexo del empleado: ");
            String sexo = scanner.nextLine();
            System.out.println("Ingrese si el empleado trabaja o estudia: ");
            boolean estudia_Trabaja = scanner.nextBoolean();
            System.out.println("Ingrese el puesto del empleado: ");
            String puesto = scanner.nextLine();
            PersonaTomas11 persona = new PersonaTomas11(nombre, apellido,LocalDate.parse(fechaNacimiento), sexo, estudia_Trabaja, puesto);
            empresa.addEmpleado(persona);
            empresa.imprimirEmpleados();
            empresa.ContarEmpleados();
        }


        scanner.close();


    }
}
