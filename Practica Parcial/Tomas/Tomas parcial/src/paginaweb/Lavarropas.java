package paginaweb;

public class Lavarropas extends Electrodomesctico{
    private Integer carga;
    private String tipoDeCarga;

    public Lavarropas(String marca, Integer precio, String modelo, String color, Integer carga, String tipoDeCarga) {
        super(marca, precio, modelo, color);
        this.carga = carga;
        this.tipoDeCarga = tipoDeCarga;
    }
    public Integer getCarga() {
        return carga;
    }
    public String getTipoDeCarga() {
        return tipoDeCarga;
    }
    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    public void setTipoDeCarga(String tipoDeCarga) {
        this.tipoDeCarga = tipoDeCarga;
    }



    @Override
    public String toString() {
        return super.toString() + ", Capacidad: " + carga + " kg";
    }
    
}
