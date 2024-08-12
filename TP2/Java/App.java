public class App {
    public static void main(String[] args)  throws Exception { 
    Alumno alumno1 = new Alumno();
    alumno1.setNombre("Juan");
    alumno1.setApellido("Perez");
    alumno1.setDni(12345678);

    Alumno alumno2 = new Alumno("Maria", "Gomez");
    alumno2.setDni(87654321);

    System.out.println(alumno1.getNombreYapellido() + " - DNI: " + alumno1.getDni());
    System.out.println(alumno2.getNombreYapellido() + " - DNI: " + alumno2.getDni());
    
    }
}
