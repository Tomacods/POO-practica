public class Alumno extends Persona {
    
    private HistoriaAcademica historial; 

    public Alumno(String nombre, String apellido, Integer dni){
        super(nombre, apellido, dni);
    }

    public void ingresarNota(String materia, Integer nota){
        this.historial.agregarMateria(materia, nota);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Historial academico: " + historial.imprimirHistoria();
    }
}
