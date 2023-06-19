import java.util.ArrayList;
import java.util.List;
import java.util.Observer; // Importar Observer de java.util

public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;
    private List<Observer> observers;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
        this.observers = new ArrayList<>();
    }

    public void subirVelocidad(Integer v) {
        velocidad += v;
        notifyObservers();
    }

    public void bajarVelocidad(Integer v) {
        if (velocidad >= v) {
            velocidad -= v;
        } else {
            velocidad = 0;
        }
        notifyObservers();
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(null, this); // El primer parámetro es null porque no se utiliza en este ejemplo
        }
    }
}
