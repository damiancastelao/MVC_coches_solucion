import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazGrafica {
    private static JFrame app;
    private JPanel panel;
    private JButton bCrearCoche;
    private JTextField modelo;
    private JTextField matricula;
    static Controller miControlador;

    public InterfazGrafica() {
        miControlador = new Controller();
        bCrearCoche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miControlador.bCrearCoche(modelo.getText(), matricula.getText());
            }
        });
    }
    public static void crearVentana(){
        app = new JFrame("App MVC");
        app.setContentPane(new InterfazGrafica().panel);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.pack();
        app.setVisible(true);
    }
}


