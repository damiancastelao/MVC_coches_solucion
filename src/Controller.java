public class Controller {
    static Model miModelo;
    static View miVista;
    static BuilderCoche builder;

    public static void main(String[] args) {
        miModelo = new Model();
        miVista = new View();
        builder = new BuilderCoche();



    }

    /**
     * @param modelo
     * @param matricula
     */

    public void crearCoche(String modelo, String matricula, boolean aireAcondicionado, int numeroDePuertas, boolean tapizadoDeCuero) {
        Coche coche = miModelo.crearCoche(modelo, matricula, aireAcondicionado, numeroDePuertas, tapizadoDeCuero);
        if (coche != null)
            miVista.mostrarCoche(coche.modelo, coche.matricula, coche.aireAcondicionado, coche.numeroDePuertas, coche.tapizadoDeCuero);
        // TODO mandar mensaje de error si no fue posible crear el coche
    }
}
