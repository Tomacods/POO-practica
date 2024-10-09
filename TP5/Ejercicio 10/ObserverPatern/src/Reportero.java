class Reportero implements Observer {
    private String nombre;

    public Reportero(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String estadoClima) {
        System.out.println(nombre + " reporta: El clima ha cambiado a " + estadoClima);
    }
}