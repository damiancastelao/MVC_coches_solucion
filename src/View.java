public class View {
    void muestraVelocidad(String matricula, Integer v){
        Dialog.msjDialog("El coche " + matricula + " tiene una velocidad de: " + v + "km/h");
    }

    // creo mostrar coche para que despois me aparezco o resultado ao darlle oo boton

    void mostrarCoche(String matricula, String modelo, Integer v){
        Dialog.msjDialog("El coche de este modelo:" + modelo+ " e desta matricula "+ matricula + " y  tiene una velocidad de: " + v + "km/h");
    }
}
    

