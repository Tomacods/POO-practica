package mora;

public class Personal extends TarifaProveedor{



    public Personal (String nombre_proveedor){
        super(nombre_proveedor);
    }
    

    @Override
    public double calcular(double total_sms, double total_minutos, double total_gigas) {
        // TODO Auto-generated method stub
        return  super.calcular (total_sms, (total_minutos * 1.2), (total_gigas * 1.5));
    }

    @Override
    public String getNombre(String nombre_proveedor) {
        // TODO Auto-generated method stub
        return "Personal";
    }

    

    
}
