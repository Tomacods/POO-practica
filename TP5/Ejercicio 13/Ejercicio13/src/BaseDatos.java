public class BaseDatos {
    private static BaseDatos instance;

    private BaseDatos() {
    }

    public static synchronized BaseDatos getInstance() {
        if (instance == null) {
            instance = new BaseDatos();
        }
        return instance;
    }

    public void guardarDatos(String datos) {
        System.out.println("Datos guardados: " + datos);
    }

    public String recuperarDatos(String consulta) {
        System.out.println("Consulta realizada: " + consulta);
        return "Datos recuperados para: " + consulta;
    }
}
