package model;

public class CuentaCorrienteEmpresa extends CuentaCorriente {
    float interesPorDescubierto;
    float maximoDescubiertoPermitido;

    public CuentaCorrienteEmpresa(Persona titular, double saldo, String IBAN, String entidades, float interesPorDescubierto, float maximoDescubiertoPermitido) {
        super(titular, saldo, IBAN, entidades);
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

    @Override
    public String toString() {
        return "CuentaCorrienteEmpresa{" +
                "maximoDescubiertoPermitido=" + maximoDescubiertoPermitido +
                ", entidades='" + entidades + '\'' +
                ", interesPorDescubierto=" + interesPorDescubierto +
                ", titular=" + titular +
                ", saldo=" + saldo +
                ", IBAN='" + IBAN + '\'' +
                '}';
    }
}


