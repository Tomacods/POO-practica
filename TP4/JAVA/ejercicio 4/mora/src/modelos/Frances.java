public class Frances implements Traduccion {
    @Override
    public String saludar() {
       return "Bonjour";
    }

    @Override
    public String despedirse() {
        return "Au revoir";
    }

    @Override
    public String pedirCafe() {
        return "Puis-je prendre du café ?";
    }

    @Override
    public String cuantoCuesta() {
        return "Combien cela coûte-t-il?";
    }

    @Override
    public String dondeQueda() {
        return "C’est où??";
    }
}
