public class Frances implements Idioma {
    @Override
    public String saludar() {
        return "Bonjour";
    }

    @Override
    public String despedirse() {
        return "Au revoir";
    }

    @Override
    public String perdon() {
        return "Pardon";
    }

    @Override
    public String pedirCafe() {
        return "Café, s'il vous plaît";
    }

    @Override
    public String cuantoCuesta() {
        return "Combien ça coûte?";
    }

    @Override
    public String dondeQueda() {
        return "Où est-ce?";
    }
    
}
