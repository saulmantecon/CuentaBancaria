package util;
import java.util.regex.Pattern;

public class validaciones {
    // Expresión regular para validar el formato general del IBAN
    private static final String IBAN_REGEX = "^[A-Z]{2}[0-9]{2}[A-Z0-9]{1,30}$";

    // Método para validar el formato del IBAN
    public static boolean validarIBAN(String iban) {
        // Eliminar espacios en blanco y convertir a mayúsculas
        iban = iban.replaceAll("\\s+", "").toUpperCase();

        // Validar el formato básico con la expresión regular
        return Pattern.matches(IBAN_REGEX, iban);
    }
        /**
         * Valida si una cadena es un DNI: 8 numeros y una letra al final
         * @param DNI String que contiene el valor a validar
         * @return True = es un DNI válido
         */
        public static boolean validaDNI_Exp (String DNI){

            return DNI.matches("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
        }


}

