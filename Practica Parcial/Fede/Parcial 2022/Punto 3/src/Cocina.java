public class Cocina extends Electrodomestico{
    
    private Boolean electrica;

    public Cocina(String modelo, Integer precio, String marca, String color, Boolean electrica){
        super(modelo, precio, marca, color);
        this.electrica = electrica;
    }

    @Override
    public String toString() {
        return super.toString() + "     Electrica? " + electrica;
    }
}
