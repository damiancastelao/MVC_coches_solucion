import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Iu {
    static Controller controller ;
    static BuilderCoche builder;
    private JButton buttonCrearCoche;
    private JTextField textFielMatricula;
    private JTextField textFieldModelo;
    private JPanel panelIu;
    private JLabel lblModelo;
    private JComboBox comboBoxAire;
    private JComboBox comboBoxTapizado;
    private JTextField textFieldNumeropuertas;
    private JLabel lblMatricula;
    private JLabel JlbAire;
    private JLabel JlbNumeroPuertas;
    private JLabel JlbTapizado;


    public Iu() {

        controller = new Controller();
        builder = new BuilderCoche();


        buttonCrearCoche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String matricula = textFielMatricula.getText();
                String modelo = textFieldModelo.getText();
                boolean tieneAireAcondicionado =  Boolean.parseBoolean((String) comboBoxAire.getSelectedItem());
                boolean tieneTapizado = Boolean.parseBoolean((String) comboBoxTapizado.getSelectedItem());
                int numeroPuertas = Integer.parseInt(textFieldNumeropuertas.getText());
                controller.crearCoche(matricula, modelo, tieneAireAcondicionado, tieneTapizado, numeroPuertas);
            }
        });

    }

    public static void crearVentana(){
        JFrame jframe = new JFrame("App ");
        jframe.setContentPane(new Iu().panelIu);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.pack();
        jframe.setVisible(true);
        jframe.setBounds(600, 300, 500, 350);
    }



}



