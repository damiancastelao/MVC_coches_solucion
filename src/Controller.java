import java.lang.module.ModuleDescriptor;

public class Controller {
    public static void main(String[] args) {
        Model nuevModelo = new Model();
        View nuevVista = new View();

        // Crear tres coches

        nuevModelo.crearCoche("LaFerrari", "SBC 1234");
        nuevModelo.crearCoche("Alpine", "HYU 4567");
        nuevModelo.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = miModelo.getCoche("SBC 1234");

        // modifica la velocidad
        miModelo.cambiarVelocidad("SBC 1234", 20);
        // recoje la velocidad y la muestra (tarea de la View)
        boolean hecho = miVista.muestraVelocidad("SBC 1234", miModelo.getVelocidad("SBC 1234"));
        System.out.println(hecho);

        // sube la velocidad
        miModelo.subirVelocidad("SBC 1234", 200);
        // recoje la velocidad y la muestra (tarea de la View)
        hecho = miVista.muestraVelocidad("SBC 1234", miModelo.getVelocidad("SBC 1234"));
        System.out.println(hecho);

        // baja la velocidad
        miModelo.bajarVelocidad("SBC 1234", 80);
        // recoje la velocidad y la muestr (tarea de la View)
        hecho = miVista.muestraVelocidad("SBC 1234", miModelo.getVelocidad("SBC 1234"));
        System.out.println(hecho);
    }
}