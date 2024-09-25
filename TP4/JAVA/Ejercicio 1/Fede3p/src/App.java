import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        Integer dialog = JOptionPane.showConfirmDialog(null, "Desea dar de baja al usuario?", "Confirmación", JOptionPane.YES_NO_OPTION); //Crea el cuadro con el mensaje deseado y botones de confirmación o rechazo.
        if (dialog == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "El usuario ha sido dado de baja con éxito!"); //Impresión de confirmación
        } else {
            JOptionPane.showMessageDialog(null, "La operación ha sido cancelada."); //Impresión de rechazo
        }
        String text = JOptionPane.showInputDialog("Ingrese un texto: "); //Crea el recuadro con un mensaje y casilla de ingreso de información.
        JOptionPane.showMessageDialog(null, "El texto ingresado es: " + text); //Imprime información ingresada.
    }
}
