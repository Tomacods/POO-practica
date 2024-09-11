package escuela;


public class Alumno extends Persona {

    /* su historial académico.
Para el historial académico se contará con una clase que contendrá un hashmap de materias
como clave y una nota de tipo integer */

    private final HistorialAcademico historialAcademico;

    public Alumno(String nombre, String apellido, int dni, int historialAcademico) {
        super(nombre, apellido, dni);
        this.historialAcademico = new HistorialAcademico();
    }


    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni;
    }

    public HistorialAcademico getHistorialAcademico() {
        return historialAcademico;
        }

        public void ImprimirHistorial() {
        System.out.println(historialAcademico);
        System.out.println("Promedio: " + calcularPromedio());
        }

        private double calcularPromedio() {
        return historialAcademico.calcularPromedio();
        }


    /**Un historial académico de un alumno debe poder recibir una materia y una nota para asignarla
a su hashmap. Además, debe poseer un método para imprimir todo el historial académico del
alumno/ */
    public void agregarMateriaNota(String materia, int nota) {
        historialAcademico.agregarMateriaNota(materia, nota);
    }



}
