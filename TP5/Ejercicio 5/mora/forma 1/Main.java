public class Main {
  public static void main(String[] args) {
    Director director = new Director();
    ConcreteBuilderTorta builder = new ConcreteBuilderTorta();
    director.setBuilderTorta(builder);
    // director.buildTorta();
    director.buildTortaVainilla();

    builder.getTorta().mostrar();

   /*  director.buildTortaCoco();

    builder.getTorta().mostrar();

    director.buildTortaChocolate();

    builder.getTorta().mostrar();
  }*/
  // Torta tortaVainilla = vainillaBuilder.getTorta();
  // vainilla.mostrar();
}
}
