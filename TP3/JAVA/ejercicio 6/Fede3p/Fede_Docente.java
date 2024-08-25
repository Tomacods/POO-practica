public class Fede_Docente extends Fede_Persona{
    
    private String materia;

    public Fede_Docente(String nombre, String apellido, String materia){
        super(nombre, apellido);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String materia(){
        return "El docente dicta la siguiente clase" + this.materia;
    }
}
