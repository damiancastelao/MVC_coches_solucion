public class BuilderCoche {
    private Coche _coche;

    public BuilderCoche() {
        _coche = new Coche();
    }


    public BuilderCoche setTapizadoDeCuero() {
        _coche.setTapizadoDeCuero(true);
        return this;
    }

    public BuilderCoche setModelo(String modelo) {
        _coche.setModelo(modelo);
        return this;
    }

    public BuilderCoche setNumeroDePuertas(int numeroDePuertas) {
        _coche.setNumeroDePuertas(numeroDePuertas);
        return this;
    }

    public BuilderCoche setAireAcondicionado() {
        _coche.setAireAcondicionado(true);
        return this;
    }

    public Coche build() {

        return this._coche;
    }

}

