
public class Personal extends TarifaProveedor {

    // public Personal(String nombre_proveedor) {
    // super(nombre_proveedor);
    // }
    public Personal (){
        super("Personal");
    }

    @Override
    public double calcular(double total_sms, double total_minutos, double total_gigas) {
        return super.calcular(total_sms, (total_minutos * 1.2), (total_gigas * 1.5));
    }

    @Override
    public String getNombre() {
        return "Personal";
    }

}
