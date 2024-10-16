public class DirectorTorta {
    private  ConstructorTorta constructorTorta;
    
    public void setConstructorTorta(ConstructorTorta constructorTorta) {
        this.constructorTorta = constructorTorta;
    }
    public void armarTortaSimple(){
        this.armarTortaBasica("Simple");
    }
    public void armarTortaDecorada(){
        this.armarTortaBasica("Decorada");
        constructorTorta.decoracion();
    }
    private void armarTortaBasica(String nombre) {
        constructorTorta.crearNuevaTorta(nombre);
        constructorTorta.relleno();
        constructorTorta.masa();
    }
    public Torta getTorta(){
        return constructorTorta.getTorta();
    }
}
