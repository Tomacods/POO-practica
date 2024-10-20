class Persona implements Runnable {
    private final String nombre;
    private final Cuchara cuchara;

    public Persona(String nombre, Cuchara cuchara) {
        this.nombre = nombre;
        this.cuchara = cuchara;
    }

    @Override
    public void run() {
        while (true) {
            cuchara.usar(nombre);
            try {
                Thread.sleep(1000); // Simula el tiempo de espera antes de intentar comer de nuevo
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}