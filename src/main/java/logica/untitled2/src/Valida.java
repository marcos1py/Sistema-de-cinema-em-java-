package logica.untitled2.src;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Valida {
    public static boolean verificaValorReais(String valor) {
        String padrao = "^\\d+(,\\d{2})?$";
        Pattern pattern = Pattern.compile(padrao);
        Matcher matcher = pattern.matcher(valor);
        return matcher.matches();
    }
    public static boolean verificaNumeroInteiro(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {

    }
}