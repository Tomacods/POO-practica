
/*El personal no docente puede tener dos tipos de jornadas asignadas:
● Completa: 30 hs semanales
● Reducida: 20 hs semanales */
public class NoDocente extends Personal {
    private String cargo;

    public NoDocente(String nombre, Integer antiguedad, String sector, Integer horasTrabajadas, String cargo) {
        super(nombre, antiguedad, sector, horasTrabajadas);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public Integer HorasTrabajadas() {
        switch (this.cargo) {
            case "Completa":
                return 30;
            default:
                return 20; // Reducida
        }
    }
    
    @Override
    public String toString() {
        return "NoDocente{" + "nombre=" + nombre + ", antiguedad=" + antiguedad + ", sector=" + sector + ", horasTrabajadas=" + horasTrabajadas + ", cargo=" + cargo + '}';
    }
    
}
