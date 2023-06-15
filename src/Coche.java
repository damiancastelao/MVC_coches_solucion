public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;

    /**
     * Constructor de la clase Coche que inicializa el modelo y la matrícula del coche, con velocidad por defecto (0).
     * @param modelo -> modelo del coche
     * @param matricula -> matrícula del coche
     */
    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
    }
}