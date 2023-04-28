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
     * @return chche o null si no existe
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
     * metodo que aumenta la velocidad actual
     * @param matricula
     * @param v pisamos el acelerador
     * @return nueva velocidad
     */
    public Integer subirVelocidad(String matricula, Integer v){
        //buscamos el coche
        Integer velocidadActual = getCoche(matricula).velocidad;
        //subimos la velocidad
        velocidadActual += v;
        //retornamos la nueva velocidad
        return getCoche(matricula).velocidad;
    }

    /**
     * metodo que disminuye la velocidad actual
     * @param matricula
     * @param v soltamos el acelerador
     * @return nueva velocidad
     */
    public Integer bajarVelocidad(String matricula, Integer v){
        //buscamos el coche
        Integer velocidadActual = getCoche(matricula).velocidad;
        //subimos la velocidad
        velocidadActual -= v;
        //retornamos la nueva velocidad
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
