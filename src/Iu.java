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

    public Iu() {

        controller = new Controller();
        buttonCrearCoche.addActionListener(new ActionListener() {
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
        buttonAumentar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int nuevaVelocidad = controller.aumentarVelocidad(textFielMatricula.getText(),10 );
                textFieldVelocidad.setText(String.valueOf(nuevaVelocidad));
            }
        });
        buttonDisminuir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int nuevaVelocidad = controller.disminuirVelocidad(textFielMatricula.getText(),10 );
                textFieldVelocidad.setText(String.valueOf(nuevaVelocidad));
            }
        });
        Buttonsalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
            BuscarButton.addActionListener(new ActionListener() {
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



