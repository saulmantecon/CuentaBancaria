package model;

public abstract class CuentaCorriente extends CuentaBancaria{
    String entidades;
    float reciboDomiciliado;

    public CuentaCorriente(Persona titular, double saldo, String IBAN, String entidades, float reciboDomiciliado) {
        super(titular, saldo, IBAN);
        this.entidades = entidades;
        this.reciboDomiciliado = reciboDomiciliado;
    }

    public String getEntidades() {
        return entidades;
    }

    public void setEntidades(String entidades) {
        this.entidades = entidades;
    }

    public float getReciboDomiciliado() {
        return reciboDomiciliado;
    }

    public void setReciboDomiciliado(float reciboDomiciliado) {
        this.reciboDomiciliado = reciboDomiciliado;
    }
}
