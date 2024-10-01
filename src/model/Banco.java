package model;

import java.util.ArrayList;

public class Banco {
    public boolean abrirCuenta(CuentaBancaria cuentaBancaria){

    return true;//hay q cambiarlo
    }

    public ArrayList<CuentaBancaria> listadoCuentas(){
        return listadoCuentas();//hay q cambiarlo
    }

    public void informacionCuenta (String IBAN){

    }

    public boolean ingresoCuenta(String IBAN, double cantidad){

        return true;//hay q cambiarlo
    }

    public boolean retiradaCuenta(String IBAN, double cantidad){
        return true; //hay q cambiarlo
    }

    public int obtenerSaldo(String IBAN){
        return -1;//hay q cambiarlo
    }
}
