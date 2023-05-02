public class View {
    public View() {
        // creamos la ventana
        Iu.crearVentana();
    }



    /**
     * agregamos varios atributos para poder çonstruir un builder
     * @param matricula del coche
     * @param  modelo que queremos mostrar
     * @param aireAcondicionado  que utilizamos un booleano
     * @param numeroDePuertas del coche
     * @param  tapizadoDeCuero del asiento del coche
     * @return true si todo bien
     */

    boolean mostrarCoche(String modelo, String matricula,boolean aireAcondicionado, int numeroDePuertas, boolean tapizadoDeCuero) {
        String mensaje = "Modelo : " + modelo + "\n\nCon matricula: " + matricula  + "\n\nAire Acondicionado: " + aireAcondicionado + "\n\nNumero de puertas : " +numeroDePuertas+ "\n\nTapizado de cuero: "  + tapizadoDeCuero ;
        System.out.println(mensaje);
        Dialogo.mostrarMensaje(mensaje);
        return true;
    }
}




