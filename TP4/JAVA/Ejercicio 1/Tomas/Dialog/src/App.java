/*1. Desarrolle dos ejemplos del uso de un dialog:
a. Un cuadro de diálogo que indique el siguiente mensaje “Está seguro que quiere
dar de baja al usuario”, con los botones de aceptar y cancelar.
b. Un cuadro de diálogo que sea capaz de obtener un texto ingresado por el
usuario y que luego lo muestre en otro cuadro de diálogo.
    */

import javax.swing.JOptionPane; //Importamos la clase JOptionPane que hace posible la creación de cuadros de diálogo

public class App{
    public static void main(String[] args)
    {
        //a
        int Boton_dialogo = JOptionPane.showConfirmDialog(null, "Está seguro que quiere dar de baja al usuario?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if(Boton_dialogo == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null, "Usuario dado de baja");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Operación cancelada");
        }

        //b
        String texto = JOptionPane.showInputDialog("Ingrese un texto");
        JOptionPane.showMessageDialog(null, "El texto ingresado es: " + texto);
    }
}