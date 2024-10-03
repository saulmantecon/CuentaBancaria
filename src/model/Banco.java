package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    static ArrayList<CuentaBancaria> listadoDeCuentas = new ArrayList<>();
    public static boolean abrirCuenta(CuentaBancaria cuentaBancaria){
        if (listadoDeCuentas.contains(cuentaBancaria)){
            return false;
        }else {
            return true;
        }
    }

    public ArrayList<CuentaBancaria> listarCuentas(){
        return listadoDeCuentas;//hay q cambiarlo
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
