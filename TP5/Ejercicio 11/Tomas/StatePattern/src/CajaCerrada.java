public class CajaCerrada implements EstadoCaja {
    @Override
    public void atenderPersona(Persona persona) {
        System.out.println("La caja está cerrada. No se atienden personas.");
    }

    @Override
    public void suspender(Caja caja) {
        System.out.println("La caja está cerrada. No se puede suspender.");
    }

    @Override
    public void cerrar(Caja caja) {
        System.out.println("La caja ya está cerrada.");
    }

    @Override
    public void abrir(Caja caja) {
        caja.setEstado(new CajaAbierta());
        System.out.println("Caja abierta.");
    }
}