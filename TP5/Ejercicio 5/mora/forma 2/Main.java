public class Main {
  public static void main(String[] args) {
    Director director = new Director();
    ConcreteBuilderTorta builder = new ConcreteBuilderTorta();
    director.setBuilderTorta(builder);
    // director.buildTorta();
    director.buildTortaVainilla();

    builder.getTorta().imprimir();

    director.buildTortaCoco();

    builder.getTorta().imprimir();

    director.buildTortaChocolate();

    builder.getTorta().imprimir();
  }
  // Torta tortaVainilla = vainillaBuilder.getTorta();
  // vainilla.mostrar();
}
