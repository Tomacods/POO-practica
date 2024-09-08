public class Cocina extends Electrodomestico{
    private boolean es_electrica;
    public Cocina (String modelo, int precio, String marca, String color, boolean es_electrica){
        super(modelo, precio, marca, color);
        this.es_electrica= es_electrica;
    }
    public boolean isEs_electrica() {
        return es_electrica;
    }
    public void setEs_electrica(boolean es_electrica) {
        this.es_electrica = es_electrica;
    }
    @Override
    public String toString() {
        return  "Cocina" + "\n" + "Modelo: " + modelo + "\n"+ "Electrica: " + es_electrica + "\n"+"Precio: $" + precio + "\n" +"Marca: " + marca + "\n"+
                "Color:" +  color + "\n";
    }
    

}
