import java.time.LocalDate;
import java.util.Scanner;

public class Fede_P11_App {
    
    public static void main(String[] args) throws Exception{
        
        Scanner scanner = new Scanner(System.in);

        //Empleado ingresado

        Fede_P11_Persona p1 = new Fede_P11_Persona("Federica", "Roldán", LocalDate.of(2003, 9, 22), "Femenino");
        Fede_P11_Empresa emp = new Fede_P11_Empresa("Esto es una empresa S.A.", "Avenida Siempreviva 742");
        emp.addPersona(p1);
        System.out.println("La empresa tiene " + emp.cantidad() + " empleados.");
        emp.imprimir();

        //ingreso manual de empleados

        //Boolean rta = true;
        while (true){
            System.out.print("Desea ingresar un empleado? (s/n)");
            String entrada = scanner.nextLine();
            if (entrada.equals("s")){
                System.out.print("Ingrese el nombre del empleado: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el apellido: ");
                String apellido = scanner.nextLine();
                System.out.print("Ingrese la fecha de nacimiento: ");
                String nacimiento = scanner.nextLine();
                LocalDate fecha = LocalDate.parse(nacimiento);
                System.out.print("Ingrese el sexo: ");
                String sexo = scanner.nextLine();
                Fede_P11_Persona nuevo = new Fede_P11_Persona(nombre, apellido, fecha, sexo);
                emp.addPersona(nuevo);}
            else {
                System.out.print("Desea salir? ");
                String salida = scanner.nextLine();
                if (salida.equals("s")){
                    break;
                }
            }
        }
        System.out.println("La empresa tiene " + emp.cantidad() + " empleados.");
        emp.imprimir();
        scanner.close();
    }
}
