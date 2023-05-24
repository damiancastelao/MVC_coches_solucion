import java.lang.module.ModuleDescriptor;

public class Controller {
    public static void main(String[] args) {

        // Crear tres coches

        Model.crearCoche("LaFerrari", "SBC 1234");
        Model.crearCoche("Alpine", "HYU 4567");
        Model.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = Model.getCoche("SBC 1234");
        // modifica la velocidad
        Model.cambiarVelocidad("SBC 1234", 30);

        // subir la velocidad
        miModelo.subirVelocidad("SBC 1234", 100);

        // bajar la velocidad
        miModelo.bajarVelocidad("SBC 1234", 50);

        // recoje la velocidad y la muestra (tarea de la View)
        boolean hecho = View.muestraVelocidad("SBC 1234", Model.getVelocidad("SBC 1234"));

        System.out.println(hecho);
    }
}