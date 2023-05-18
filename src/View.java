public class View {

    public void View(String mensaje){
        IU.crearVentana();
        Dialogo.ventanaDialogo(mensaje);
    }
    boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }
}
