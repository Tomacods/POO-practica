public abstract class TarifaProveedor {
    // atributos
    protected String nombre_proveedor;
    protected double total_sms;
    protected double total_minutos;
    protected double total_gigas;

    // constructor
    public TarifaProveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public double calcular_sms(double total_sms) {
        return total_sms * 1;
    }

    public double calcular_minutos(double total_minutos) {
        return total_minutos * 15;
    }

    public double calcular_gigas(double total_gigas) {
        return total_gigas* 25;
    }

    public double calcular(double total_sms, double total_minutos, double total_gigas) {
        return calcular_sms(total_sms) + calcular_minutos(total_minutos) + calcular_gigas(total_gigas);
    }

    public abstract String getNombre();

}
