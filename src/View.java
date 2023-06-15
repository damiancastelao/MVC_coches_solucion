public class View {
    /**
     * Método ver velocidad actual del coche
     * @param matricula -> matricula que tiene el coche
     * @param v -> velocidad que tiene el coche
     */
    void muestraVelocidad(String matricula, Integer v){
        Dialog.vDialogo("El coche " + matricula + " tiene una velocidad de: " + v + "km/h");
    }

    /**
     * Método verCoche que muestra los detalles del coche si existe, o muestra un mensaje indicando que el coche no existe.
     * @param aux -> objeto auxiliar de tipo Coche
     * @param matricula -> matrícula del coche (en caso de que no exista)
     */
    void muestraCoche(Coche aux, String matricula){
        if(aux==null){
            Dialog.vDialogo("No existe el coche con la matrícula: " + matricula);
        }
        else{
            Dialog.vDialogo("El " + aux.modelo + " con la matrícula: " + aux.matricula + " tiene una velocidad de: " + aux.velocidad +"km/h");
        }
    }
}