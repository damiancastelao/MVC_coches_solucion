import java.util.Observable;
import java.util.Observer;

public class ObsExceso implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Coche) {
            Coche coche = (Coche) o;
            if (coche.getVelocidad() > 120) {
                System.out.println("Alerta: ¡Velocidad excedida!");
            }
        }
    }
}
