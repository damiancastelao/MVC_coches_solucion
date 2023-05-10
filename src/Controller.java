public class Controller {
    //modelo que maneja los datos
    static Model miModelo;
    //vista maneja IU
    static View vista;


    /**
     * Crea un coche y manda mensaje a la vista para el usuario
     * @param modelo del coche a crear
     * @param matricula identificador único del coche
     */
    public static void crearCoche(String modelo, String matricula){
        Coche aux = miModelo.crearCoche(modelo, matricula);
        if (aux != null) vista.muestraVelocidad(aux.matricula, aux.velocidad);


    }



    public static void bajarVelocidad(String matricula){
        int aux = miModelo.bajarVelocidad(matricula);
        vista.muestraVelocidad(matricula, aux);
    }

    public static void aumentarVelocidad(String matricula){
        int aux = miModelo.subirVelocidad(matricula);
        vista.muestraVelocidad(matricula,aux);
    }

    public static void main(String[] args) {
        miModelo = new Model();
        vista = new View();




    }
}