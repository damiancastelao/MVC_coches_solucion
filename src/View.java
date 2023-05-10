import java.awt.*;

public class View {

    public View(){
        // creamos la ventana
    IU.crearVentana();
    }


    boolean muestraVelocidad(String matricula, Integer v){

        String mensaje = "Coche "+ matricula + ": " + v + "km/hr";
        System.out.println(mensaje);
        Dialog.mostrarMensaje(mensaje);
        return true;
    }

}
