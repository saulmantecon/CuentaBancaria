import model.*;
import util.*;

import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            int opcion;
            String DNI;
            String IBAN;
            double saldo;
            double ingreso;
            double retirada;
            do {
                System.out.println("1. Abrir una nueva cuenta.\n" +
                        "2. Ver un listado de las cuentas disponibles (código de cuenta, titular y saldo actual).\n" +
                        "3. Obtener los datos de una cuenta concreta. Realizar un ingreso en una cuenta.\n" +
                        "4. Retirar efectivo de una cuenta.\n" +
                        "5. Consultar el saldo actual de una cuenta.\n" +
                        "6. Salir de la aplicación.");
                opcion = scanner.nextInt();

                switch (opcion){
                    case 1:
                        System.out.println("Introduce tus datos personales: \n" +
                                "1.Nombre" );
                        String nombre = scanner.next();

                        System.out.println("2. Apellidos:");
                        String apellidos = scanner.next();

                        do {
                            System.out.println("DNI:");
                            DNI = scanner.next();
                        }while (!validaciones.validaDNI_Exp(DNI));
                        Persona persona = new Persona(nombre,apellidos,DNI);
                        do {
                            System.out.println("IBAN:");
                            IBAN = scanner.next();
                        }while (!validaciones.validarIBAN(IBAN));
                        do {
                            System.out.println("¿Que saldo inicial tendrás?");
                            saldo = scanner.nextDouble();
                        }while (saldo<0);

                        System.out.println("¿Qué tipo de cuenta desea crear? \n" +
                                "1. Cuenta de Ahorro \n" +
                                "2.Cuenta Corriente Personal \n" +
                                "3. Cuenta Corriente de Empresa");
                        int opcionCuenta = scanner.nextInt();
                        switch (opcionCuenta){
                            case 1:
                                System.out.println("Que tipo de interes tendrás?");
                                float interes= scanner.nextFloat();
                                CuentaAhorro cuentaAhorro = new CuentaAhorro(persona,saldo,IBAN,interes);
                                if (Banco.abrirCuenta(cuentaAhorro)){
                                    System.out.println("Cuenta agregada correctamente");
                                }else{
                                    System.out.println("error al crear la cuenta");
                                }
                                break;
                            case 2:
                                System.out.println("Que entidades están autorizadas para cobrar recibos de la cuenta?");
                                String entidades = scanner.next();
                                System.out.println("Cual será la comision de mantenimiento?");
                                float comisionMantenimiento = scanner.nextFloat();
                                CuentaCorrientePersonal cuentaCorrientePersonal = new CuentaCorrientePersonal(persona,saldo,IBAN,entidades,comisionMantenimiento);
                                if (Banco.abrirCuenta(cuentaCorrientePersonal)){
                                    System.out.println("Cuenta agregada correctamente");
                                }else{
                                    System.out.println("error al crear la cuenta");
                                }
                                break;
                            case 3:
                                System.out.println("Que entidades están autorizadas para cobrar recibos de la cuenta?");
                                String entidadesEmpresa = scanner.next();
                                System.out.println("Que interes por descubierto tendrá?");
                                float interesPorDescubierto= scanner.nextFloat();
                                System.out.println("Cual será el maximo descubierto permitido?");
                                float maximoDescubiertoPermitido= scanner.nextFloat();
                                CuentaCorrienteEmpresa cuentaCorrienteEmpresa = new CuentaCorrienteEmpresa(persona,saldo,IBAN,entidadesEmpresa, interesPorDescubierto,maximoDescubiertoPermitido);
                                if (Banco.abrirCuenta(cuentaCorrienteEmpresa)){
                                    System.out.println("Cuenta agregada correctamente");
                                }else{
                                    System.out.println("error al crear la cuenta");
                                }
                                break;
                            default:
                                System.out.println("No escogiste una opcion valida");
                                break;
                        }//switchOpcionCuenta
                        break;
                    case 2:
                        System.out.println("Listado de cuentas:");
                        for (CuentaBancaria cuentaBancaria :Banco.listarCuentas()){
                            System.out.println(cuentaBancaria.toString());;//System.out.println(cuentaBancaria.getIBAN()+ " " + cuentaBancaria.getTitular() + " "+ cuentaBancaria.getSaldo() + "\n");
                        }
                        break;
                    case 3:
                        System.out.println("De que cuenta deseas obtener informacion? Introduce el IBAN:");
                        String IBANinfo = scanner.next();
                        System.out.println(Banco.informacionCuenta(IBANinfo));

                        System.out.println("Desea ingresar dinero en la cuenta?");
                        String si = scanner.next();
                        if (Objects.equals(si, "si" ) || Objects.equals(si, "SI") || Objects.equals(si, "Si")){
                            do {
                                System.out.println("Cuanto dinero desea ingresar?");
                                ingreso = scanner.nextDouble();
                            }while (ingreso<0);
                            if (Banco.ingresoCuenta(IBANinfo, ingreso)){
                                System.out.println("Ingreso realizado con exito");
                            }else {
                                System.out.println("No se realizó ningun ingreso");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Introduce el IBAN de la cuenta que deseas retirar dinero");
                        String IBANInfo = scanner.next();
                        do {
                            System.out.println("¿Cuanto dinero deseas retirar?");
                            retirada = scanner.nextDouble();
                        }while (retirada<0);

                        if (Banco.retiradaCuenta(IBANInfo,retirada)){
                            System.out.println("Retirada realizada con exito");
                        }else {
                            System.out.println("La retirada no se realizó");
                        }
                        break;
                    case 5:
                        System.out.println("Introduce el IBAN del que quieras obtener el saldo:");
                        String IBANINFO = scanner.next();
                        System.out.println("El saldo es: " + Banco.obtenerSaldo(IBANINFO));
                        break;
                    case 6:
                        System.out.println("Saliendo...");
                        System.exit(0);
                        break;
                }//switch Opcion

            }while (true);

        }catch (Exception e){
            System.out.println("Error" + e);
        }

    }



}