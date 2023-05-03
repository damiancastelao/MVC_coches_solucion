public class Coche {
    String matricula;
    String modelo;
    int velocidad;
    boolean aireAcondicionado;
    int numeroDePuertas;
    boolean tapizadoDeCuero;

    public Coche(String modelo, String matricula, boolean aireAcondicionado, boolean tapizadoDeCuero, int numeroDePuertas, int velocidad) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.numeroDePuertas = numeroDePuertas;
        this.tapizadoDeCuero = tapizadoDeCuero;
        this.aireAcondicionado = aireAcondicionado;
        this.velocidad = velocidad;

    }

    public Coche() {


    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }


    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }


    public void setTapizadoDeCuero(boolean tapizadoDeCuero) {
        this.tapizadoDeCuero = tapizadoDeCuero;
    }

}