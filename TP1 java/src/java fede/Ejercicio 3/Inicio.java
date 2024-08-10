public class Inicio {
    public static void main(String[] args) throws Exception{
        Serie s1 = new Serie("imagen", "Doom Patrol", "Nuevos episodios los jueves");
        Serie s2 = new Serie("imagen", "Planeta de Recolectores", "Nuevos episodios los jueves");
        Serie s3 = new Serie("imagen", "Ricky and Morty", "Nuevos episodios los lunes");
        Estrenos estrenos = new Estrenos("Nuevos episodios cada semana");
        estrenos.agregarSerie(s1);
        estrenos.agregarSerie(s2);
        estrenos.agregarSerie(s3);
        estrenos.imprimir();
    }
}
