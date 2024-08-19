import java.util.ArrayList;

public class Familia {
    private String direccion;
    private ArrayList <PersonaCenso> personas = new ArrayList<>();

    public Familia(String direccion){
        this.direccion = direccion;
    }

    public String getDireccion(){
        return direccion;
    }
    public void SetDireccion(String direccion){
        this.direccion = direccion;
    }
    public ArrayList<PersonaCenso> getPersonas(){
        return personas;
    }
    public void setPersonas (ArrayList <PersonaCenso> persona){
        this.personas = persona;
    }
    public void addPersona (PersonaCenso personaCenso){
        this.personas.add(personaCenso);
        puedeManejar();
        puedeTrabajar();
    }

    public int cont_personas (){
    return personas.size();
    }  
    public void puedeTrabajar() {
        for (PersonaCenso persona : personas)
        if (persona.getEdad() > 17) {
            persona.setTrabajo(true);
        } 
        else {
            persona.setTrabajo(false);
        }
    } 
    public void puedeManejar() {
        for (PersonaCenso persona : personas)
        if (persona.getEdad() > 15) {
            persona.setManejar(true);
        } 
        else {
            persona.setManejar(false);
        }
    }


    @Override
    public String toString() {
        return """
            \n Familia:
            DIRECCION:""" + direccion + 
        "\n"+"Cantidad de personas=" + cont_personas() + 
        "\n"+ "Personas:" +"\n"+ personas + "\n";
    }


    public int sumaEdades(){
        int acc= 0;
        for (PersonaCenso persona: personas){
            acc+= persona.getEdad();
        }
        return acc;
    }

    public int personasTrabajan(){
        int acc_trabajo= 0;
        for (PersonaCenso persona: personas){
            acc_trabajo+= persona.getOcupacion();
        }
        return acc_trabajo;

    }

    
}
    




