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
        miModelo.aumentaVelocidad("SBC 1234", 50);
        miModelo.reducirVelocidad("SBC 1234", 90);

        // recoje la velocidad y la muestra (tarea de la View)
        boolean hecho = miVista.muestraVelocidad("SBC 1234", miModelo.getVelocidad("SBC 1234"));

        System.out.println(hecho);
    }
}