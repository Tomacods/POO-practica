// ??????????????
public class Hashmap {
    
    private Integer codigo;
    private Integer nota;

    public Hashmap(Integer codigo, Integer nota){
        this.codigo = codigo;
        this.nota = nota;
    }

    public String toString() {
        return "Codigo de la materia: " + codigo + "      Nota: " + nota;
    }
}
