public class Controller {
    public static void main(String[] args) {
        View.View();
    }

    public static void crearButton(String modelo, String matricula) {
        Coche aux = Model.crearCoche(modelo, matricula);
        if (aux != null) View.muestraVelocidad(aux.matricula, aux.velocidad);
    }

    public static Integer subirButton(String matricula, Integer v) {
        Integer aux = Model.subirVelocidad(matricula, v);
        if (aux != null) View.muestraVelocidad(matricula, aux);
        return aux;
    }
    public static Integer bajarButton(String matricula, Integer v) {
        Integer aux = Model.bajarVelocidad(matricula, v);
        if (aux != null) View.muestraVelocidad(matricula, aux);
        return aux;
    }


        /*
        Model miModelo = new Model();
        View miVista = new View();

        // Crear tres coches

        miModelo.crearCoche("LaFerrari", "SBC 1234");
        miModelo.crearCoche("Alpine", "HYU 4567");
        miModelo.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = miModelo.getCoche("SBC 1234");
        // modifica la velocidad
        miModelo.cambiarVelocidad("SBC 1234", 30);
        //subir velocidad
        miModelo.subirVelocidad("SBC 1234", 30);
        //bajar velocidad
        miModelo.bajarVelocidad("SBC 1234", 10);

        // recoje la velocidad y la muestra (tarea de la View)
        boolean hecho = miVista.muestraVelocidad("SBC 1234", miModelo.getVelocidad("SBC 1234"));

        System.out.println(hecho);
        */
}