class JuegoFactory {
    
    public static Juego creadorJuego(String tipoJuego, String id, Float importe, Float precioAdicional){
        if (tipoJuego == "Digital"){
            return new JuegoDigital(id, importe, precioAdicional);
        } else {
            if (tipoJuego == "Fisico"){
                return new JuegoFisico(id, importe, precioAdicional);
            } else {
                throw new IllegalArgumentException("Tipo de juego no soportado.");
            }
        }
    }
}
