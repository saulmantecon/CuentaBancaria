package model;

public class CuentaAhorro extends CuentaBancaria {
    float remuneracion;
    float interes;

    public CuentaAhorro(Persona titular, double saldo, String IBAN, float remuneracion, float interes) {
        super(titular, saldo, IBAN);
        this.remuneracion = remuneracion;
        this.interes = interes;
    }

    public CuentaAhorro(Persona titular, double saldo, String IBAN, float interes) {
        super(titular, saldo, IBAN);
        this.interes = interes;
    }

    public float getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(float remuneracion) {
        this.remuneracion = remuneracion;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "CuentaAhorro:" +
                " titular=" + titular +
                ", saldo=" + saldo +
                ", IBAN='" + IBAN + '\'';
    }
}
