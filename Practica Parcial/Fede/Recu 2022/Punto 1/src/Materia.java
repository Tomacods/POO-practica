import java.util.ArrayList;

public class Materia {
    
    private String nombre;
    private Integer codigo;
    private Integer año;
    private Profesor profesor;
    private ArrayList<Alumno> alumnos;

    public Materia(String nombre, Integer codigo, Integer año, Profesor profesor){
        this.nombre = nombre;
        this.codigo = codigo;
        this.año =año;
        this.alumnos = new ArrayList<>();
    }

    public void addAlumnos(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public void imprimirAlumnos(){
        for (Alumno alu:alumnos){
            System.out.println(alu);
        }
    }

    public String inscribirAlumno(Alumno alumno){
        try {
            if (alumnos.contains(alumno)){
                throw new AlumnoInscripto("El alumno ya está inscripto en la materia.");
            }
            alumnos.add(alumno);
            return "El alumno ha sido inscripto con éxito.";
        } catch (AlumnoInscripto e){
            return e.getMessage();
        }
    }

    public String eliminarAlumno(Alumno alumno){
        try {
            if (!alumnos.contains(alumno)){
                throw new AlumnoInscripto("El alumno no está inscripto en la materia.");
            }
            alumnos.remove(alumno);
            return "El alumno ha sido eliminado con exito";
        } catch (AlumnoInscripto e){
            return e.getMessage();
        }
    }

    public void setProfesor(Profesor profesor){
        this.profesor = profesor;
    }

    public Profesor getProfesor(){
        return profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Nombre: " + nombre + "\n" + "Código: " + codigo + "\n" + "Año: " + año + "\n" + "Profesor: " + profesor + "\n" + "Alumnos: " + alumnos;
    }
}
