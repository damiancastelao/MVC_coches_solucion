public class View {
    void muestraVelocidad(String matricula, Integer v){
        Dialog.msjDialog("El coche " + matricula + " tiene una velocidad de: " + v + "km/h");
    }

    void mostrarCoche(String matricula, String modelo){
        Dialog.msjDialog("El coche de este modelo:" + modelo+ " e desta matricula "+ matricula );
    }
}
    

