import java.util.ArrayList;

public class Usuario {
    private  String nombre;
    private String apellido;
    private String mail;
    private String password;
    private ArrayList<Perfil> perfiles = new ArrayList<>();
    
    public Usuario(String nombre, String apellido, String mail, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.password = password;
    }
    public void agregarperfil(Perfil p){
        perfiles.add(p);
    }
    public void imprimirusuario(){
        System.out.println(this.apellido+","+this.nombre);
        for(Perfil p : perfiles){
            p.imprimirperfil();
        }
    }
}
