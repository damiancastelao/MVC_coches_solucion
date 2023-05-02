public class Controller {
    static Model miModelo;
    static View miVista;
    static BuilderCoche builder;
    /**
     * Este es el punto inicial de nuestra aplicación
     * Las tareas iniciales estarían en este método
     * @param args no usadas
     */
    public static void main(String[] args) {
        miModelo = new Model();
        miVista = new View();
        builder = new BuilderCoche();


    }

    /**
     * @param modelo
     * @param matricula
     * @param aireAcondicionado
     * @param tapizadoDeCuero
     * @param  numeroDePuertas
     */

    public void crearCoche(String modelo, String matricula, boolean aireAcondicionado, boolean tapizadoDeCuero, int numeroDePuertas ) {
        Coche coche = miModelo.crearCoche(modelo, matricula, aireAcondicionado,tapizadoDeCuero, numeroDePuertas);
        if (coche != null)
            miVista.mostrarCoche(coche.modelo, coche.matricula, coche.aireAcondicionado,coche.tapizadoDeCuero, coche.numeroDePuertas );
        // TODO mandar mensaje de error si no fue posible crear el coche
    }
}
