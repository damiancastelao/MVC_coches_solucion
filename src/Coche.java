public class Coche {
    String matricula;
    String modelo;
    int  velocidad;
     boolean aireAcondicionado;
     int numeroDePuertas;
     boolean tapizadoDeCuero;
    public Coche(String modelo, String matricula,boolean aireAcondicionado, boolean tapizadoDeCuero,int numeroDePuertas) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = velocidad;
        this.numeroDePuertas = numeroDePuertas;
        this.tapizadoDeCuero = tapizadoDeCuero;
        this.aireAcondicionado = aireAcondicionado;

    }
    public Coche() {
        this.velocidad = 0;


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
    }


}