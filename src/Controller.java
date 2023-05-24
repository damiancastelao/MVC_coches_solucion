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


    /**
     * Metodo para reducir al velocidad dle coche
     * @param matricula del coceh al cual vamos a bajar al velocidad
     */
    public static void bajarVelocidad(String matricula){
        int aux = miModelo.bajarVelocidad(matricula);
        vista.muestraVelocidad(matricula, aux);
    }

    /**
     * Metodo aumentar la velocidad
     * @param matricula del coche al cual vamos a aumentar la velocidad
     */
    public static void aumentarVelocidad(String matricula){
        int aux = miModelo.subirVelocidad(matricula);
        vista.muestraVelocidad(matricula,aux);
    }

    /**
     *Método que devuelve solo la velocidad del coche y lo muestra
     * @param matricula del coche el cual queremos obtener la velocidad
     */
    public static void getVelocidad(String matricula){
        int aux = miModelo.getVelocidad(matricula);
        vista.muestraVelocidad(matricula,aux);
    }

    /**
     * Creamos un método al cual le pasamos la amtricula de un coche y nos muestra ese coche
     * @param matricula del coche a buscar
     */
    public  static void getCoche(String matricula){
        Coche aux = miModelo.getCoche(matricula);
        vista.muestraCoche(aux.matricula,aux.velocidad);
    }


    /**
     * Metodo main
     * @param args
     */
    public static void main(String[] args) {
        miModelo = new Model();
        vista = new View();




    }
}