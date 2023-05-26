import java.util.Observable;
import java.util.Observer;

public class ObsExceso implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Model model = (Model) o;
        int velocidad = model.getVelocidad();
        if (velocidad > 120) {
            System.out.println("Alerta: velocidad excedida!");
        }
    }
}
