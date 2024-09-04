public class Fede_NoDocente extends Fede_Personal_10{
    
    private String jornada;

    public Fede_NoDocente(String nombre, String apellido, Integer antiguedad, String sector, Integer horasMensual, String jornada){
        super(nombre, apellido, antiguedad, sector, horasMensual);
        this.jornada = jornada;
    }

    // Definición método abstracto

    @Override
    public Integer horas_trabajadas(){
        switch (this.jornada){
            case "Completa": return 30;
            default: return 20;
        }
    }

    // Esto también se lo robé a tomi

    @Override
    public String toString() {
        return "- Docente: " + nombre + ", " + apellido + "   - Antiguedad: " + antiguedad + "   - Sector: " + sector + "   - Horas trabajadas: " + horasMensual + "   - Jornada: " + jornada;
    }

    // Getters y setters

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }
}
