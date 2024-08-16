import java.time.LocalDate;

public class Fede_P12_App {
    
    public static void main(String[] args) throws Exception {
        
        //Puestos

        Fede_P12_Puesto administrativo = new Fede_P12_Puesto("Administrativo");
        Fede_P12_Puesto gerente = new Fede_P12_Puesto("Gerente");
        Fede_P12_Puesto tesorero = new Fede_P12_Puesto("Tesorero");

        //Personas de empresa

        Fede_P12_Persona p1 = new Fede_P12_Persona("Federica", "Roldán", LocalDate.of(2003, 9, 22), "Femenino", administrativo);
        Fede_P12_Persona p2 = new Fede_P12_Persona("Mora", "Molina", LocalDate.of(2003, 9, 22), "Femenino", administrativo);
        Fede_P12_Persona p3 = new Fede_P12_Persona("César", "Millavanque", LocalDate.of(2003, 9, 22), "Masculino", administrativo);
        Fede_P12_Persona p4 = new Fede_P12_Persona("Tomás", "Da Silva", LocalDate.of(2003, 9, 22), "Masculino", gerente);
        Fede_P12_Persona p5 = new Fede_P12_Persona("Franco", "Berro", LocalDate.of(2003, 9, 22), "Masculino", tesorero);

        Fede_P12_Empresa empresa = new Fede_P12_Empresa("Esto es una empresa S.A.", "Avenida Siempreviva 742.");
        empresa.addPersona(p1);
        empresa.addPersona(p2);
        empresa.addPersona(p3);
        empresa.addPersona(p4);
        empresa.addPersona(p5);
        System.out.println("La empresa tiene " + empresa.cantidad() + " empleados.");
        empresa.imprimir();
    }
}
