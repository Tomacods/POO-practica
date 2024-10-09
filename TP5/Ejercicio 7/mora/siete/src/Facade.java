public class Facade {

    public void mostrar(String palabra){
        HelperTraducir traduccion = new HelperTraducir();
        HelperConvertir convertir = new HelperConvertir();
        System.out.println(traduccion.traducir(palabra) +"\n" +convertir.mayusculas(palabra) +"\n"+convertir.minusculas(palabra) ); 
        
        
        
    }

}
