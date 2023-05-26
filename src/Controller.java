public class Controller {
    public static void main(String[] args) {
        Model myModel = new Model();
        View myView = new View();

        // Crear tres coches
        Coche ferrari = myModel.crearCoche("LaFerrari", "SBC 1234");
        Coche alpine = myModel.crearCoche("Alpine", "HYU 4567");
        Coche astonMartin = myModel.crearCoche("Aston Martin", "FGH 3333");

        // Crear un observer para el exceso de velocidad
        ObsExceso obsExceso = new ObsExceso();

        // Registrar el observer en los coches
        ferrari.addObserver(obsExceso);
        alpine.addObserver(obsExceso);
        astonMartin.addObserver(obsExceso);

        // Buscar un coche y mostrar sus datos, incluyendo la velocidad
        Coche cocheEncontrado = myModel.getCoche("SBC 1234");
        if (cocheEncontrado != null) {
            System.out.println("Datos del coche encontrado:");
            System.out.println("Matrícula: " + cocheEncontrado.getMatricula());
            System.out.println("Modelo: " + cocheEncontrado.getModelo());
            System.out.println("Velocidad: " + cocheEncontrado.getVelocidad() + " km/hr");
        } else {
            System.out.println("No se encontró un coche con la matrícula especificada.");
        }

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

        // Crear la ventana
        IU.crearVentana(myModel, myView);
    }
}
