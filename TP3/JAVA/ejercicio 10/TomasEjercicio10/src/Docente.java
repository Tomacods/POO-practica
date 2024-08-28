/*El personal docente tiene asociada una categoría que define la cantidad de horas
semanales a trabajar:
● Simple: 10 hs semanales
● Semiexclusiva: 20 hs semanales
● Exclusiva: 40 hs semanales*/
public class Docente extends Personal {
    
    private String categoria;

    public Docente(String nombre, Integer antiguedad, String sector, Integer horasTrabajadas, String categoria) {
        super(nombre, antiguedad, sector, horasTrabajadas);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public Integer HorasTrabajadas() {
        return switch (this.categoria) {
            case "Simple" -> 10;
            case "Semiexclusiva" -> 20;
            default -> 40;
        }; // Exclusiva
    }
    
    @Override
    public String toString() {
        return "Docente{" + "nombre=" + nombre + ", antiguedad=" + antiguedad + ", sector=" + sector + ", horasTrabajadas=" + horasTrabajadas + ", categoria=" + categoria + '}';
    }
}
