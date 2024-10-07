import java.util.ArrayList;
public class Serie extends Contenido {
    private ArrayList<Capitulo> capitulos = new ArrayList<>();

    public Serie(String nombre, Integer anio, Integer calificacion) {
        super(nombre, anio, calificacion);
    }
    @Override
    public void reproducir(){
        System.out.println("Se esta reproduciendo "+this.nombre);
        this.capitulos.get(ultimocap()).setVisto(true);
    }
    @Override
    public void imprimircontenido(){
        System.out.println("Usted se quedo en "+this.nombre+ " capitulo " + ultimocap());
    }
    public Integer ultimocap (){
        Integer i=0;
        Boolean ultimo = true;
        while(i <= this.capitulos.size() && ultimo){
            if (this.capitulos.get(i).getVisto()== false){
                ultimo = false;
            }else {
                i= i+1;
            }
            
        }
        return this.capitulos.get(i).getOrden();
    }
}
