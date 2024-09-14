public class Impuesto {

    private String nombre;
    private Double monto;
    private String periodo;
    private Integer nroComprobante;
    private Boolean estado;

    public Impuesto(String nombre, Double monto, String periodo){
        this.nombre = nombre;
        this.monto = monto;
        this.periodo = periodo;
        this.estado = false;
    }
}