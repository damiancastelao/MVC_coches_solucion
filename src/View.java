public class View {

    public static void View(){
        GUI.createUIComponents();
    }

    /**
     * Muestra velocidad del coche
     * @param matricula del coche
     * @param v velocidad del coche
     * @return true cuando es correcto
     */
    public static boolean muestraVelocidad(String matricula, Integer v){
        String mensaje = "Coche " + matricula + " velocidad: " + v + "km/hr";
        System.out.println(mensaje);
        Dialogo.main(mensaje);
        return true;
    }

    /**
     * Muestra todos los datos del coche
     * @param modelo del coche
     * @param matricula del coche
     * @param velocidad del coche
     */
    public static boolean mostrarDatos(String modelo, String matricula, Integer velocidad){
        String mensaje = "Datos del coche:\n Modelo: " + modelo + "\n" +
                "Matricula: " + matricula + "\n" + "Velocidad: " + velocidad + "km/hr";
        System.out.println(mensaje);
        Dialogo.main(mensaje);
        return true;
    }
}
