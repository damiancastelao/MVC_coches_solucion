import java.util.ArrayList;

public class Model {
    private ArrayList<Coche> parking = new ArrayList<>();

    public Coche crearCoche(String modelo, String matricula) {
        Coche coche = new Coche(modelo, matricula);
        parking.add(coche);
        return coche;
    }

    public Integer cambiarVelocidad(String matricula, Integer velocidad) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(velocidad);
            return coche.getVelocidad();
        }
        return null;
    }

    public Coche getCoche(String matricula) {
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(matricula)) {
                return coche;
            }
        }
        return null;
    }

    public Integer subirVelocidad(String matricula, Integer incremento) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(coche.getVelocidad() + incremento);
            return coche.getVelocidad();
        }
        return null;
    }

    public Integer bajarVelocidad(String matricula, Integer decremento) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(coche.getVelocidad() - decremento);
            return coche.getVelocidad();
        }
        return null;
    }

    public Integer getVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            return coche.getVelocidad();
        }
        return null;
    }
}
