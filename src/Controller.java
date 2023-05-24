import java.lang.module.ModuleDescriptor;

public class Controller {
    public static void main(String[] args) {
        Model nuevModelo = new Model();
        View nuevVista = new View();

        // Crear tres coches

        nuevModelo.crearCoche("LaFerrari", "SBC 1234");
        nuevModelo.crearCoche("Alpine", "HYU 4567");
        nuevModelo.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = nuevModelo.getCoche("SBC 1234");

        // modifica la velocidad
        nuevModelo.cambiarVelocidad("SBC 1234", 20);
        // recoje la velocidad y la muestra (tarea de la View)
        boolean hecho = nuevVista.muestraVelocidad("SBC 1234", nuevModelo.getVelocidad("SBC 1234"));
        System.out.println(hecho);

        // sube la velocidad
        nuevModelo.subirVelocidad("SBC 1234", 200);
        // recoje la velocidad y la muestra (tarea de la View)
        hecho = nuevVista.muestraVelocidad("SBC 1234", nuevModelo.getVelocidad("SBC 1234"));
        System.out.println(hecho);

        // baja la velocidad
        nuevModelo.bajarVelocidad("SBC 1234", 80);
        // recoje la velocidad y la muestr (tarea de la View)
        hecho = nuevVista.muestraVelocidad("SBC 1234", nuevModelo.getVelocidad("SBC 1234"));
        System.out.println(hecho);
    }
}