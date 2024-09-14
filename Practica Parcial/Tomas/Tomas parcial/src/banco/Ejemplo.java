package banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejemplo {
    public static void main(String [] args) {

        //crear cuentas banco

        CuentaBanco cuenta1 = new CuentaBanco(10000, "Juan Perez", "123456789", "CBU123456");
        // creo una cuenta VilleteraVirual
        CuentaBilleteraVirtual cuenta2 = new CuentaBilleteraVirtual(5000, "Maria Lopez", "987654321", "CVU987654");

        //creo una lista de 20 impuestos con atributos y periodo de forma random
        List<Impuesto> impuestos = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            double monto = 100 + (500 - 100) * random.nextDouble(); // Monto entre 100 y 500
            String periodo = "2023-" + (random.nextInt(12) + 1); // Periodo entre 2023-1 y 2023-12
            impuestos.add(new Impuesto("Impuesto" + (i + 1), monto, periodo));
        }
        //realizael pago
        for (Impuesto impuesto : impuestos) {
            if (cuenta1.getSaldo() <= 0 && cuenta2.getSaldo() <= 0) {
                break;
            }
            boolean usarBanco = random.nextBoolean(); 
            boolean usarDebito = random.nextBoolean();

            if (usarBanco) {
                if (usarDebito) {
                    System.out.println("Pagando con débito desde cuenta bancaria: " + impuesto.getNombre());
                    cuenta1.pagarConDebito(impuesto.getMonto());
                } else {
                    int cuotas = random.nextInt(12) + 1; // Cuotas entre 1 y 12
                    System.out.println("Pagando con crédito desde cuenta bancaria: " + impuesto.getNombre() + " en " + cuotas + " cuotas");
                    cuenta1.pagarConCredito(impuesto.getMonto(), cuotas);
                }
                System.out.println("Saldo cuenta bancaria: " + cuenta1.getSaldo());
            } else {
                if (usarDebito) {
                    System.out.println("Pagando con débito desde billetera virtual: " + impuesto.getNombre());
                    cuenta2.pagarConDebito(impuesto.getMonto());
                } else {
                    int cuotas = random.nextInt(12) + 1; // Cuotas entre 1 y 12
                    System.out.println("Pagando con crédito desde billetera virtual: " + impuesto.getNombre() + " en " + cuotas + " cuotas");
                    cuenta2.pagarConCredito(impuesto.getMonto(), cuotas);
                }
                System.out.println("Saldo billetera virtual: " + cuenta2.getSaldo());
            }
        }

}
}
