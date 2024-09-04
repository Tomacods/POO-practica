import javax.swing.JOptionPane;
public class Dialog1  {
    public static void main(String[] args)  {
        Object[] options = {"Aceptar","Cancelar"};
        JOptionPane.showOptionDialog(null, "Está seguro que quiere dar de baja al usuario", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
    
}
}
