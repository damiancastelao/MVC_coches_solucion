import javax.swing.*;

public class Dialogo extends JDialog {
    private JPanel contentPane;
    private JLabel mensaje;

    public Dialogo() {
        setContentPane(contentPane);
        setModal(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    public static void main(String mensaje) {
        Dialogo dialog = new Dialogo();
        dialog.pack();
        dialog.mensaje.setText(mensaje);
        dialog.setVisible(true);
    }
}
