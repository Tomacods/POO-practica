public class Caja {
    
    private String cajero;
    private StateCaja estadoCaja;

    public Caja(String cajero) {
        this.cajero = cajero;
        this.estadoCaja = new StateCerrada();
    }

    public void setEstado(StateCaja estadoCaja) {
        this.estadoCaja = estadoCaja;
    }

    public void atender(Cliente cliente) {
        System.out.println("Caja a cargo de " + cajero);
        estadoCaja.atender(cliente);
    }

    public void suspender() {
        estadoCaja.suspendida(this);
    }

    public void cerrar() {
        estadoCaja.cerrada(this);
    }

    public void abierta() {
        estadoCaja.abierta(this);
    }
}
