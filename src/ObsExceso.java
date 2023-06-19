import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

public class ObsExceso implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Coche coche = (Coche) arg;
        if (coche.getVelocidad() > 120) {
            JOptionPane.showMessageDialog(null, "¡Alerta: velocidad sobrepasada!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
}
