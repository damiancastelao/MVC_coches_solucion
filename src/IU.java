import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Entorno gráfico - Interfaz de Usuario
 */
public class IU {
    private JButton crearCoche;
    public JPanel panel;
    private JTextField modelo;
    private JTextField matricula;

    /**
     * Constructor del entorno gráfico
     * tendrá los listener de la interfaz gráfica
     */
    public IU() {
        // añadimos listener al boton
        crearCoche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("creando coche");
                // le decimos al controlador que cree un coche
                Controller.crearCoche(modelo.getText(), matricula.getText());
            }
        });
    }

    /**
     * Inicializa la Interfaz del Usuario
     * Lo llamaremos en el constructor de la vista
     */
    public static void crearVentana(){
            JFrame jframe = new JFrame("App MVC");
            jframe.setContentPane(new IU().panel);
            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jframe.pack();
            jframe.setVisible(true);
        }
}
