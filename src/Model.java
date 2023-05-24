import java.util.ArrayList;

/**
 * La clase Model representa los datos y la lógica de la aplicación.
 */
public class Model {
    private ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea una nueva instancia de la clase Coche y la agrega a la lista de parking.
     *
     * @param modelo    El modelo del coche.
     * @param matricula La matrícula del coche.
     * @return El objeto Coche creado.
     */
    public Coche crearCoche(String modelo, String matricula) {
        Coche coche = new Coche(modelo, matricula);
        parking.add(coche);
        return coche;
    }

    /**
     * Cambia la velocidad de un coche con la matrícula especificada.
     *
     * @param matricula La matrícula del coche.
     * @param velocidad El nuevo valor de velocidad.
     * @return La velocidad actualizada del coche.
     */
    public Integer cambiarVelocidad(String matricula, Integer velocidad) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(velocidad);
            return coche.getVelocidad();
        }
        return null;
    }

    /**
     * Obtiene un objeto Coche con la matrícula especificada.
     *
     * @param matricula La matrícula del coche.
     * @return El objeto Coche encontrado o null si no se encuentra.
     */
    public Coche getCoche(String matricula) {
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(matricula)) {
                return coche;
            }
        }
        return null;
    }

    /**
     * Incrementa la velocidad de un coche con la matrícula especificada.
     *
     * @param matricula  La matrícula del coche.
     * @param incremento El valor de incremento de velocidad.
     * @return La velocidad actualizada del coche.
     */
    public Integer subirVelocidad(String matricula, Integer incremento) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(coche.getVelocidad() + incremento);
            return coche.getVelocidad();
        }
        return null;
    }

    /**
     * Decrementa la velocidad de un coche con la matrícula especificada.
     *
     * @param matricula  La matrícula del coche.
     * @param decremento El valor de decremento de velocidad.
     * @return La velocidad actualizada del coche.
     */
    public Integer bajarVelocidad(String matricula, Integer decremento) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(coche.getVelocidad() - decremento);
            return coche.getVelocidad();
        }
        return null;
    }

    /**
     * Obtiene la velocidad de un coche con la matrícula especificada.
     *
     * @param matricula La matrícula del coche.
     * @return La velocidad del coche o null si no se encuentra.
     */
    public Integer getVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            return coche.getVelocidad();
        }
        return null;
    }
}
