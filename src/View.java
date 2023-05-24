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

    /**
     * Metodo que mostrara el coche pasandole como dato la matricula de este y la velocidad
     * @param matricula matricula del coche
     * @param v velocidad a la qe va el coche
     * @return retorna el coche
     */
    boolean muestraCoche(String matricula,Integer v){
        String mensaje = "Coche "+ matricula + ": " + v + "km/hr";
        Dialog.mostrarMensaje(mensaje);
        return true;
    }

}
