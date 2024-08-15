import java.util.ArrayList;

public class Comuna {
    private String numeroComuna;
    private ArrayList<Familia> familias = new ArrayList();

    public Comuna(String numeroComuna){
        this.numeroComuna = numeroComuna;
    }

    public String getComuna(){
        return numeroComuna;
    }
    public void setComuna(String numeroComuna){
        this.numeroComuna = numeroComuna; 
    }
    public void setFamilia (ArrayList<Familia> familias){
        this.familias = familias;

    }
    public ArrayList<Familia> getFamilias(){
        return familias;
    }

    public void addFamilia (Familia familia){
        this.familias.add(familia);
    }

    @Override
    public String toString(){
        return "//Numero de la comuna: " + numeroComuna;
}
}
