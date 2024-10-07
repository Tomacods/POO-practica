public class Torta {
    private String masa;
    private String relleno;
    private String sabor;

    private Torta() {
    }


    public String getMasa() {
        return masa;
    }

    public String getRelleno() {
        return relleno;
    }

    public String getSabor() {
        return sabor;
    }

    @Override
    public String toString() {
        return "Torta [masa=" + masa + ", relleno=" + relleno + ", sabor=" + sabor + "]";
    }
}