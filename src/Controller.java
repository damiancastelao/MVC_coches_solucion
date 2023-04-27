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
        miModelo.subirVelocidad("FGH 3333", 30);
        miModelo.bajarVelocidad("FGH 3333", 20);

        // recoje la velocidad y la muestra (tarea de la View)
        boolean hecho = miVista.muestraVelocidad("FGH 3333", miModelo.getVelocidad("FGH 3333"));

        System.out.println(hecho);
    }
}