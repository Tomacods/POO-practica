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
    public String getNombre() {
        return nombre;
    }
    public double getMonto() {
        return monto;
    }
    public String getPeriodo() {
        return periodo;
    }
    public boolean getEstado() {
        return estado;
    }
    public String getNroComprobante() {
        return nroComprobante;
    }
    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public void setNroComprobante(String nroComprobante) {
        this.nroComprobante = nroComprobante;
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
