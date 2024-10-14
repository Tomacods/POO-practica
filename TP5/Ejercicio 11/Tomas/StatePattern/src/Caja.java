public class Caja {
    private String nombreCajero;
    private EstadoCaja estado;

    public Caja(String nombreCajero) {
        this.nombreCajero = nombreCajero;
        this.estado = new CajaCerrada(); // Estado inicial
    }

    public void setEstado(EstadoCaja estado) {
        this.estado = estado;
    }

    public void atenderPersona(Persona persona) {
        estado.atenderPersona(persona);
    }

    public void suspender() {
        estado.suspender(this);
    }

    public void cerrar() {
        estado.cerrar(this);
    }

    public void abrir() {
        estado.abrir(this);
    }
}