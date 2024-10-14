public class CajaAbierta implements EstadoCaja {
    @Override
    public void atenderPersona(Persona persona) {
        System.out.println("Atendiendo a " + persona.getNombre());
    }

    @Override
    public void suspender(Caja caja) {
        caja.setEstado(new CajaSuspendida());
        System.out.println("Caja suspendida.");
    }

    @Override
    public void cerrar(Caja caja) {
        caja.setEstado(new CajaCerrada());
        System.out.println("Caja cerrada.");
    }

    @Override
    public void abrir(Caja caja) {
        System.out.println("La caja ya está abierta.");
    }
}