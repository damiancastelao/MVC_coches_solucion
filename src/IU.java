import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IU {
    private JPanel panel1;
    private JButton crear_coche;
    private JTextField modelo;
    private JTextField matricula;
    private JButton button1;
    private JButton button2;
    private JButton btn_getCoche;

    //como necesitamos un controlador lo instanciaremos fuera
    Controller controlador;

    public IU() {  
        //primero debemos instanciar el controlador
         controlador = new Controller();
        crear_coche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            controlador.crearCoche(modelo.getText(),matricula.getText());
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.bajarVelocidad(matricula.getText());
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.aumentarVelocidad(matricula.getText());
            }
        });
        btn_getCoche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.getCoche(matricula.getText());
            }
        });
    }


    /**
     * Inicializa la Interfaz del Usuario
     * Lo llamaremos en el constructor de la vista
     */
    public static void crearVentana(){
        JFrame jframe = new JFrame("Aplicacion Marcos MVC");
        jframe.setContentPane(new IU().panel1);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.pack();
        jframe.setVisible(true);
    }

}
