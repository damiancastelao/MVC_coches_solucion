public class View {
    static boolean muestraCoche(Coche coche) {
        if (coche != null) {
            System.out.println("Matrícula: " + coche.matricula);
            System.out.println("Modelo: " + coche.modelo);
            System.out.println("Velocidad: " + coche.getVelocidad() + "km/hr");
            return true;
        } else {
            System.out.println("Coche no encontrado");
            return false;
        }
    }
}
