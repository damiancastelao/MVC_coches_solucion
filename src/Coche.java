public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public void subirVelocidad(Integer v) {
        velocidad += v;
    }

    public void bajarVelocidad(Integer v) {
        if (velocidad >= v) {
            velocidad -= v;
        } else {
            velocidad = 0;
        }
    }

    public Integer getVelocidad() {
        return velocidad;
    }
}
