public class View {
    void muestraVelocidad(String matricula, Integer v){
        Dialog.vDialogo("El coche " + matricula + " tiene una velocidad de: " + v + "km/h");
    }
   //
    public void muestraDatosCoche(Coche coche) {
        System.out.println("Datos del coche:");
        System.out.println("Matrícula: " + coche.matricula);
        System.out.println("Modelo: " + coche.modelo);
        System.out.println("Velocidad: " + coche.velocidad + " km/h");
    }
// mostrariamos el mensaje
    public void mostrarMensaje(String s) {
    }
}