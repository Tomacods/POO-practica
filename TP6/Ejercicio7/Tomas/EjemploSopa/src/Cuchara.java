class Cuchara {
    private final Object lock = new Object();

    public void usar(String nombre) {
        synchronized (lock) {
            System.out.println(nombre + " está usando la cuchara.");
            try {
                Thread.sleep(1000); // Simula el tiempo de comer
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(nombre + " ha terminado de usar la cuchara.");
        }
    }
}