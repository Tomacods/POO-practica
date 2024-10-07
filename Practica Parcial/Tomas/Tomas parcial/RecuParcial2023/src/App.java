public class App {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan", "Perez", "juan.perez@mail.com", "password123");
        Perfil perfil1 = new Perfil("Juanito", true);
        Perfil perfil2 = new Perfil("Juan Senior", false);

        Serie serie = new Serie("Serie Ejemplo", 2021, 4);
        serie.agregarCapitulo(new Capitulo("Capitulo 1", 1));
        serie.agregarCapitulo(new Capitulo("Capitulo 2", 2));

        Pelicula pelicula = new Pelicula("Pelicula Ejemplo", 2020, 5);

        perfil1.agregarFavorito(serie);
        perfil1.agregarFavorito(pelicula);

        usuario.agregarPerfil(perfil1);
        usuario.agregarPerfil(perfil2);

        // Reproduciendo contenido
        serie.reproducir();
        pelicula.reproducir();

        perfil1.mostrarInformacion();
    }
}