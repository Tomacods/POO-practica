
import java.util.ArrayList;


public class CargarFamilias {
    private static final ArrayList<CargarFamilias> familias = new ArrayList<>();
    private final ArrayList<PersonaCenso> personas = new ArrayList<>();
    private String direccion;

    public CargarFamilias(String direccion, int cantidadPersonas) {
        this.direccion = direccion;
        familias.add(this);
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getDireccion() {
        return direccion;
    }
    public void addPersona(PersonaCenso persona) {
        personas.add(persona);
    }
    public ArrayList<PersonaCenso> getPersonas() {
        return personas;
    }
    public void contarPersonas() {
        System.out.println("Cantidad de personas de la familia: " + personas.size());
    }
    public void contarPersonasTrabajan() { //parte del ejercicio 9 del trabajo practico 2
        int contador = 0;
        for (PersonaCenso persona : personas) {
            if (persona.getEstudia_Trabaja()) {
                contador++;
            }
        }
        System.out.println("Cantidad de personas que trabajan: " + contador);
    }
    public void promedioEdad() { //parte del ejercicio 9 del trabajo practico 2
        int sumaEdades = 0;
        for (PersonaCenso persona : personas) {
            sumaEdades += persona.getEdad();
        }
        System.out.println("Promedio de edad de las personas censadas: " + sumaEdades / personas.size());
    }
    public void addFamilia(CargarFamilias familia) { //carga de familias para el ejercicio 9 del trabajo practico 2
        familias.add(familia);
    }
    
    public ArrayList<CargarFamilias> getFamilias() { //parte del ejercicio 9 del trabajo practico 2
        return familias;
    }

    public int ContarFamilias (){ //parte del ejercicio 9 del trabajo practico 2
        return familias.size();
    }
    public void PuedenTrabajar () { //parte del ejercicio 10 del trabajo practico 2
        for (PersonaCenso persona : personas) {
            if (persona.getEdad() >= 16 && persona.getEdad() <= 65) {
                if (persona.getEstudia_Trabaja()) {
                    System.out.println(persona.getNombre() + " " + persona.getApellido() + " puede trabajar");
                } else {
                    System.out.println(persona.getNombre() + " " + persona.getApellido() + " no puede trabajar");
                }
            }
        }
        
    }
    public void PuedenManejar () { //parte del ejercicio 10 del trabajo practico 2
        for (PersonaCenso persona : personas) {
            if (persona.getEdad() >= 17) {
                System.out.println(persona.getNombre() + " " + persona.getApellido() + " puede manejar");
            } else {
                System.out.println(persona.getNombre() + " " + persona.getApellido() + " no puede manejar");
            }
        }
    }

    
    public void PuedeTrabajar2(String nombre, String apellido) { //la misma funcion que antes pero esta vez con parametros
        System.out.println("Nombre: " + nombre + " Apellido: " + apellido);
        for (PersonaCenso persona : personas) {
            if (persona.getNombre().equals(nombre) && persona.getApellido().equals(apellido)) {
                if (persona.getEdad() >= 16 && persona.getEdad() <= 65) {
                    if (persona.getEstudia_Trabaja()) {
                        System.out.println(persona.getNombre() + " " + persona.getApellido() + " puede trabajar");
                    } else {
                        System.out.println(persona.getNombre() + " " + persona.getApellido() + " no puede trabajar");
                    }
                }
            }
        }
    }


}

