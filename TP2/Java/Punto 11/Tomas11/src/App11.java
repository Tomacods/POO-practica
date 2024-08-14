import java.time.LocalDate;



public class App11 {
    public static void main(String[] args) throws Exception {

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
    }
}
