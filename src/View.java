public class View {
    void muestraVelocidad(String matricula, Integer v){
        Dialog.msjDialog("El coche " + matricula + " tiene una velocidad de: " + v + "km/h");
    }
    void mostraExceso(String matricula, Integer v){
        Dialog.msjDialog("Alerta velocidade excedida! Vai a mais de 120, esta matricula "+matricula+" vai a: "+v);
    }
}
    

