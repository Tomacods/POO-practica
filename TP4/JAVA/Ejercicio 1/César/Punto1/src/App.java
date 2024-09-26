import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int boton = JOptionPane.showConfirmDialog(null, "¿Está seguro que quiere dar de  baja al usuario?","Confirmación", JOptionPane.YES_NO_OPTION);
        if (boton == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"El usuario ha sido dado de baja con exito.");
        }else {
            JOptionPane.showMessageDialog(null,"Se cancelo la acción.");
        }
        String text = JOptionPane.showInputDialog("Ingresa algo kpo");
        JOptionPane.showMessageDialog(null, "Ingresaste eto kpo : "+text);
    }
}
