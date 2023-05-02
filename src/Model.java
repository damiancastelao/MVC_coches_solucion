import java.util.ArrayList;

public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();
    private int velocidad;
    private Coche coche;

    /**
     * Crea un coche y lo mete en el parking
     * @return el coche creado
     */
 public Coche crearCoche(String modelo, String matricula, boolean aireAcondicionado, int numeroDePuertas, boolean tapizadoDeCuero) {
     coche= new BuilderCoche().build();
     parking.add(coche);

     return coche;

    }


    /**
     * Busca coche segun matricula
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
     * @param matricula
     * @param v   nueva velocidad
     * @return velocidad modificada
     */
    public Integer cambiarVelocidad(String matricula, Integer v) {
        // busca el coche
        getCoche(matricula).velocidad = v;

        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }

    /**
     * Ddevuelve la velocidad segun la matricula
     *
     * @param matricula
     */
    public Integer getVelocidad(String matricula) {

        return getCoche(matricula).velocidad;
    }

    /**
     * @param v nueva velocidad
     * @return velocidad modificada
     */
    public Integer subirVelocidad(String matricula, int v) {
        // busca el coche
        getCoche(matricula).velocidad += v;

        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }

    public Integer bajarVelocidad(String matricula, int v) {
        // busca el coche
        getCoche(matricula).velocidad -= v;
        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }
}










