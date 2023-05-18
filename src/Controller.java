public class Controller {

   static Model miModelo = new Model();
   static View miVista = new View();


    public static void main(String[] args) {

        miVista.View("MVC COCHES");


    }

    /**
     *
     * @param modelo
     * @param matricula
     */
    public static void crearCoche(String modelo, String matricula) {
        Coche aux = miModelo.crearCoche(modelo, matricula);
        if (aux != null) {
            miVista.muestraVelocidad(aux.matricula, aux.velocidad);
        }


    }

    public static void bajarVelocidad(String matricula,int v){
        int aux = miModelo.bajarVelocidad(matricula,v);
        miVista.muestraVelocidad(matricula,aux);
    }

    public static void subirVelocidad(String matricula,int v){

        int aux = miModelo.subirVelocidad(matricula,v);
        miVista.muestraVelocidad(matricula,aux);
    }


}