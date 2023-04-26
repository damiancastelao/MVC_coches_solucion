public class Controller {
    public static void main(String[] args) {
        Model miModelo = new Model();
        View miVista = new View();

        // Crear tres coches

        miModelo.crearCoche("LaFerrari", "SBC 1234");
        miModelo.crearCoche("Alpine", "HYU 4567");
        miModelo.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = miModelo.getCoche("SBC 1234");
        // modifica la velocidad
        miModelo.cambiarVelocidad("SBC 1234", 30);

        // recoje la velocidad y la muestra (tarea de la View)
        boolean hecho = miVista.muestraVelocidad("SBC 1234", miModelo.getVelocidad("SBC 1234"));

        System.out.println(hecho);

        // disminuye la velocidad
        miModelo.bajarVelocidad("SBC 1234", 5);
        // recoje la velocidad y la muestra
        boolean hecho_bajada = miVista.muestraVelocidad("SBC 1234", miModelo.getVelocidad("SBC 1234"));
        System.out.println(hecho_bajada);

        // aumenta la velocidad
        miModelo.subirVelocidad("SBC 1234", 3);
        // recoje la velocidad y la muestra
        boolean hecho_subida = miVista.muestraVelocidad("SBC 1234", miModelo.getVelocidad("SBC 1234"));
        System.out.println(hecho_bajada);
    }
}