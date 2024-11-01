public class Banco {
    
    private Caja caja;

    public Banco(String cajero) {
        this.caja = new Caja(cajero);
    }

    public void atender(Cliente cliente) {
        caja.atender(cliente);
    }

    public void suspenderCaja() {
        caja.suspender();
    }

    public void cerrarCaja() {
        caja.cerrar();
    }

    public void abrirCaja() {
        caja.abierta();
    }
}
