import java.util.ArrayList;

public class Materia {
    //materias es necesario contar con nombre, código, año, un profesor y el listado de los alumnos que estén inscriptos a ella.
    private String nombre_materia;
    private String codigo_materia;
    private Integer año_materia;
    private Profesor profesor;
    private ArrayList<Alumno> alumnos = new ArrayList<>();

    public Materia(String nombre_materia, String codigo_materia, Integer año_materia, Profesor profesor) {
        this.nombre_materia = nombre_materia;
        this.codigo_materia = codigo_materia;
        this.año_materia = año_materia;
        this.profesor = profesor;
    } 

    public String getNombre_materia() {
        return nombre_materia;
    }
    public String getProfesor() {
        return profesor.toString();
    }

    
    /* Una materia debe poder recibir inscripciones de alumnos. Para cada una debe validar si el
alumno ya está inscripto, en caso negativo lo añadirá a la lista de alumnos y de lo contrario
imprimirá un mensaje en consola: "El alumno ya se encuentra inscripto en la materia". Este
proceso no añade la materia al historial académico del alumno. Dicha acción se realizará
 después. */

public void AddAlumno(Alumno alumno) {
    this.alumnos.add(alumno);
}

public void inscribirAlumno(Alumno nuevoAlumno) {
    for (Alumno alumno : alumnos) {
        if (alumno.getDni().equals(nuevoAlumno.getDni())) {
            return; // esto sale del método para no agregar el alumno nuevamente
        }
    }
    AddAlumno(nuevoAlumno);
    
}

    public String imprimirAlumnos() {
        String resultado = "Alumnos inscritos en " + nombre_materia + ":\n";
        for (Alumno alumno : alumnos) {
            resultado += "Nombre: " + alumno.getNombre() + ", DNI: " + alumno.getDni() + "\n";
        }
        return resultado.toString();
    }

@Override
public String toString() {
    return "Materia [nombre_materia=" + nombre_materia + ", codigo_materia=" + codigo_materia + ", año_materia="
            + año_materia + "]";
}


    
}
    
    
