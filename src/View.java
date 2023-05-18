public class View {
    /**
     * Metodo con el que llamo al jframe y dialogo para crear y mostrar las ventanas     *
     */
    public void View(){
        IU.crearVentana();
        Dialogo.ventanaDialogo();
    }

    /**
     * Metodo que me muestra la velocidad al crear coche
     * @param matricula del coche
     * @param v velocidad
     * @return true
     */
    boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }
}
