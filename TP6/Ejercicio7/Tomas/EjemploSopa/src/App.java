public class App {
    public static void main(String[] args) {
        Cuchara cuchara = new Cuchara();
        Persona persona1 = new Persona("Persona 1", cuchara);
        Persona persona2 = new Persona("Persona 2", cuchara);

        Thread thread1 = new Thread(persona1);
        Thread thread2 = new Thread(persona2);

        thread1.start();
        thread2.start();
    }
}

//tenemos un numero limitado de elementos que se pueden usar a la vez como es el caso de la cuchara
//en este caso se usa un lock para que solo una persona pueda usar la cuchara a la vez
//el problema que se produce  es el de deadlock, ya que si una persona esta usando la cuchara y la otra persona intenta usarla
//se quedara esperando a que la cuchara este libre, pero la cuchara no se liberara hasta que la persona que la esta usando termine