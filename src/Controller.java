import java.lang.module.ModuleDescriptor;

public class Controller {
    static Model miModelo = new Model();
    static View miVista = new View();
    public static void main(String[] args) {
        IU.crearVentana();
    }
    public static void crearCoche(String modelo, String matricula){
        Coche aux = miModelo.crearCoche(modelo,matricula);
        if(aux!=null){
            miVista.muestraVelocidad(aux.matricula, aux.velocidad);
        }
    }
// implementamos el nuevo método buscar coche
    public static void buscarCoche(String criterio) {
        Coche cocheEncontrado = miModelo.buscarCoche(criterio);
        if (cocheEncontrado != null) {
            miVista.muestraDatosCoche(cocheEncontrado);
        } else {
            miVista.mostrarMensaje("No se encontró ningún coche con el criterio de búsqueda.");
        }
    }

    public static void bajarVelocidad(String matricula){
        int aux = miModelo.bajarVelocidad(matricula);
        miVista.muestraVelocidad(matricula, aux);
    }

    public static void aumentarVelocidad(String matricula){
        int aux = miModelo.subirVelocidad(matricula);
        miVista.muestraVelocidad(matricula,aux);
    }
}