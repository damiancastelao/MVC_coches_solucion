import java.util.Observable;

public class Coche extends Observable {
    String matricula;
    String modelo;
    Integer velocidad;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
    }
    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
        setChanged();
        notifyObservers();
    }

}

