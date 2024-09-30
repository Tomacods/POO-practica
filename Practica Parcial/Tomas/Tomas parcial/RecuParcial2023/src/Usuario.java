import java.util.ArrayList;
import java.util.List;


public class Usuario {
    private String nombre;
    private String apellido;
    private String mail;
    private String password;
    private List<Perfil> perfiles;

    public Usuario(String nombre, String apellido, String mail, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.password = password;
        this.perfiles = new ArrayList<>();
    }

    public void agregarPerfil(Perfil perfil) {
        perfiles.add(perfil);
    }

    public List<Perfil> getPerfiles() {
        return perfiles;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }
}