public class Controller {
    public static void main(String[] args) {
        Model myModel = new Model();
        View myView = new View();

        // Crear tres coches
        myModel.crearCoche("LaFerrari", "SBC 1234");
        myModel.crearCoche("Alpine", "HYU 4567");
        myModel.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = myModel.getCoche("SBC 1234");

        // Modificar la velocidad
        myModel.cambiarVelocidad("SBC 1234", 30);

        // Recoger velocidad y mostrarla (view)
        boolean hecho = myView.muestraVelocidad("SBC 1234", myModel.getVelocidad("SBC 1234"));
        System.out.println(hecho);

        // Aumentar velocidad
        myModel.subirVelocidad("SBC 1234", 100);

        // Recoger velocidad y mostrarla (view)
        hecho = myView.muestraVelocidad("SBC 1234", myModel.getVelocidad("SBC 1234"));
        System.out.println(hecho);

        // Disminuir velocidad
        myModel.bajarVelocidad("SBC 1234", 50);

        // Recoger velocidad y mostrarla (view)
        hecho = myView.muestraVelocidad("SBC 1234", myModel.getVelocidad("SBC 1234"));
        System.out.println(hecho);
    }
}
