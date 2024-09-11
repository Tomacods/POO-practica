public class Profesor extends Persona {
    
    private Integer nroLegajo;

    public Profesor(String nombre, String apellido, Integer dni, Integer nroLegajo){
        super(nombre, apellido, dni);
        this.nroLegajo = nroLegajo;
    }

    /*public Integer getNroLegajo() {
        return nroLegajo;
    }


    public void setNroLegajo(Integer nroLegajo) {
        this.nroLegajo = nroLegajo;
    }*/
    
    @Override
    public String toString() {
        return super.toString() + "     Nro. de legajo: " + nroLegajo;
    }
}
