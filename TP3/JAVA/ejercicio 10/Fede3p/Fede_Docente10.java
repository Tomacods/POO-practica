public class Fede_Docente10 extends Fede_Personal_10{

    private String categoria;

    public Fede_Docente10(String nombre, String apellido, Integer antiguedad, String sector, Integer horasMensual, String categoria){
        super(nombre, apellido, antiguedad, sector, horasMensual);
        this.categoria = categoria;
    }

    @Override
    public Integer horas_trabajadas(){
        switch (this.categoria){
            case "Simple": return 10;
            case "Semiexcusiva": return 20;
            default: return 20;
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
