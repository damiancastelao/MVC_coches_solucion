public class View {
    public static Iu form;

    public View() {
        // creamos la ventana
        form = Iu.crearVentana();
    }


    /**
     * agregamos varios atributos para poder çonstruir un builder
     * @param matricula del coche
     * @param  modelo que queremos mostrar
     * @param aireAcondicionado  que utilizamos un booleano
     * @param numeroDePuertas del coche
     * @param  tapizadoDeCuero del asiento del coche
     * @param velocidad del coche
     * @return true si todo bien
     */

    static boolean mostrarCoche(String modelo, String matricula, boolean aireAcondicionado, boolean tapizadoDeCuero, int numeroDePuertas, int velocidad) {

        String mensaje = "Modelo : " + modelo + "\nCon matricula: " + matricula  + "\nAire Acondicionado: " + aireAcondicionado + "\nNumero de puertas : " + numeroDePuertas + "\nTapizado de cuero: "
                + tapizadoDeCuero +"\nLA velocidad es :"+ velocidad;

        System.out.println(mensaje);
        form.textFieldVelocidad.setText(String.valueOf(velocidad));
        Dialogo.mostrarMensaje(mensaje);

        return true;
    }
    /**
     * Comprueba si un vehículo está excediendo la velocidad límite y muestra un mensaje de alerta.
     *
     * @param matricula  la matrícula del vehículo.
     * @param velocidad  la velocidad actual del vehículo en kilómetros por hora.
     * @return true si se genera una alerta de exceso de velocidad, false en caso contrario.
     */
    static boolean excessoVelocidad( String matricula,int velocidad) {

        String mensajeVelocidad =  "Alerta el  coche con la  matricula: " + matricula  + " ! Va a una  velociad excedida ! "  +  velocidad + " Km/hr ";

        System.out.println(mensajeVelocidad);
        form.textFieldVelocidad.setText(String.valueOf(velocidad));
        Dialogo.mostrarMensaje(mensajeVelocidad);
        return true;
    }

}




