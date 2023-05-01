public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;
     boolean aireAcondicionado;
     int numeroDePuertas;
     boolean tapizadoDeCuero;
    public Coche(String modelo, String matricula,boolean aireAcondicionado, int numeroDePuertas, boolean tapizadoDeCuero) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
        this.aireAcondicionado = aireAcondicionado;
        this.numeroDePuertas = numeroDePuertas;
        this.tapizadoDeCuero = tapizadoDeCuero;

    }
    public Coche() {
        numeroDePuertas = 4;
        matricula = "325295BC";
        aireAcondicionado = true;
        modelo = null;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public boolean isTapizadoDeCuero() {
        return tapizadoDeCuero;
    }

    public void setTapizadoDeCuero(boolean tapizadoDeCuero) {
        this.tapizadoDeCuero = tapizadoDeCuero;
    }@Override
    public String toString() {
        return

                        " aireAcondicionado = " + aireAcondicionado + "\n" +
                        " numeroDePuertas = " + numeroDePuertas + "\n" +
                        " tapizadoDeCuero = " + tapizadoDeCuero + "\n" +
                        " matricula = " + matricula + "\n" +
                        " velocidad = " + velocidad + "\n" +
                        " fabricar = " + modelo + "\n";

    }
}