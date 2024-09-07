public class Ingles implements Idioma {
    @Override
    public String saludar() {
        return "Hello";
    }

    @Override
    public String despedirse() {
        return "Goodbye";
    }

    @Override
    public String perdon() {
        return "Sorry";
    }

    @Override
    public String pedirCafe() {
        return "Coffee, please";
    }

    @Override
    public String cuantoCuesta() {
        return "How much does it cost?";
    }

    @Override
    public String dondeQueda() {
        return "Where is it?";
    }
    
}
