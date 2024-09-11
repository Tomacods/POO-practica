package escuela;
import java.util.ArrayList;
import java.util.List;


public class Materia {
    
    private String nombre;
    private final String codigo;
    private int anio;
    private Profesor profesor;
    private List<Alumno> alumnos;
    
    public Materia(String nombre, String codigo, int anio ,Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.anio = anio;
        this.codigo = codigo;
        this.alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }


    public void imprimirAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
    public String inscribirAlumno(Alumno alumno) {
        try {
            if (alumnos.contains(alumno)) {
                throw new AlumnoInscriptoExeption("El alumno ya está inscripto en la materia");
            }
            alumnos.add(alumno);
            return "Alumno inscripto correctamente";
        } catch (AlumnoInscriptoExeption e) {
            return e.getMessage();
        }
    }


    /*Una materia debe poseer un método toString que retorne sus datos, excepto el listado de
alumnos y el profesor.*/
    @Override
    public String toString() {
        return "nombre=" + nombre + ", codigo=" + codigo ;
    }

    public String getCodigo() {
        return codigo;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public List<Alumno> getAlumnos() {
        return alumnos;
    }
    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    //Añadir un método para eliminar la inscripción de un alumno a una materia. Debe incluir un caso de prueba para validarlo.

    public String eliminarAlumno(Alumno alumno) {
        try {
            if (!alumnos.contains(alumno)) {
                throw new AlumnoInscriptoExeption("El alumno no está inscripto en la materia");
            }
            alumnos.remove(alumno);
            return "Alumno eliminado correctamente";
        } catch (AlumnoInscriptoExeption e) {
            return e.getMessage();
        }
    }

}
