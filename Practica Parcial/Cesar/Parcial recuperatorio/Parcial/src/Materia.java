
import java.util.ArrayList;
public class Materia {
    private String nombre;
    private Integer codigo;
    private Integer anio;
    private Profesor profesor;
    

    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    
    public Materia(String nombre, Integer codigo, Integer anio, Profesor profesor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.anio = anio;
        this.profesor = profesor;
    }
    @Override
    public String toString() {
        return "Nombre= " + nombre +"\n"+ ", codigo=" + codigo +"\n"+ ", anio=" + anio +"\n"+ ", profesor=" + profesor +"\n";
    }

    public void InscribirAlumno (Alumno alumno){
        listaAlumnos.add(alumno);
    }

    public void listadoAlumnos(){
        for (Alumno a : listaAlumnos ){
            System.out.println(a);
        }
    }
}
