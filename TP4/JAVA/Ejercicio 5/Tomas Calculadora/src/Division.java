public class Division extends Operacion {
    
        double division;
    
        public Division(double n1, double n2)  throws ExepcionDividirPorCero {
            super(n1, n2, '/');
            try {
                if (n2 == 0) {
                    throw new ExepcionDividirPorCero("No se puede dividir por cero");
                }
            } catch (ExepcionDividirPorCero e) {
                System.out.println(e.getMessage());
            }
            this.division = n1 / n2;
            this.resultado = n1 / n2;
        }
    
}
