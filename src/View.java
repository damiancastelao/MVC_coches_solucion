public class View {
    /**
     * Constructor crear ventana
     */
    public static void View() {
        InterfazGrafica.crearVentana();
    }

    /**
     * Muestra la velocidad de un coche
     * @param matricula del coche
     * @param v velocidad a mostrar
     * @return true cuando es correcto
     */
    public static boolean muestraVelocidad(String matricula, Integer v) {
        String mensaje = "Coche " + matricula + " velocidad: " + v + "km/h";
        System.out.println(mensaje);
        Dialogo.main(mensaje);
        return true;
    }
}
