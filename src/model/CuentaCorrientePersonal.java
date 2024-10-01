package model;

public class CuentaCorrientePersonal extends CuentaCorriente{
    float comisionMantenimiento;

    public CuentaCorrientePersonal(Persona titular, double saldo, String IBAN, String entidades, float reciboDomiciliado, float comisionMantenimiento) {
        super(titular, saldo, IBAN, entidades, reciboDomiciliado);
        this.comisionMantenimiento = comisionMantenimiento;
    }

    public float getComisionMantenimiento() {
        return comisionMantenimiento;
    }

    public void setComisionMantenimiento(float comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
    }

}
