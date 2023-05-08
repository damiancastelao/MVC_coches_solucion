public class Controller {
    static Model miModelo;
    static View miVista;
    public static void main(String[] args) {
        miModelo = new Model();
        miVista = new View();

        System.out.println("fin");
    }


    public static void crearCoche(String modelo,String matricula){
        Coche obx=miModelo.crearCoche(modelo,matricula);
        if (obx!=null){
            miVista.muestraVelocidad(obx.matricula, obx.velocidad);
        }
    }
}