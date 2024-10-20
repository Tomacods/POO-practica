public class Main {
    public static final Object Lock1 = new Object(); // Changed 'object' to 'Object' and made it final
    public static final Object Lock2 = new Object(); // Changed 'object' to 'Object' and made it final

    public static void main(String[] args) {
        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();
        hilo1.start();
        hilo2.start();
    }
}
