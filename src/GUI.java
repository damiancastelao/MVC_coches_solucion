import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private static JFrame app;
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton crearButton;
    private JButton subirButton;
    private JButton bajarButton;

    public GUI(){
        crearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.crearButton(textField1.getText(), textField2.getText());
            }
        });
        subirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.subirButton(textField2.getText(), 20);
            }
        });
        bajarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.bajarButton(textField2.getText(), 10);
            }
        });
    }

    public static void createUIComponents() {
        app = new JFrame("App");
        app.setContentPane(new GUI().panel1);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.pack();
        app.setVisible(true);
    }
}
