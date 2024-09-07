public class   Operacion {

    double n1;
    double n2;
    double resultado;
    char operador;

    public Operacion(double n1, double n2, char operador) {
        this.n1 = n1;
        this.n2 = n2;
        this.operador = operador;
    }

    public void mostrarResultado() {
        System.out.println(this.resultado);
}
}
