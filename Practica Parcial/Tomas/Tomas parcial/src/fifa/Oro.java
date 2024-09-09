public class Oro extends Cartas{

    public Oro(String nombre, String club, String pais, int velocidad, int regate, int tiro, int defensa, int pase, int fisico, int nivelQuimica) {
        super(nombre, club, pais, velocidad, regate, tiro, defensa, pase, fisico);
    }


    @Override
    public int calcularQuimica(String paisfavorito, String equipofavorito){
        if (paisfavorito.equals(this.getPais()) && equipofavorito.equals(this.getClub())) {
            return 100;
        } else if (paisfavorito.equals(this.getPais()) || equipofavorito.equals(this.getClub())) {
            return 80;
        } else {
            return 0;
        }
    }
        
    }

    
