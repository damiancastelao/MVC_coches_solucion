import java.util.ArrayList;

public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo mete en el parking
     *
     * @param modelo    del coche
     * @param matricula identificador unico
     * @return el coche creado
     */
    public Coche crearCoche(String modelo, String matricula) {
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca coche segun matricula
     *
     * @param matricula a buscar
     * @return chche o null si no existe
     */
    public Coche getCoche(String matricula) {
        Coche aux = null;
        // recorre el array buscando por matricula
        for (Coche e : parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }
    /**
     * Modifica la velocidad actual según la matrícula y la velocidad introducida
     *
     * @param matricula matrícula del coche al que se le va a modificar la velocidad
     * @param v         velocidad que se establece en km/h
     * @return velocidad actual
     */

  public Integer setVelocidad(String matricula, Integer v) {
        // busca el coche
        getCoche(matricula).velocidad = v;
        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }

    /**
     * Aumenta la velocidad actual según la matrícula y el incremento
     *
     * @param matricula matrícula del coche al que se le va a modificar la velocidad
     * @param v         incremento de la velocidad en km/h
     * @return velocidad modificada
     */
    public Integer subirVelocidad(String matricula, Integer v) {
        // busca el coche y le asigna el incremento a la velocidad
        getCoche(matricula).velocidad = getVelocidad(matricula) + v;
        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }


    /**
     * Reduce la velocidad actual según la matrícula y el incremento
     *
     * @param matricula matrícula del coche al que se le va a modificar la velocidad
     * @param v         decremento de la velocidad en km/h
     * @return velocidad modificada
     */
    public Integer bajarVelocidad(String matricula, Integer v) {
        // busca el coche y le asigna el incremento a la velocidad
        getCoche(matricula).velocidad = getVelocidad(matricula) - v;
        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }


    /**
     * Devuelve la velocidad segun la matricula
     *
     * @param matricula
     * @return
     */
    public Integer getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }

}