public class Claro extends TarifaProveedor{

    //public Claro (String nombre_proveedor, double total_sms, double total_minutos, double total_gigas){
      //  super(nombre_proveedor);
    //}
    public Claro() {
        super("Claro");
    }

    @Override
    public String getNombre(){
        return "Claro";
    }

    public double calcular(double total_sms, double total_minutos, double total_gigas){
        return super.calcular(total_sms, total_minutos, total_gigas) * 1.2;
    }
}
