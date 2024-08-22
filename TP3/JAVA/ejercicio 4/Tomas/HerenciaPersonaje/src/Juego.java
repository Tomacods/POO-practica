public class Juego {
    public static void main(String[] args) throws Exception {
        
        Personaje cesar = new PjCesar("Cesar");
        Personaje mora = new PjMora("Mora");

    for (int i = 0; i < 9; i++) {
            cesar.recibirDano(mora.atacar());
            mora.recibirDano(cesar.atacar());
        } 
        System.out.println("Vida de Cesar: " + cesar.getVida());
        System.out.println("Vida de Mora: " + mora.getVida());
        
        
        
    }

}
