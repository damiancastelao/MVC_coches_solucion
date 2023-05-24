public class Controller {
    public static void main(String[] args) {

        // Crear tres coches
        Model.crearCoche("LaFerrari", "SBC 1234");
        Model.crearCoche("Alpine", "HYU 4567");
        Model.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = Model.getCoche("SBC 1234");
        // subir la velocidad en 30 unidades
        ferrari.subirVelocidad(30);

        // muestra la velocidad y los datos del coche (tarea de la View)
        boolean hecho = View.muestraCoche(ferrari);

        System.out.println(hecho);
    }
}
