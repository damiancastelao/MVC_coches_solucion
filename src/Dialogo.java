import javax.swing.*;

public class Dialogo  extends JDialog {
    private JPanel panelDialogo;
    private static Dialogo instance;
    private  JTextField textAreatexto;

    private Dialogo() {

        setContentPane(panelDialogo);
        setModal(true);

    }
    /**
     * Metodo instance singleton garantiza que tan solo exista
     * un objeto de su tipo y proporciona un único punto de acceso a él para cualquier otro código.
     * @return instance
     */
    public static Dialogo getInstance() {
        if (instance == null) {
            instance = new Dialogo();
        }
        return instance;
    }
        /**
         * Mostramos un dialogo modal con información
         * @param msg información que queremos mostrar
         */
        public static void mostrarMensaje(String msg) {

            Dialogo dialog = getInstance();
            dialog.pack();
            // actualizamos mensaje
            dialog.textAreatexto.setText(msg);
            dialog.setDefaultCloseOperation(HIDE_ON_CLOSE);
            dialog.setBounds(500, 200, 800, 350);
            dialog.setVisible(true);

        }
}
