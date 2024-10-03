import model.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
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
                    System.out.println("DNI:");
                    String DNI = scanner.next();
                    Persona persona = new Persona(nombre,apellidos,DNI);
                    System.out.println("IBAN:");
                    String IBAN = scanner.next();
                    System.out.println("¿Que saldo inicial tendrás?");
                    double saldo = scanner.nextDouble();
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
                            float interesPorDescubierto= scanner.nextFloat();
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

            }//switch Opcion

        }while (opcion!=6);

    }

}