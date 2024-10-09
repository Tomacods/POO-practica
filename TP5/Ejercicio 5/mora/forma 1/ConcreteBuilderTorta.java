public class ConcreteBuilderTorta extends BuilderTorta {

    public ConcreteBuilderTorta() {
        this.crearTorta();
    }
    @Override
    public void setRelleno(String relleno) {
        this.torta.setRelleno(relleno);
    }

    @Override
    public void setMasa(String masa) {
        this.torta.setMasa(masa);
    }


}
