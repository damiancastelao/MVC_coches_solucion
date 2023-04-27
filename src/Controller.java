public class Controller {
    public static void main(String[] args) {
        Model miModelo = new Model();
        View miVista = new View();

        // Crear tres coches

        miModelo.crearCoche("Ferrari", "SBC 1234");
        miModelo.crearCoche("Alpine", "HYU 4567");
        miModelo.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = miModelo.getCoche("SBC 1234");
        // se establece una velocidad inicial de 50 km/h
        miModelo.setVelocidad("SBC 1234", 50);
        //se aumenta esa velocidad en 40km/h
        miModelo.subirVelocidad("SBC 1234", 40);
        //se aumenta esa velocidad en 40km/h
        miModelo.bajarVelocidad("SBC 1234",10);

        // recoje la velocidad y la muestra (tarea de la View)
        boolean hecho = miVista.muestraVelocidad("SBC 1234", miModelo.getVelocidad("SBC 1234"));

        System.out.println(hecho);
    }
}