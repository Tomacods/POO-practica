package mora;

public class Movistar extends TarifaProveedor {

    public Movistar (String nombre_proveedor){
        super(nombre_proveedor);
    }

    @Override
    public double calcular(double total_sms, double total_minutos, double total_gigas) {
        // TODO Auto-generated method stub
        return super.calcular(total_sms * 1.1, total_minutos * 1.2, total_gigas *1.3);
    }

    @Override
    public String getNombre(String nombre_proveedor) {
        // TODO Auto-generated method stub
        return null;
    }

    
    
}
