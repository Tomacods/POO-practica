public abstract class Cuenta {

    protected Integer saldo;
    protected String dueno;
    protected Integer nroCuenta;
    
    public Cuenta(Integer saldo, String dueno, Integer nroCuenta){
        this.saldo = saldo;
        this.dueno = dueno;
        this.nroCuenta = nroCuenta;
    }

    public abstract void pagoDebito(Double precio);

    public abstract void pagoCredito(Double precio, Integer cuotas);

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public Integer getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(Integer nroCuenta) {
        this.nroCuenta = nroCuenta;
    }
}