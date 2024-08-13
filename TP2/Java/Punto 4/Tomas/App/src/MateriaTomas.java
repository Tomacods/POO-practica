public class MateriaTomas {
    private String nombre;
    private String codigo;
    
    public MateriaTomas(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public void setCodigo(String codigo) {
    this.codigo = codigo;
}
public String getCodigo() {
    return codigo;
}
}