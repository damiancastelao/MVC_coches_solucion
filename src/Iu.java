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
    public  JTextField textFieldVelocidad;
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
                String matricula = textFielMatricula.getText();
                controller.aumentarVelocidad(matricula, 10);
            }
        });
        buttonDisminuir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String matricula = textFielMatricula.getText();
                controller.disminuirVelocidad(matricula, 10);
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
    public static Iu crearVentana(){
        JFrame jframe = new JFrame("App ");
        Iu form = new Iu();
        jframe.setContentPane(form.panelIu);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.pack();
        jframe.setVisible(true);
        jframe.setBounds(500, 200, 500, 350);
        return form;
    }
}



