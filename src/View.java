public class View {
    void muestraVelocidad(String matricula, Integer v){
        Dialog.vDialogo("El coche " + matricula + " tiene una velocidad de: " + v + "km/h");
    }
   //
    public void muestraDatosCoche(Coche coche) {
        Dialog.vDialog("Coche:  " + coche.modelo + " con la matricula: " + coche.matricula + " tiene una velocidad de: " + coche.velocidad);
    }

}