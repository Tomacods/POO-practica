public class Director {
   private BuilderTorta builder;

   public  Director(BuilderTorta builder) {
      this.builder = builder;
   }

   public void setBuilder(BuilderTorta builder) {
      this.builder = builder;
  }

   public void buildTorta() {
      builder.crearTorta();
      builder.setMasa();
      builder.setRelleno();
   }

   public Torta getTorta() {
      return builder.getTorta();
   }

}
