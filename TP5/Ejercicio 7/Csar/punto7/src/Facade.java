public class Facade {
private Helper helper;
private Helperdos helper2;

public Facade(){
    helper = new Helper();
    helper2 = new Helperdos();
}
public String traducir (String palabra){
    return  helper.traducir(palabra);
}
public String toUpperCase(String palabra){
    return helper2.convertirMayus(palabra);
}
public String toLowerCase(String palabra){
    return helper2.convertirMinus(palabra);
}
}
