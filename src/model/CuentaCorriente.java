package model;

public abstract class CuentaCorriente extends CuentaBancaria{
    String entidades;

    public CuentaCorriente(Persona titular, double saldo, String IBAN, String entidades) {
        super(titular, saldo, IBAN);
        this.entidades = entidades;
    }

    public String getEntidades() {
        return entidades;
    }

    public void setEntidades(String entidades) {
        this.entidades = entidades;
    }


}
