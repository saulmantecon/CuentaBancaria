package model;

import java.util.ArrayList;
import java.util.Objects;

public class Banco {

    static ArrayList<CuentaBancaria> listadoDeCuentas = new ArrayList<>();

    public static boolean abrirCuenta(CuentaBancaria cuentaBancaria){
        if (listadoDeCuentas.contains(cuentaBancaria)){
            return false;
        }else {
            listadoDeCuentas.add(cuentaBancaria);
            return true;
        }
    }//abrirCuenta

    public static ArrayList<CuentaBancaria> listarCuentas(){
        return listadoDeCuentas;//
    }//listarCuentas

    public static String informacionCuenta (String IBAN){
        for (CuentaBancaria c : listadoDeCuentas){
            if (Objects.equals(c.getIBAN(), IBAN)){
                return c.getIBAN()+ " " + c.getTitular() + " "+ c.getSaldo();
            }
        }
        return null;
    }//informacionCuenta

    public static boolean ingresoCuenta(String IBAN, double cantidad){
        for (CuentaBancaria c : listadoDeCuentas){
            if (Objects.equals(c.getIBAN(), IBAN)){
                c.setSaldo(c.getSaldo()+cantidad); //cambiamos el saldo en la cuenta que decimos (IBAN)
                return true;
            }
        }
        return false; // si no entra en el if quiere decir que no se modificó el saldo
    }//ingresoCuenta

    public static boolean retiradaCuenta(String IBAN, double cantidad){
        double saldo = obtenerSaldo(IBAN);
        for (CuentaBancaria c : listadoDeCuentas){
            if (Objects.equals(c.getIBAN(), IBAN)){
                if (saldo>cantidad){
                    c.setSaldo(saldo-cantidad); //cambiamos el saldo en la cuenta que decimos (IBAN)
                    return true;
                }
            }
        }
        return false;
    }//retiradaCuenta

    public static double obtenerSaldo(String IBAN){
        for (CuentaBancaria c : listadoDeCuentas) {
            if (Objects.equals(c.getIBAN(), IBAN)) {
                return c.getSaldo();
            }
        }
        return -1; // si no encuentra la cuenta devolverá -1
    }//ObtenerSaldo
}
