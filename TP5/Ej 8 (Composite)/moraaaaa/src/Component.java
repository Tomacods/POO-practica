public abstract class Component {
    protected String nombre;

    public Component(String nombre){
        this.nombre=nombre;
    }
    
    public void mostrar(){
        System.out.println(nombre);
    }
    public boolean es_carpeta() {
        return false;
    }

    public String getNombre(){
        return nombre;
    }




}
