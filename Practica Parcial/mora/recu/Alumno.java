public class Alumno extends Persona {

    private HistorialAcademico historial;

    public Alumno (String nombre, String apellido, String dni){
        super(nombre, apellido, dni);
    }
    /* Un alumno, al finalizar la cursada, debe poder recibir una materia y su nota. Al hacerlo deberá
 poder añadir esa nota y la materia al historial académico */
    public void ingresarNota(Materia materia, Integer nota) {
    historial.ingresarNota(materia, nota);
}



public void imprimirHistorial() {
    System.out.println("Historial Académico de " + nombre + " (DNI: " + dni + "):");
    historial.imprimirHistorial();
}
    
    
}
