public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private String ocupacion;
    private Puesto puesto;
    
    //constructor
    public Persona(String nombre, int edad, String sexo, String ocupacion, Puesto puesto){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.ocupacion = ocupacion;
        this.puesto=puesto;
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
    public String getOcupacion(){
        return ocupacion;
    }
    public Puesto getPuesto(){
        return puesto;
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
    public void setOcupacion(String ocupacion){
        this.ocupacion = ocupacion;
    }
    public void setPuesto(Puesto puesto){
        this.puesto = puesto;
    }
    
    @Override
        public String toString(){
            return "Nombre: " + nombre + "\n" +"Edad: " + edad +"\n"+ "Sexo: " + sexo + "\n"+"Trabaja: " + ocupacion + 
            "\n" + "Puesto: " + puesto.getNombre();
    }
    
    }
    