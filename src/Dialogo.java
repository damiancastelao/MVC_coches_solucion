import javax.swing.*;
import java.awt.event.*;

public class Dialogo extends JDialog {
    private JPanel contentPane;
    private JLabel mensaje;
    private JLabel Label;
    private JTextField textField2;

    /**
     * Constructor
     */
    public Dialogo() {
        setContentPane(contentPane);
        setModal(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    /**
     * Nos crea una ventana que nos muestra lo que nosotros le enviemos
     * @param mensaje que nos aparece en la ventana
     */
    public static void main(String mensaje) {
        Dialogo dialog = new Dialogo();
        dialog.pack();
        dialog.mensaje.setText(mensaje);
        dialog.setVisible(true);
    }

}