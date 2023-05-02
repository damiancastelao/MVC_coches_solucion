import javax.swing.*;
import java.awt.*;

public class Dialogo  extends JDialog {
    private JPanel panelDialogo;
    private  JTextField textFieldmensaje;


    public Dialogo() {
            setContentPane(panelDialogo);
            setModal(true);

        }

        /**
         * Mostramos un dialogo modal con información
         * @param msg información que queremos mostrar
         */
        public static void mostrarMensaje(String msg) {

            Dialogo dialog = new Dialogo();
            dialog.pack();
            // actualizamos mensaje
            dialog.textFieldmensaje.setText(msg);
            dialog.setDefaultCloseOperation(HIDE_ON_CLOSE);
            dialog.setBounds(600, 300, 500, 300);
            dialog.setVisible(true);




        }


}
