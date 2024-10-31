public class Torta {
    private String masa;
    private String relleno;

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    @Override
    public String toString() {
        return "" + masa +", "+ relleno ;
    }
}