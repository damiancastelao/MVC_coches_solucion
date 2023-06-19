import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controller {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Gestión de Coches");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el panel principal
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(10, 10, 10, 10);

        // Etiquetas y campos de texto para nombre y matrícula
        JLabel nameLabel = new JLabel("Nombre:");
        JTextField nameField = new JTextField();
        JLabel plateLabel = new JLabel("Matrícula:");
        JTextField plateField = new JTextField();

        // Botón para crear un coche
        JButton createButton = new JButton("Crear Coche");
        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = nameField.getText();
                String matricula = plateField.getText();
                Model.crearCoche(nombre, matricula);
                JOptionPane.showMessageDialog(frame, "Coche creado con éxito");
                nameField.setText("");
                plateField.setText("");
            }
        });

        // Etiqueta y campo de texto para la velocidad
        JLabel speedLabel = new JLabel("Velocidad Punta:");
        JTextField speedField = new JTextField();

        // Botón para subir la velocidad punta
        JButton speedButton = new JButton("Subir Velocidad");
        speedButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String matricula = JOptionPane.showInputDialog(frame, "Introduce la matrícula del coche:");
                String velocidadStr = speedField.getText();
                try {
                    int velocidad = Integer.parseInt(velocidadStr);
                    Model.subirVelocidad(matricula, velocidad);
                    JOptionPane.showMessageDialog(frame, "Velocidad actualizada exitosamente");
                    speedField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "La velocidad debe ser un número entero");
                }
            }
        });

        // Botón para consultar los coches y su velocidad
        JButton queryButton = new JButton("Consultar Coches");
        queryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                ArrayList<Coche> parking = Model.getParking();
                for (Coche coche : parking) {
                    sb.append("Matrícula: ").append(coche.matricula).append(", Velocidad: ").append(coche.getVelocidad()).append("\n");
                }
                JOptionPane.showMessageDialog(frame, sb.toString());
            }
        });

        // Agregar componentes al panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(nameLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(nameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(plateLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(plateField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        panel.add(createButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(speedLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        panel.add(speedField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        panel.add(speedButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        panel.add(queryButton, constraints);

        // Ajustar el tamaño de la ventana principal
        frame.setPreferredSize(new Dimension(400, 300));

        // Agregar el panel al frame
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
