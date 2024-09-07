public class Portugues implements Idioma {
    @Override
    public String saludar() {
        return "Olá";
    }

    @Override
    public String despedirse() {
        return "Adeus";
    }

    @Override
    public String perdon() {
        return "Desculpe";
    }

    @Override
    public String pedirCafe() {
        return "Café, por favor";
    }

    @Override
    public String cuantoCuesta() {
        return "Quanto custa?";
    }

    @Override
    public String dondeQueda() {
        return "Onde fica?";
    }
    
}
