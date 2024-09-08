public class Resta extends Operacion {

    double resta;


    public Resta(double n1, double n2) {
        super(n1, n2, '-');
        this.resta = n1 - n2;
        this.resultado = n1 - n2;
    }
    
}
