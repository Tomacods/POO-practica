public class FactoryJuego {

    public static Juego crearJuego(String tipo,Integer id, Double importe, Double adicional){
        if (tipo.equalsIgnoreCase("Fisico")){
            return new JuegoFisico(id, importe, adicional);
        }else if(tipo.equalsIgnoreCase("Digital")){
            return new JuegoDigital(id, importe, adicional);
        } else {
            throw new IllegalArgumentException("Tipo ingresado erroneamente.");
        }
    }
}
