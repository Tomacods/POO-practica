public class Director {
   private BuilderTorta builder;

   public void setBuilderTorta(BuilderTorta builder) {
      this.builder = builder;
   }

   public void buildTortaVainilla() {
      builder.vainilla();
   }

   public void buildTortaCoco() {
      builder.coco();
   }

   public void buildTortaChocolate() {
      builder.chocolate();
   }

}
