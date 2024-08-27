public class Fede_NoDocente extends Fede_Personal_10{
    
    private String jornada;

    public Fede_NoDocente(String nombre, String apellido, Integer antiguedad, String sector, Integer horasTrabajadasMensual, String jornada){
        super(nombre, apellido, antiguedad, sector, horasTrabajadasMensual);
        this.jornada = jornada;
    }

    @Override
    public Integer horas_trabajadas(){
        switch (this.jornada){
            case "Completa": return 30;
            default: return 20;
        }
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }
}
