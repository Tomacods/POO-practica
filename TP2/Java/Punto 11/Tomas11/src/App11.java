import java.time.LocalDate;
import java.util.Scanner;



public class App11 {
    public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    

    PersonaTomas persona = new PersonaTomas("Tomas", "Da silva", LocalDate.of(1999, 10, 10), "Masculino", true);    
    PersonaTomas persona2 = new PersonaTomas("Martina", "Da silva", LocalDate.of(1999, 10, 10), "Femenino", false);     
    PersonaTomas persona3 = new PersonaTomas("Juan", "Da silva", LocalDate.of(1999, 10, 10), "Masculino", true);
    PersonaTomas persona4 = new PersonaTomas("Pedro", "Da silva", LocalDate.of(1999, 10, 10), "Masculino", true);   
    PersonaTomas persona5 = new PersonaTomas("Maria", "Da silva", LocalDate.of(1999, 10, 10), "Femenino", false);   

    
    EmpresaTomas empresa = new EmpresaTomas("Empresa", "Direccion");   
    empresa.addEmpleado(persona);
    empresa.addEmpleado(persona2);
    empresa.addEmpleado(persona3);
    empresa.addEmpleado(persona4);
    empresa.addEmpleado(persona5);

    empresa.Imprimir();
    empresa.ContarEmpleados();
    
    while (true) { 
        System.out.println("desea agregar un empleado? si/no");
        String respuesta = sc.nextLine();
        if (respuesta.equals("si")) {
            System.out.println("Ingrese el nombre del empleado");
            String nombre = sc.nextLine();

            System.out.println("Ingrese el apellido del empleado");
            String apellido = sc.nextLine();

            System.out.println("Ingrese la fecha de nacimiento del empleado en formato yyyy-mm-dd");
            String fechaNacimientoCade = sc.nextLine();
            LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoCade);


            System.out.println("Ingrese el sexo del empleado");
            String sexo = sc.nextLine();

            System.out.println("Ingrese si el empleado trabaja o no");
            String estudia_Trabaja = sc.nextLine();

            boolean estudia_TrabajaBoolean = false;
            if (estudia_Trabaja.equals("si")) {
                estudia_TrabajaBoolean = true;
            }
            PersonaTomas NuevoEmpleado = new PersonaTomas(nombre, apellido, fechaNacimiento, sexo, estudia_TrabajaBoolean);
            empresa.addEmpleado(NuevoEmpleado);
            empresa.Imprimir();
            empresa.ContarEmpleados();
        } else {
            System.out.println("esta seguro que desea salir? si/no");
            String respuesta2 = sc.nextLine();
            if (respuesta2.equals("si")) {
            break;
        }
    }


    }
    sc.close();
    }
}
