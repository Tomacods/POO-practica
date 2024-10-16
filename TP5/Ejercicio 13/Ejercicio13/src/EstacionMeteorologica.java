public class EstacionMeteorologica  implements  Observer {
    private float presionAtmosferica;
    private float temperatura;
    private float velocidadViento;

    public EstacionMeteorologica( float presionAtmosferica, float temperatura, float velocidadViento) {
        this.presionAtmosferica = presionAtmosferica;
        this.temperatura = temperatura;
        this.velocidadViento = velocidadViento;
    }
    @Override
    public void update() {
        System.out.println("Presion Atmosferica: " + presionAtmosferica + " Temperatura: " + temperatura + " Velocidad Viento: " + velocidadViento);
    }
}
