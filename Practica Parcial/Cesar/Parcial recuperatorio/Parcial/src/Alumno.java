public class Alumno extends Persona {
    private HistorialAcademica hAcademica;

    public Alumno(String nombre, String apellido, Integer dni) {
        super(nombre, apellido, dni);
    }
    public void Ingresarnota(String materia, Integer nota){
        hAcademica.AgregarMateria(materia, nota);
    }
    public void ImprimirHistorialAcademico(){
        hAcademica.Imprimirhistorial();
    }
}
