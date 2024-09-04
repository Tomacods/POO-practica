
public class Movistar extends TarifaProveedor {

  //  public Movistar(String nombre_proveedor) {
    //    super(nombre_proveedor);
  //  }

  public Movistar() {
    super("Movistar");
}

    @Override
    public double calcular(double total_sms, double total_minutos, double total_gigas) {
        
        return super.calcular(total_sms * 1.1, total_minutos * 1.2, total_gigas * 1.3);
    }

    @Override
    public String getNombre() {
        return "Movistar";
    }

}
