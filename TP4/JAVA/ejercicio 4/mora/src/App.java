public class App {
    public static void main(String[] args) throws Exception {
        Vista vista = new Vista();
        Ingles ing = new Ingles();
        Portugues por = new Portugues();
        Frances fran= new Frances();
        Controlador con = new Controlador(vista, ing, por, fran);
     //   con.mostrar();

      //  vista.ventanaPrincipal();
       // vista.label("HOLAAAAAAAAAAAAA");
    }
}
