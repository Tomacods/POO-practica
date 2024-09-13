package banco;

public class Impuesto {
    private String nombre;
    private double monto;
    private String periodo;
    private boolean estado;
    private String nroComprobante;

    public Impuesto(String nombre, double monto, String periodo) {
        this.nombre = nombre;
        this.monto = monto;
        this.periodo = periodo;
        this.estado = false;
    }
    public void validarPago(double monto, String periodo, String nroComprobante) {
        if (this.monto == monto && this.periodo.equals(periodo)) {
            this.estado = true;
            this.nroComprobante = nroComprobante;
        } else {
            System.out.println("Pago inválido.");
        }
    }
}
