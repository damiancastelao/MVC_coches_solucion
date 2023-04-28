public class View {
    public View() {
        // creamos la ventana
        Iu.crearVentana();
    }
    // creamos la ventana


    /*boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }*/


    /**
     * Muestra la velocidad
     *
     * @param matricula del coche
     * @param v         velocidad que ueremos mostrar
     * @return true si todo bien
     */
    boolean mostrarVelocidad(String matricula, Integer v) {
        String mensaje = "Coche " + matricula + " velocidad: " + v + "km/h";
        System.out.println(mensaje);
        Dialogo.mostrarMensaje(mensaje);
        return true;
    }
}




