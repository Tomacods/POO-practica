public class Fede_Docente extends Fede_Personal_10{

    private String categoria;

    public Fede_Docente(String nombre, String apellido, Integer antiguedad, String sector, Integer horasTrabajadasMensual, String categoria){
        super(nombre, apellido, antiguedad, sector, horasTrabajadasMensual);
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
