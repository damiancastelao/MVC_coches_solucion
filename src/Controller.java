public class Controller {
    static Model miModelo;
    static View miVista;

    public static void main(String[] args) {
        miModelo = new Model();
        miVista = new View();

        // Crear tres coches

       /* miModelo.crearCoche("LaFerrari", "SBC 1234");
        miModelo.crearCoche("Alpine", "HYU 4567");
        miModelo.crearCoche("Aston Martin", "FGH 3333");*/
       // miModelo.bajarVelocidad("SBC 1234",30);
     //   miModelo.subirVelocidad("HYU 4567",130);

        //Coche ferrari = miModelo.getCoche("SBC 1234");
        // modifica la velocidad
        // miModelo.cambiarVelocidad("SBC 1234", 30);

        // recoje la velocidad y la muestra (tarea de la View)
        // boolean hecho = miVista.mostrarVelocidad("SBC 1234", miModelo.getVelocidad("SBC 1234"));

        // System.out.println(hecho);

    }

    /**
     *
     * @param modelo
     * @param matricula
     */

    public void crearCoche(String modelo, String matricula) {
        Coche aux = miModelo.crearCoche(modelo, matricula);
        if (aux != null) miVista.mostrarVelocidad(aux.matricula, aux.velocidad);
        // TODO mandar mensaje de error si no fue posible crear el coche
    }
}
