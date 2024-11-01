public class StateAbierta implements StateCaja {

    @Override
    public void atender(Cliente cliente) {
        System.out.println("Atendiendo a " + cliente.getNombre() + ".");
    }

    @Override
    public void abierta(Caja caja) {
        System.out.println("la caja ya está abierta.");
    }

    @Override
    public void suspendida(Caja caja) {
        caja.setEstado(new StateSuspendida());
        System.out.println("La caja está suspendida.");
    }

    @Override
    public void cerrada(Caja caja) {
        caja.setEstado(new StateCerrada());
        System.out.println("La caja está cerrada.");
    }
}