import java.util.ArrayList;

public class Materia {
    
    private String nombre;
    private Integer codigo;
    private Integer año;
    private Integer nroLegajo;
    private ArrayList<Alumno> alumnos = new ArrayList<>();

    public Materia(String nombre, Integer codigo, Integer año, Integer nroLegajo){
        this.nombre = nombre;
        this.codigo = codigo;
        this.año =año;
        this.nroLegajo = nroLegajo;
    }

    public void addAlumnos(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public void imprimirAlumnos(){
        for (Alumno alu:alumnos){
            System.out.println(alu.toString());
        }
    }

    public String toString() {
        return "Nombre: " + nombre + "      Código: " + codigo + "      Año: " + año;
    }

}
