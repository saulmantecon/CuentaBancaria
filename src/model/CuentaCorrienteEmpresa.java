package model;

public class CuentaCorrienteEmpresa {
    float interesPorDescubierto;
    float maximoDescubiertoPermitido;

    public CuentaCorrienteEmpresa(float interesPorDescubierto, float maximoDescubiertoPermitido) {
        this.interesPorDescubierto = interesPorDescubierto;
        this.maximoDescubiertoPermitido = maximoDescubiertoPermitido;
    }

    public float getInteresPorDescubierto() {
        return interesPorDescubierto;
    }

    public void setInteresPorDescubierto(float interesPorDescubierto) {
        this.interesPorDescubierto = interesPorDescubierto;
    }

    public float getMaximoDescubiertoPermitido() {
        return maximoDescubiertoPermitido;
    }

    public void setMaximoDescubiertoPermitido(float maximoDescubiertoPermitido) {
        this.maximoDescubiertoPermitido = maximoDescubiertoPermitido;
    }
}


