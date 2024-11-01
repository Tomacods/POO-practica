class JuegoFactory {
    public static Juego crearJuego(String tipo, String id, float importe, float precioAdicional) {
        if (tipo.equalsIgnoreCase("fisico")) {
            return new JuegoFisico(id, importe, precioAdicional);
        } else if (tipo.equalsIgnoreCase("digital")) {
            return new JuegoDigital(id, importe, precioAdicional);
        } else {
            throw new IllegalArgumentException("Tipo de juego no soportado");
        }
    }
}