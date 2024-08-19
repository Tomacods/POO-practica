public class PersonaCenso {

    private String nombre;
    private int edad;
    private String sexo;
    private int ocupacion;
    private boolean trabajo;
    private boolean manejar;
    
    //constructor
    public PersonaCenso(String nombre, int edad, String sexo, int ocupacion, boolean manejar, boolean trabajo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.ocupacion = ocupacion;
        this.manejar = manejar;
        this.trabajo = trabajo;
    }
    
    //getters
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getSexo(){
        return sexo;
    
    }
    public int getOcupacion(){
        return ocupacion;
    }

    
    
    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setOcupacion(int ocupacion){
        this.ocupacion = ocupacion;
    }

    public void setTrabajo (boolean trabajo){
        this.trabajo = trabajo;
    }

    public void setManejar (boolean manejar){
        this.manejar = manejar;
    }

    @Override
    public String toString() {
        return "\n"+ "Nombre: " + nombre + "\n"+ "Edad=" + edad +"\n" +"Sexo=" + sexo +"\n" +"Ocupacion: " + (ocupacion == 1 ? "TRABAJA" : "NO TRABAJA") + "\n" +
        "Puede manejar: " + (manejar ? "Si" : "No") + "\n"+
        "Puede trabajar: " + (trabajo ? "Si" : "No") + "\n";
    }
    
    

    }