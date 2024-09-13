public class Impuesto {
    private Double monto;
    private String nombre;
    private Integer periodo;
    private Boolean estadocobrado;

    public Impuesto(Double monto, String nombre, Integer periodo, Boolean estadocobrado) {
        this.monto = monto;
        this.nombre = nombre;
        this.periodo = periodo;
        this.estadocobrado = estadocobrado;
    }

    public Double getMonto() {
        return monto;
    }
    public void setMonto(Double monto) {
        this.monto = monto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getPeriodo() {
        return periodo;
    }
    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }
    public Boolean getEstadocobrado() {
        return estadocobrado;
    }
    public void setEstadocobrado(Boolean estadocobrado) {
        this.estadocobrado = estadocobrado;
    }
    
    public void comprobacion (Integer comprobante, Double montobanco, Integer mesbanco){
        Boolean estado;
        if(getMonto().equals(montobanco) && getPeriodo().equals(mesbanco)) {
            estado = true;
        }else {
            estado= false;
        }
        setEstadocobrado(estado);
    }
}
