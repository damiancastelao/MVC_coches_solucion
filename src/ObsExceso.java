import java.util.Observable;
import java.util.Observer;

/**
 * Clase que implementa la interfaz Observer y se utiliza para manejar actualizaciones de velocidad de un Observable.
 */
public class ObsExceso implements Observer {
    /**
     * Método que se ejecuta cuando se produce una actualización en el Observable.
     *
     * @param o   el objeto Observable que generó la actualización.
     * @param arg el argumento pasado desde el Observable, que en este caso se espera que sea un objeto de tipo Coche.
     */

    @Override
    public void update(Observable o, Object arg) {
        Coche coche = (Coche) arg;
        if (coche.velocidad > 120) {

            View.excessoVelocidad( coche.matricula,coche.velocidad);
        }else{
            View.mostrarCoche(coche.modelo, coche.matricula, coche.aireAcondicionado, coche.tapizadoDeCuero, coche.numeroDePuertas, coche.velocidad);
        }

    }
}
