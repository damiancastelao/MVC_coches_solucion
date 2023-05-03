import java.util.ArrayList;

public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();
    private final BuilderCoche builder = new BuilderCoche();

    /**
     * Crea un coche cn builder que permite construir objetos complejos paso a paso.
     *añadimos el coche en el parking
     * @return  coche
     */
    public Coche crearCoche(String modelo, String matricula, boolean aireAcondicionado, boolean tapizadoDeCuero, int numeroDePuertas, int velocidad) {

        Coche coche = builder.setModelo(modelo)
                .setMatricula(matricula)
                .setAireAcondicionado(aireAcondicionado)
                .setTapizadoDeCuero(tapizadoDeCuero)
                .setNumeroDePuertas(numeroDePuertas)
                .setVelocidad(velocidad).build();

        parking.add(coche);
        return coche;

    }

    /**
     * Busca coche segun matricula
     * @param matricula a buscar
     * @return chche o null si no existe
     */
    public Coche getCoche(String matricula) {

        // recorre el array buscando por matricula
        for (Coche coche : parking) {
            if (coche.matricula.equalsIgnoreCase(matricula)) {
                 return coche;
            }
        }
        return null;
    }

    /**
     * @param matricula
     * @param velocidadTotal nueva velocidad
     * @return velocidad modificada
     */
    public Integer cambiarVelocidad(String matricula, Integer velocidadTotal) {
        // busca el coche
        Coche coche = getCoche(matricula);
        coche.velocidad = velocidadTotal;

        // retorna la nueva velocidad
        return coche.velocidad;
    }

    /**
     * Ddevuelve la velocidad segun la matricula
     * @param matricula coche
     */
    public Integer getVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        return coche.velocidad;
    }

    /**
     * @param velocidadAumentar nueva velocidad
     * @return velocidad modificada
     */
    public  Integer subirVelocidad(String matricula, int velocidadAumentar) {

        // busca el coche
        Coche coche = getCoche(matricula);
        coche.velocidad += velocidadAumentar;

        // retorna la nueva velocidad
        return  coche.velocidad;
    }
    /**
     * @param velocidadDisminuir nueva velocidad
     * @return velocidad modificada
     */
    public  Integer bajarVelocidad(String matricula, int velocidadDisminuir) {
        // busca el coche
        Coche coche = getCoche(matricula);
        coche.velocidad -= velocidadDisminuir;

        // retorna la nueva velocidad
        return  coche.velocidad;
    }
}










