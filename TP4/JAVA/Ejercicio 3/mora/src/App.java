public class App {
   public static void main(String[] args) {
      Vista vista = new Vista();
      EstadosUnidos eeuu = new EstadosUnidos();
      Argentina arg = new Argentina();
      Controlador c = new Controlador(vista, eeuu, arg);
      c.iniciarVista();
   }
}