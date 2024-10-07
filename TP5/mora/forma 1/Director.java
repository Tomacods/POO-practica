public class Director {
   private BuilderTorta builder;

   public void setBuilderTorta(BuilderTorta builder) {
      this.builder = builder;
   }

   public void buildTortaVainilla() {
      builder.tortaVainilla();
   }

   public void buildTortaCoco() {
      builder.tortaCoco();
   }

   public void buildTortaChocolate() {
      builder.tortaChocolate();
   }

}
