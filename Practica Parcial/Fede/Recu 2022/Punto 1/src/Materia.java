import java.util.ArrayList;

public class Materia {
    
    private String nombre;

    private Integer codigo;
    private Integer año;
    private Profesor profesor;
    private ArrayList<Alumno> alumnos = new ArrayList<>();

    public Materia(String nombre, Integer codigo, Integer año){
        this.nombre = nombre;
        this.codigo = codigo;
        this.año =año;
    }

    public void addAlumnos(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public void agregarProfesor(Profesor profe){
        this.profesor = profe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimirAlumnos(){
        for (Alumno alu:alumnos){
            System.out.println(alu);
        }
    }

    public String toString() {
        return "Nombre: " + nombre + "\n" + "Código: " + codigo + "\n" + "Año: " + año + "\n" + "Profesor: " + profesor + "\n" + "Alumnos: " + alumnos;
    }

}
