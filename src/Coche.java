import java.util.Observable;

public class Coche extends Observable {
    private String matricula;
    private String modelo;
    private Integer velocidad;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
        setChanged();
        notifyObservers();
    }
}
