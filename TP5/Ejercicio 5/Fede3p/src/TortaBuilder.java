class TortaBuilder implements Builder{

    private Torta torta;

    public TortaBuilder(){
        this.reset();
    }

    public void reset(){
        this.torta = new Torta();
    }

    public void setGusto(String gusto){
        this.torta.gusto = gusto;
    }

    public void setRelleno(String relleno){
        this.torta.relleno = relleno;
    }
}