public class Alumno extends Persona {
    
    private HistoriaAcademica historial;

    public Alumno(String nombre, String apellido, Integer dni){
        super(nombre, apellido, dni);
        this.historial = new HistoriaAcademica();
    }

    public void ingresarNota(String materia, Integer nota){
        historial.agregarMateria(materia, nota);
    }

    public void ImprimirHistorialAcademico(String alumno) {
        historial.imprimirHistorial(alumno);
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
