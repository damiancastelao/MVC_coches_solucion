import javax.swing.*;


public class Dialogo extends JDialog {
    private JPanel panel1;
    private JLabel eVelocidad;

    public Dialogo() {
        setContentPane(panel1);
        setModal(true);
        setDefaultCloseOperation(1);
    }

    /**
     * Metodo en el que instancio ventana
     * @param mensaje la velocidad que ponga el usuario
     */
    public static void ventanaDialogo(String mensaje) {
        Dialogo dialogo = new Dialogo();
        dialogo.pack();
        dialogo.eVelocidad.setText(mensaje);
        dialogo.setVisible(true);

    }
}
