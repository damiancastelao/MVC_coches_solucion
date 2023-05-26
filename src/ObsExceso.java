import java.util.Observable;
import java.util.Observer;

public class ObsExceso implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Coche coche = (Coche) arg;
        if (coche.getVelocidad() > 120) {
            System.out.println("¡Alerta: velocidad excedida!");
        }
    }
}
