public class StateCerrada implements StateCaja {
    
    @Override
    public void atender(Cliente cliente) {
        System.out.println("La caja está cerrada, no se atienden personas.");
    }

    @Override
    public void abierta(Caja caja) {
        caja.setEstado(new StateAbierta());
        System.out.println("La caja está abierta.");
    }

    @Override
    public void suspendida(Caja caja) {
        caja.setEstado(new StateSuspendida());
        System.out.println("La caja está suspendida.");
    }

    @Override
    public void cerrada(Caja caja) {
        System.out.println("La caja ya está cerrada.");
    }
}
