import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Iu {
    static Controller controller ;
    private JButton buttonCrearCoche;
    private JTextField textFielMatricula;
    private JTextField textFieldModelo;
    private JPanel panelIu;
    private JLabel lblModelo;

    private JTextField textFieldNumeropuertas;
    private JLabel lblMatricula;
    private JLabel JlbAire;
    private JLabel JlbNumeroPuertas;
    private JLabel JlbTapizado;
    private JCheckBox checkBoxAire;
    private JCheckBox checkBoxpuerta;
    private JButton buttonAumentar;
    private JButton buttonDisminuir;
    private JTextField textFieldVelocidad;
    private JButton Buttonsalir;
    private JButton BuscarButton;

    /**
     * Constructor de la clase Iu.
     * Se encarga de inicializar la interfaz de usuario y configurar los ActionListener para los botones.
     */
    public Iu() {

        controller = new Controller();
        buttonCrearCoche.addActionListener(new ActionListener() {
            /**
             * Método que se ejecuta cuando se produce un evento de acción en el botón buttonCrearCoche.
             *
             * @param e El evento de acción.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String matricula = textFielMatricula.getText();
                String modelo = textFieldModelo.getText();
                boolean  tieneAireAcondicionado =  checkBoxAire.isSelected();
                boolean tieneTapizado = checkBoxpuerta.isSelected();
                int numeroPuertas = Integer.parseInt(textFieldNumeropuertas.getText());
                int  velocidad = Integer.parseInt(textFieldVelocidad.getText()) ;


                controller.crearCoche(modelo, matricula, tieneAireAcondicionado, tieneTapizado, numeroPuertas,velocidad);

            }
        });

        /**
         *  ActionListener para el botón buttonAumentar
         */
        buttonAumentar.addActionListener(new ActionListener() {
            /**
             * Método que se ejecuta cuando se produce un evento de acción en el botón buttonAumentar.
             *
             * @param e El evento de acción.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                int nuevaVelocidad = controller.aumentarVelocidad(textFielMatricula.getText(),10 );
                textFieldVelocidad.setText(String.valueOf(nuevaVelocidad));
            }
        });

        /**
         * ActionListener para el botón buttonDisminuir.
         */
        buttonDisminuir.addActionListener(new ActionListener() {
            /**
             * Método que se ejecuta cuando se produce un evento de acción en el botón buttonDisminuir.
             *
             * @param e El evento de acción.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                int nuevaVelocidad = controller.disminuirVelocidad(textFielMatricula.getText(),10 );
                textFieldVelocidad.setText(String.valueOf(nuevaVelocidad));
            }
        });

        /**
         * ActionListener para el botón Buttonsalir.
         */
        Buttonsalir.addActionListener(new ActionListener() {
            /**
             * Método que se ejecuta cuando se produce un evento de acción en el botón Buttonsalir.
             *
             * @param e El evento de acción.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        /**
         * ActionListener para el botón BuscarButton.
         */
            BuscarButton.addActionListener(new ActionListener() {
                /**
                 * Método que se ejecuta cuando se produce un evento de acción en el botón BuscarButton.
                 *
                 * @param e El evento de acción.
                 */
                @Override
                public void actionPerformed(ActionEvent e) {

                    Coche cocheEncontrado = controller.buscar(textFielMatricula.getText());
                    if (cocheEncontrado != null) {
                        textFieldModelo.setText(cocheEncontrado.getModelo());
                        checkBoxAire.setSelected(cocheEncontrado.isAireAcondicionado());
                        checkBoxpuerta.setSelected(cocheEncontrado.isTapizadoDeCuero());
                        textFieldNumeropuertas.setText(String.valueOf(cocheEncontrado.getNumeroDePuertas()));
                        textFieldVelocidad.setText(String.valueOf(cocheEncontrado.getVelocidad()));

                    } else {

                        JOptionPane.showMessageDialog(null,"No se encontró ningún coche con la matrícula " + textFielMatricula.getText());
                    }
                }
            });
    }
    /**
     * Metodos en donde creamos la ventana
     */
    public static void crearVentana(){
        JFrame jframe = new JFrame("App ");
        jframe.setContentPane(new Iu().panelIu);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.pack();
        jframe.setVisible(true);
        jframe.setBounds(500, 200, 500, 350);
    }



}



