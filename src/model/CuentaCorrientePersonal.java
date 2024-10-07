package model;

public class CuentaCorrientePersonal extends CuentaCorriente{
    float comisionMantenimiento;

    public CuentaCorrientePersonal(Persona titular, double saldo, String IBAN, String entidades, float comisionMantenimiento) {
        super(titular, saldo, IBAN, entidades);
        this.comisionMantenimiento = comisionMantenimiento;
    }

    public float getComisionMantenimiento() {
        return comisionMantenimiento;
    }

    public void setComisionMantenimiento(float comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
    }

    @Override
    public String toString() {
        return "CuentaCorrientePersonal{" +
                "comisionMantenimiento=" + comisionMantenimiento +
                ", entidades='" + entidades + '\'' +
                ", titular=" + titular +
                ", saldo=" + saldo +
                ", IBAN='" + IBAN + '\'' +
                '}';
    }
}
