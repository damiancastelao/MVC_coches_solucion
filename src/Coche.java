public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;

    /**
     * Constructor
     * @param modelo del coche
     * @param matricula del coche
     */
    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
    }
}
