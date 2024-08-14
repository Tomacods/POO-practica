public class Materia {

private String nombre;
private String codigo;

//constructor
public Materia(String nombre, String codigo){
    this.nombre = nombre;
    this.codigo = codigo;
}

public String getNombre(){
    return this.nombre;
}

public void setNombre(String nombre){
    this.nombre = nombre;
}

public void setCodigo(String codigo){
    this.codigo = codigo;
}


}
