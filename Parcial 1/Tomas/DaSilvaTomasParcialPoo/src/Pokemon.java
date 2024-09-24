public abstract class Pokemon {
    protected String nombre;
    protected int vida;
    protected String tipo;
    protected String debilidad;
    protected int ataque, defensa,velocidad, salvajismo;
    

    public Pokemon(String nombre,String tipo, int vida, String debilidad) {
        this.nombre = nombre;
        this.vida = 100;
        this.debilidad = debilidad;
        this.tipo = tipo;
        this.generarEstadisticas();
    }
    public int getVida(){
        return this.vida;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getSalvajismo(){
        return this.salvajismo;
    }
    
    public void SetSalvajismo(int valor){
        this.salvajismo = valor;
    }   

    private void generarEstadisticas(){
        this.ataque = (int) (Math.random() * 100);
        this.defensa = (int) (Math.random() * 100);
        this.velocidad = (int) (Math.random() * 100);
        this.salvajismo = (int) (Math.random() * 100);
    }
    public void impirmir(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Ataque: " + this.ataque);
        System.out.println("Defensa: " + this.defensa);
        System.out.println("Velocidad: " + this.velocidad);
        System.out.println("Salvajismo: " + this.salvajismo);
    }
    /*Ataque: Si el oponente tiene debilidad a este tipo (por ejemplo, un Pokémon de tipo Agua), hay
un 70% de probabilidad de realizar un ataque crítico, lo que aumentará el ataque normal en un
50%. Para realizar este ataque se deberá recibir el pokémon al cual se atacará.  */

    public void atacar (Pokemon pokemon){
        if(pokemon.tipo.equals(this.debilidad)){
            if(Math.random() < 0.7){
                pokemon.defensa(this.ataque * 1.5);
            } else {
                pokemon.defensa(this.ataque);
            }
        } else {
            pokemon.defensa(this.ataque);
        }
    }

    protected abstract void defensa(double danio);

}
