public class Controller {

   static Model miModelo = new Model();
   static View miVista = new View();

    /**
     * Metodo main con el que llamo a la vista para visualizar ventana y dialogo
     * @param args
     */
    public static void main(String[] args) {

        miVista.View();


    }

    /**
     *Metodo que crea coche y muestra la velocidad de este
     * @param modelo del coche
     * @param matricula del coche
     */
    public static void crearCoche(String modelo, String matricula) {
        Coche aux = miModelo.crearCoche(modelo, matricula);
        if (aux != null) {
            miVista.muestraVelocidad(aux.matricula, aux.velocidad);
        }


    }

    /**
     * Metodo que llamando a Model baja la velocidad y que llamando al View nos lo muestra por pantalla
     * @param matricula del coche
     * @param v velocidad a reducir
     */
    public static void bajarVelocidad(String matricula,int v){
        int aux = miModelo.bajarVelocidad(matricula,v);
        miVista.muestraVelocidad(matricula,aux);
    }
    /**
     * Metodo que llamando a Model aumenta la velocidad y que llamando al View nos lo muestra por pantalla
     * @param matricula del coche
     * @param v velocidad a aumentar
     */
    public static void subirVelocidad(String matricula,int v){

        int aux = miModelo.subirVelocidad(matricula,v);
        miVista.muestraVelocidad(matricula,aux);
    }


}