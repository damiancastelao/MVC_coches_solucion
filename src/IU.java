import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IU {
    private JPanel panel1;
    private JButton bCrear;
    private JTextField tModelo;
    private JTextField tMatricula;
    private JLabel eModelo;
    private JLabel eMatricula;
    private JButton button1;
    private JButton button2;
    private JButton bVerCoche;
    private JButton bAvisarVelocidad;

    private Model myModel;
    private View myView;

    public IU(Model model, View view) {
        myModel = model;
        myView = view;

        // Crear los componentes manualmente
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(6, 2));

        eModelo = new JLabel("Modelo:");
        tModelo = new JTextField();
        eMatricula = new JLabel("Matrícula:");
        tMatricula = new JTextField();
        bCrear = new JButton("Crear Coche");
        button1 = new JButton("Bajar Velocidad");
        button2 = new JButton("Aumentar Velocidad");
        bVerCoche = new JButton("Buscar Coche");
        bAvisarVelocidad = new JButton("Avisar Velocidad");

        // Agregar los componentes al panel
        panel1.add(eModelo);
        panel1.add(tModelo);
        panel1.add(eMatricula);
        panel1.add(tMatricula);
        panel1.add(bCrear);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(bVerCoche);
        panel1.add(bAvisarVelocidad);

        bCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Coche coche = myModel.crearCoche(tModelo.getText(), tMatricula.getText());
                if (coche != null) {
                    JOptionPane.showMessageDialog(panel1, "Coche creado correctamente");
                } else {
                    JOptionPane.showMessageDialog(panel1, "No se pudo crear el coche", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        bVerCoche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Coche coche = myModel.getCoche(tMatricula.getText());
                if (coche != null) {
                    String mensaje = "Datos del coche encontrado:\n" +
                            "Matrícula: " + coche.getMatricula() + "\n" +
                            "Modelo: " + coche.getModelo() + "\n" +
                            "Velocidad: " + coche.getVelocidad() + " km/hr";
                    JOptionPane.showMessageDialog(panel1, mensaje, "Coche encontrado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(panel1, "No se encontró un coche con la matrícula especificada.", "Coche no encontrado", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String matricula = tMatricula.getText();
                Integer velocidad = myModel.bajarVelocidad(matricula, 10);
                if (velocidad != null) {
                    myView.muestraVelocidad(matricula, velocidad);
                } else {
                    JOptionPane.showMessageDialog(panel1, "No se encontró un coche con la matrícula especificada.", "Coche no encontrado", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String matricula = tMatricula.getText();
                Integer velocidad = myModel.subirVelocidad(matricula, 10);
                if (velocidad != null) {
                    myView.muestraVelocidad(matricula, velocidad);
                    if (velocidad > 120) {
                        JOptionPane.showMessageDialog(panel1, "Alerta: ¡Velocidad excedida!", "Alerta de velocidad", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(panel1, "No se encontró un coche con la matrícula especificada.", "Coche no encontrado", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        bAvisarVelocidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String matricula = tMatricula.getText();
                Integer velocidad = myModel.getVelocidad(matricula);
                if (velocidad != null) {
                    if (velocidad > 120) {
                        JOptionPane.showMessageDialog(panel1, "Alerta: ¡Velocidad excedida!", "Alerta de velocidad", JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(panel1, "La velocidad está dentro del límite permitido.");
                    }
                } else {
                    JOptionPane.showMessageDialog(panel1, "No se encontró un coche con la matrícula especificada.", "Coche no encontrado", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    public static void crearVentana(Model model, View view) {
        JFrame frame = new JFrame("Ventana coches");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        IU iu = new IU(model, view);
        frame.setContentPane(iu.panel1);

        frame.setVisible(true);
    }
}
