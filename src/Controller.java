public class Controller {
    static Model miModelo;
    static View miVista;

    /**
     * Este es el punto inicial de nuestra aplicación
     * Las tareas iniciales estarían en este método
     *
     * @param args no usadas
     */
    public static void main(String[] args) {
        miModelo = new Model();
        miVista = new View();

    }


    /**
     * @param modelo
     * @param matricula
     * @param aireAcondicionado
     * @param tapizadoDeCuero
     * @param numeroDePuertas
     * @param velocidad;
     */

    public void  crearCoche(String modelo, String matricula, boolean aireAcondicionado, boolean tapizadoDeCuero, int numeroDePuertas, int velocidad) {
        Coche coche = miModelo.crearCoche(modelo, matricula, aireAcondicionado, tapizadoDeCuero, numeroDePuertas, velocidad);
        if (coche != null)
            miVista.mostrarCoche(coche.modelo, coche.matricula, coche.aireAcondicionado, coche.tapizadoDeCuero, coche.numeroDePuertas, coche.velocidad);

         }

    /**
     * Metodo aumentarVelocidad
     *
     * @param matricula
     * @param velocidad
     * @return velocidad
     */
    public int aumentarVelocidad(String matricula, int velocidad) {
        return miModelo.subirVelocidad(matricula, velocidad);
    }

    /**
     * Metodo  dismuirVelocidad
     *
     * @param matricula
     * @param velocidad
     * @return velocidad
     */
    public int disminuirVelocidad(String matricula, int velocidad) {
        return miModelo.bajarVelocidad(matricula, velocidad);
    }

    /**
     * Busca un objeto Coche en base a una matrícula específica.
     *
     * @param matricula La matrícula del coche que se desea buscar.
     * @return El objeto Coche correspondiente a la matrícula especificada, o null si no se encuentra.
     */
    public Coche  buscar(String matricula) {
        return miModelo.getCoche(matricula);
    }
}
