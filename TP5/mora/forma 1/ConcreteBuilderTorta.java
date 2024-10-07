public class ConcreteBuilderTorta extends BuilderTorta {
    public ConcreteBuilderTorta() {
        this.crearTorta();
    }

    @Override
    public void tortaVainilla() {

        this.torta.setMasa("vainilla");
        this.torta.setRelleno("Mantequilla");

    }

    @Override
    public void tortaCoco() {

        this.torta.setMasa("coco");
        this.torta.setRelleno("dulce de leche");

    }

    @Override
    public void tortaChocolate() {

        this.torta.setMasa("Chocolate");
        this.torta.setRelleno("mani");

    }

    /*
     * @Override
     * public void setMasa(){
     * this.torta.setMasa("Coco");
     * }
     * 
     * public void setRelleno(){
     * this.torta.setMasa("Dulce de leche");
     * }
     */

}
