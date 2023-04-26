import java.util.ArrayList;

public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo mete en el parking
     * @param modelo del coche
     * @param matricula identificador unico
     * @return el coche creado
     */
    public Coche crearCoche(String modelo, String matricula){
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca coche segun matricula
     * @param matricula a buscar
     * @return coche o null si no existe
     */
    public Coche getCoche(String matricula){
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
     * Sube la velocidad según la matrícula
     * @param matricula a buscar
     * @param v velocidad a aumentar
     * @return la nueva velocidad
     */
    public Integer subirVelocidad(String matricula, Integer v) {
        // busca el coche y aumenta la velocidad
        getCoche(matricula).velocidad += v;
        // devuelve la nueva velocidad
        return getCoche(matricula).velocidad;
    }

    /**
     * Ddevuelve la velocidad segun la matricula
     * @param matricula
     * @return
     */
    public Integer getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }
}
