import java.util.ArrayList;
import java.util.List;

class Serie extends Contenido {
    private List<Capitulo> capitulos;

    public Serie(String nombre, int anioEmision, int calificacion) {
        super(nombre, anioEmision, calificacion);
        this.capitulos = new ArrayList<>();
    }

    public void agregarCapitulo(Capitulo capitulo) {
        capitulos.add(capitulo);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo serie: " + nombre);
        //cambiar el capitulo a visto es decir true
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }
    
}
    
