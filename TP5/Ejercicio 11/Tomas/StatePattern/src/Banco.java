public class Banco {
    private Caja caja;

    public Banco(String nombreCajero) {
        this.caja = new Caja(nombreCajero);
    }

    public void atenderPersona(Persona persona) {
        caja.atenderPersona(persona);
    }

    public void suspenderCaja() {
        caja.suspender();
    }

    public void cerrarCaja() {
        caja.cerrar();
    }

    public void abrirCaja() {
        caja.abrir();
    }
}