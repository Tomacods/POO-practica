public class NoDocente extends Personal {

    private String jornada;
    // private int horas_semanales;

    public NoDocente(String nombre_completo, int antiguedad, String sector, String jornada) {
        super(nombre_completo, antiguedad, sector);
        this.jornada=jornada;
    }

    public String getJornada() {
        return jornada;
    }


    public void setJornada(String jornada) {
        this.jornada = jornada;
    }  

    @Override
    public int horas_semanales() {
        switch (jornada) {
            case "Completa":
                return 30;

            case "Reducida":
                return 20;

            default:
                return 0;

        }

    }



}
