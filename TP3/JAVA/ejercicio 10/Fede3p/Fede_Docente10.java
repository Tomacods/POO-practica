public class Fede_Docente10 extends Fede_Personal_10{

    private String categoria;

    public Fede_Docente10(String nombre, String apellido, Integer antiguedad, String sector, Integer horasMensual, String categoria){
        super(nombre, apellido, antiguedad, sector, horasMensual);
        this.categoria = categoria;
    }

    // Definición del método abstracto

    @Override
    public Integer horas_trabajadas(){
        switch (this.categoria){
            case "Simple": return 10;
            case "Semiexcusiva": return 20;
            default: return 20;
        }
    }

    // Esto se lo robé a tomi, tomi pq

    @Override
    public String toString() {
        return "- Docente: " + nombre + ", " + apellido + "   - Antiguedad: " + antiguedad + "   - Sector: " + sector + "   - Horas trabajadas: " + horasMensual + "   - Categoria: " + categoria;
    }

    // Getters y setters
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
