public class PersonaCenso {

    private String nombre;
    private int edad;
    private String sexo;
    private int ocupacion;
    
    //constructor
    public PersonaCenso(String nombre, int edad, String sexo, int ocupacion){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.ocupacion = ocupacion;
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

    @Override
    public String toString() {
        return nombre + "\n"+ "Edad=" + edad +"\n" +"Sexo=" + sexo +"\n" +"Ocupacion=" + ocupacion + "\n";
    }
    
    public int cont_personas (){
        return familia.size();
    }

    }