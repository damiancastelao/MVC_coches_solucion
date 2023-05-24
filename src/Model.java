import java.util.ArrayList;

public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo mete en el parking
     * @param modelo del coche
     * @param matricula identificador unico
     * @return el coche creado
     */
    public static Coche crearCoche(String modelo, String matricula){
        // Creamos un objeto 'aux' de la clase coche
        Coche aux = new Coche(modelo, matricula);
        // Lo añadimos al ArrayList 'parking'
        parking.add(aux);
        return aux;
    }

    /**
     * Busca coche segun matricula
     * @param matricula a buscar
     * @return chche o null si no existe
     */
    public static Coche getCoche(String matricula){
        Coche aux = null;
        // recorre el array buscando por matricula
        for (Coche e: parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }

    /**
     * Metodo que cambia la velocidad que queremos
     * @param matricula
     * @param v nueva velocidad
     * @return velocidad modificada
     */
    public static Integer cambiarVelocidad(String matricula, Integer v) {
        // busca el coche
        getCoche(matricula).velocidad = v;
        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }

    /**
     * Sube la velocidad que queramos
     * @param matricula del coche
     * @param v velocidad a aumentar
     * @return velocidad actualizada
     */
    public static Integer subirVelocidad(String matricula, Integer v){
        // Tomamos la velocidad del coche que indiquemos y le subimos la velocidad que pasamos por parametro
        getCoche(matricula).velocidad = v + getCoche(matricula).velocidad;
        return getCoche(matricula).velocidad;
    }

    /**
     * Baja la velocidad que queramos
     * @param matricula del coche
     * @param v velocidad a reducir
     * @return velocidad actualizada
     */
    public static Integer bajarVelocidad(String matricula, Integer v){
        // Tomamos la velocidad del coche que indiquemos y le bajamos la velocidad que pasamos por parametro
        getCoche(matricula).velocidad = getCoche(matricula).velocidad - v;
        return getCoche(matricula).velocidad;
    }

    /**
     * Devuelve la velocidad segun la matricula
     * @param matricula
     * @return
     */
    public Integer getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }
}
