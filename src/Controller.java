public class Controller {
    static Model miModelo;
    static View miVista;


    /**
     * Este es el punto inicial de nuestra aplicación
     * Las tareas iniciales estarían en este método
     * @param args no usadas
     */
    public static void main(String[] args) {
        miModelo = new Model();
        miVista = new View();

        ObsExceso obsExceso = new ObsExceso();
        miModelo.addObserver(obsExceso);

    }

    /**
     * @param modelo del coche
     * @param matricula del coche
     * @param aireAcondicionado un boolean para verificar si tiene aire acondicionado
     * @param tapizadoDeCuero un boolean para comprobar si tiene tapizado
     * @param numeroDePuertas numero de puertas del coche
     * @param velocidad;
     */


    public void  crearCoche(String modelo, String matricula, boolean aireAcondicionado, boolean tapizadoDeCuero, int numeroDePuertas, int velocidad) {
        Coche coche = miModelo.crearCoche(modelo, matricula, aireAcondicionado, tapizadoDeCuero, numeroDePuertas, velocidad);
        if (coche != null)
            View.mostrarCoche(coche.modelo, coche.matricula, coche.aireAcondicionado, coche.tapizadoDeCuero, coche.numeroDePuertas, coche.velocidad);

    }

    /**
     * Metodo aumentarVelocidad
     * @param matricula del coche
     * @param velocidad del coche
     */
    public void aumentarVelocidad(String matricula, int velocidad) {
        miModelo.subirVelocidad(matricula, velocidad);
    }
    /**
     * Metodo  dismuirVelocidad
     * @param matricula del coche
     * @param velocidad velocidad del coche
     */
    public void disminuirVelocidad(String matricula, int velocidad) {
        miModelo.bajarVelocidad(matricula, velocidad);
    }

    /**
     * @param matricula buscamos el coche mediante de la matricula
     * @return la matricula
     */
    public Coche buscar(String matricula) {
        return  Model.getCoche(matricula);
    }

}