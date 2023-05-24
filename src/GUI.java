import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JPanel panel1;
    private JButton bCrear;
    private JTextField tModelo;
    private JTextField tMatricula;
    private JLabel eModelo;
    private JLabel eMatricula;
    private JButton jButton1;

    private JButton jButton2;

    public GUI() {
        bCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.crearCoche(tModelo.getText(),tMatricula.getText());
            }
        });
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.bajarVelocidad(tMatricula.getText());
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.aumentarVelocidad(tMatricula.getText());
            }
        });
    }

    public static void crearVentana() {
        JFrame frame = new JFrame("Ventana coches");
        frame.setContentPane(new GUI().panel1);
        frame.setDefaultCloseOperation(3);
        frame.pack();
        frame.setVisible(true);
    }
}