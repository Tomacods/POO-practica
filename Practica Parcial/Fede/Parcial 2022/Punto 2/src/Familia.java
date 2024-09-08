import java.util.ArrayList;

public class Familia {
    
    private String familia;
    private ArrayList<Persona> personas = new ArrayList<>();

    public Familia(String familia){
        this.familia = familia;
    }

    public void addFamilia(Persona persona){
        this.personas.add(persona);
    }

    public Double promedioEdad(){
        Integer cant = 0;
        Integer edad = 0;
        for (Persona per:personas){
            cant = cant + 1;
            edad = edad + per.getEdad();            
        }
        return (double) edad/cant;
    }
    
    public void imprimir(){
        System.out.println("Familia " + getFamilia() + ":");
        System.out.println("Promedio de edad: " + promedioEdad());
        System.out.println("Integrantes:");
        for (Persona per: getPersonas()){
            System.out.println(per.getNombre());
        }
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
}
