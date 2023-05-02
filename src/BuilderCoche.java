public class BuilderCoche {
    /**
     * Construimos coche con builder
     */
    private Coche _coche;

    public BuilderCoche() {
        _coche = new Coche();
    }


    public BuilderCoche setTapizadoDeCuero(boolean tapizadoDeCuero) {
        _coche.setTapizadoDeCuero(tapizadoDeCuero);
        return this;
    }
    public BuilderCoche setMatricula(String matricula) {
        _coche.setMatricula(matricula);
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

    public BuilderCoche setAireAcondicionado(boolean aireAcondicionado) {
        _coche.setAireAcondicionado(aireAcondicionado);
        return this;
    }

    /**
     * @return _coche
     */

    public Coche build() {

        return this._coche;
    }

}

