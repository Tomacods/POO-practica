public class Main {
  public static void main(String[] args) {

    BuilderTorta builderVainilla = new BuilderVainilla();
    BuilderTorta builderCoco = new BuilderCoco();
        Director director = new Director(builderVainilla);

    director.buildTorta();

    director.getTorta().mostrar();

    director.setBuilder(builderCoco);
    director.buildTorta();

    director.getTorta().mostrar();


}
}
