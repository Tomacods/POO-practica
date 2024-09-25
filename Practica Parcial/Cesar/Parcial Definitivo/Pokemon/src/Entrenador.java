import java.util.ArrayList;
public class Entrenador {
    private String nombre;
    private Integer nivel;
    private Pokemon principal;
    private ArrayList<Pokemon> pokedex = new ArrayList<>();

    public Pokemon getPrincipal() {
        return principal;
    }
    public void setPrincipal(Pokemon principal) {
        this.principal = principal;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getNivel() {
        return nivel;
    }
    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
    public Entrenador(String nombre, Integer nivel, Pokemon principal) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.principal = principal;
    }
    public void atraparpokemon(Pokemon atrapado){
        System.out.println( this.nombre+" Es hora de atrapar Pokemons!!");
        System.out.println("-------------------");
        Integer i = 1;
        Boolean noatrapado = true;
        Boolean convida = true;
        while (i<=3 && noatrapado && convida ){
            atrapado.salvajismo = atrapado.salvajismo - (int)(atrapado.salvajismo*0.1);
            atrapado.Defensa(this.principal.Ataque(atrapado));
            if(atrapado.getVida() == 0){
                convida = false;
            }
            if (atrapado.salvajismo < this.nivel && convida){
                noatrapado = false;
                System.out.println("Pokemon atrapado en el intento "+ i +" !");
                System.out.println("-------------------");
                pokedex.add(atrapado);
            }else{
                System.out.println("Fallo el intento "+i+" para atraparlo..");
            }
            
            i = i+1;
        }
        if  (atrapado.getVida() == 0){
            System.out.println("El pokemon se debilitó!");
            System.out.println("-------------------");
        }
        if (noatrapado){
            System.out.println("El pokemon escapó!");
            System.out.println("-------------------");
        }
    }
    /*
    public void pokeprincipal(){
        this.principal = pokedex.get(1);
    }*/

    public void Imprimir(){
        System.out.println("-------------------");
        System.out.println(this);
        System.out.println("-------------------");
        System.out.println("En su Pokedex hay "+pokedex.size()+ " Pokemons");
        for (Pokemon p : pokedex){
            System.out.println("-------------------");
            p.Imprimirpokemon();
            System.out.println("-------------------");
        }
    }
    public String toString() {
        return "Entrenador"+"\n"+"Nombre: " + nombre +"              "+ "Nivel =" + nivel;
    }
}
