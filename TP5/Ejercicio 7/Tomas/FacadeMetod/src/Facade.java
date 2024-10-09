public class Facade {
    private Helper helper;
    private Helper2 helper2;

    public Facade() {
        helper = new Helper();
        helper2 = new Helper2();
    }
    public String traducir(String palabra) {
        return helper.traducir(palabra);
    }
    public String toUpperCase(String palabra) {
        return helper2.convertirMayusculas(palabra);
    }
    public String toLowerCase(String palabra) {
        return helper2.convertirMinusculas(palabra);
    }
}
