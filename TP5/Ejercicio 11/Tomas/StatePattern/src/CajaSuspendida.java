public class CajaSuspendida implements EstadoCaja {
    @Override
    public void atenderPersona(Persona persona) {
        if (persona.getEdad() > 60) {
            System.out.println("Atendiendo a " + persona.getNombre());
        } else {
            System.out.println("Por favor, espere. Solo atendemos a personas mayores de 60 años.");
        }
    }

    @Override
    public void suspender(Caja caja) {
        System.out.println("La caja ya está suspendida.");
    }

    @Override
    public void cerrar(Caja caja) {
        caja.setEstado(new CajaCerrada());
        System.out.println("Caja cerrada.");
    }

    @Override
    public void abrir(Caja caja) {
        caja.setEstado(new CajaAbierta());
        System.out.println("Caja abierta.");
    }
}