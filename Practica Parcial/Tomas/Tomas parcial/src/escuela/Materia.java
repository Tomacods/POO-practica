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
    public void inscribirAlumno(Alumno alumno) {
        if (alumnos.contains(alumno)) {
            System.out.println("El alumno ya se encuentra inscripto en la materia");
        } else {
            alumnos.add(alumno);
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
    


}
