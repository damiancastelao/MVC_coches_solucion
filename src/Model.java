import java.util.ArrayList;
import java.util.List;
import java.util.Observer; // Importar Observer de java.util

public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();

    public static Coche crearCoche(String modelo, String matricula) {
        Coche aux = new Coche(modelo, matricula);
        aux.addObserver(new ObsExceso()); // Agregar el observer ObsExceso al nuevo coche
        parking.add(aux);
        return aux;
    }

    public static Coche getCoche(String matricula) {
        Coche aux = null;
        for (Coche e : parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
                break;
            }
        }
        return aux;
    }

    public static void subirVelocidad(String matricula, Integer v) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.subirVelocidad(v);
        }
    }

    public static void bajarVelocidad(String matricula, Integer v) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.bajarVelocidad(v);
        }
    }

    public static ArrayList<Coche> getParking() {
        return parking;
    }
}
