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

            }

        }while (opcion!=6);

    }

}