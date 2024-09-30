import java.util.ArrayList;
import java.util.List;
import java.util.Random;

interface Pagar {
    void pagarConDebito(Impuesto impuesto);
    void pagarConCredito(Impuesto impuesto, int cuotas);
}

public abstract class Cuenta implements Pagar {
    protected double saldo;
    protected String dueño;
    protected String nroCuenta;

    public Cuenta(double saldo, String dueño, String nroCuenta) {
        this.saldo = saldo;
        this.dueño = dueño;
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDueño() {
        return dueño;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }
    public abstract void pagarConDebito(Impuesto impuesto);
    public abstract void pagarConCredito(Impuesto impuesto, int cuotas);
}

class CuentaBanco extends Cuenta {
    private String cbu;

    public CuentaBanco(double saldo, String dueño, String nroCuenta, String cbu) {
        super(saldo, dueño, nroCuenta);
        this.cbu = cbu;
    }

    @Override
    public void pagarConDebito(Impuesto impuesto) {
        if (saldo >= impuesto.getMonto()) {
            saldo -= impuesto.getMonto();
            saldo += impuesto.getMonto() * 0.10; // Reintegro del 10%
            impuesto.setEstadoCobrado(true);
            System.out.println("Pago con débito realizado desde cuenta bancaria. Saldo actual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para pagar con débito desde cuenta bancaria.");
        }
    }

    @Override
    public void pagarConCredito(Impuesto impuesto, int cuotas) {
        double montoConInteres = impuesto.getMonto();
        if (cuotas > 3) {
            montoConInteres += impuesto.getMonto() * 0.02 * cuotas;
        }
        if (saldo >= montoConInteres / cuotas) {
            saldo -= montoConInteres / cuotas;
            impuesto.setEstadoCobrado(true);
            System.out.println("Pago con crédito realizado desde cuenta bancaria en " + cuotas + " cuotas. Saldo actual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para pagar con crédito desde cuenta bancaria.");
        }
    }
}

class CuentaBilleteraVirtual extends Cuenta {
    private String cvu;

    public CuentaBilleteraVirtual(double saldo, String dueño, String nroCuenta, String cvu) {
        super(saldo, dueño, nroCuenta);
        this.cvu = cvu;
    }

    @Override
    public void pagarConDebito(Impuesto impuesto) {
        if (saldo >= impuesto.getMonto()) {
            saldo -= impuesto.getMonto();
            impuesto.setEstadoCobrado(true);
            System.out.println("Pago con débito realizado desde billetera virtual. Saldo actual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para pagar con débito desde billetera virtual.");
        }
    }

    @Override
    public void pagarConCredito(Impuesto impuesto, int cuotas) {
        double montoConInteres = impuesto.getMonto() + impuesto.getMonto() * 0.08 * cuotas;
        if (saldo >= montoConInteres / cuotas) {
            saldo -= montoConInteres / cuotas;
            impuesto.setEstadoCobrado(true);
            System.out.println("Pago con crédito realizado desde billetera virtual en " + cuotas + " cuotas. Saldo actual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para pagar con crédito desde billetera virtual.");
        }
    }
}

class Impuesto {
    private String nombre;
    private double monto;
    private String periodo;
    private boolean estadoCobrado;
    private String nroComprobante;

    public Impuesto(String nombre, double monto, String periodo) {
        this.nombre = nombre;
        this.monto = monto;
        this.periodo = periodo;
        this.estadoCobrado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMonto() {
        return monto;
    }

    public String getPeriodo() {
        return periodo;
    }

    public boolean isEstadoCobrado() {
        return estadoCobrado;
    }

    public void setEstadoCobrado(boolean estadoCobrado) {
        this.estadoCobrado = estadoCobrado;
    }

    public void almacenarComprobante(String nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    public boolean validarPago(double monto, String periodo) {
        return this.monto == monto && this.periodo.equals(periodo);
    }
}

public class Main {
    public static void main(String[] args) {
        CuentaBanco cuentaBanco = new CuentaBanco(10000, "Juan Perez", "123456", "000123456789");
        CuentaBilleteraVirtual cuentaBilletera = new CuentaBilleteraVirtual(5000, "Maria Lopez", "654321", "000987654321");

        List<Impuesto> impuestos = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            double monto = 100 + random.nextDouble() * 900; // Monto entre 100 y 1000
            String periodo = "2023-" + (random.nextInt(12) + 1); // Periodo entre 2023-1 y 2023-12
            impuestos.add(new Impuesto("Impuesto" + (i + 1), monto, periodo));
        }

        while (cuentaBanco.getSaldo() > 0 || cuentaBilletera.getSaldo() > 0) {
            Impuesto impuesto = impuestos.get(random.nextInt(impuestos.size()));
            boolean pagarConDebito = random.nextBoolean();
            int cuotas = random.nextInt(12) + 1;

            if (pagarConDebito) {
                if (cuentaBanco.getSaldo() > 0) {
                    cuentaBanco.pagarConDebito(impuesto);
                } else if (cuentaBilletera.getSaldo() > 0) {
                    cuentaBilletera.pagarConDebito(impuesto);
                }
            } else {
                if (cuentaBanco.getSaldo() > 0) {
                    cuentaBanco.pagarConCredito(impuesto, cuotas);
                } else if (cuentaBilletera.getSaldo() > 0) {
                    cuentaBilletera.pagarConCredito(impuesto, cuotas);
                }
            }

            if (cuentaBanco.getSaldo() <= 0 && cuentaBilletera.getSaldo() <= 0) {
                break;
            }
        }
    }
}
