public class Ingles implements Traduccion{

    @Override
    public String saludar() {
       return "Hello";
    }

    @Override
    public String despedirse() {
        return "Goodbye";
    }

    @Override
    public String pedirCafe() {
        return "Can i have some coffe?";
    }

    @Override
    public String cuantoCuesta() {
        return "How much is it?";
    }

    @Override
    public String dondeQueda() {
        return "Where is it?";
    }
    
}
