public class StateSuspendida implements StateCaja {
    
    @Override
    public void atender(Cliente cliente) {
        if (cliente.getEdad() > 60) {
            System.out.println("Atendiendo a " + cliente.getNombre() + ".");
        } else {
            System.out.println("Por favor espere en la linea.");
        }
    }

    @Override
    public void abierta(Caja caja) {
        caja.setEstado(new StateAbierta());
        System.out.println("La caja está abierta.");
    }

    @Override
    public void suspendida(Caja caja) {
        System.out.println("La caja ya está suspendida.");
    }

    @Override
    public void cerrada(Caja caja) {
        caja.setEstado(new StateCerrada());
        System.out.println("La caja está cerrada.");
    }
}
