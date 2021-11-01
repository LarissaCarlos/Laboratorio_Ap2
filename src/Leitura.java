import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Leitura {
    Scanner ler = new Scanner(System.in);

    //le e retorna o valor
    public String lerString(){
        System.out.println("Digite uma string: ");
        String str = ler.next();
        System.out.println("String: " + str);
        return str;
    }

    public float lerFloat(){
        System.out.println("\nDigite um float: ");
        float numFloat = ler.nextFloat();
        System.out.println("Float: " + numFloat);
        return numFloat;
    }

    public double lerDouble(){
        System.out.println("\nDigite um double: ");
        double numDouble = ler.nextDouble();
        System.out.println("Double: " + numDouble);
        return numDouble;
    }

    public int lerInt(){
        System.out.println("\nDigite um inteiro: ");
        int numInt = ler.nextInt();
        System.out.println("Inteiro: " + numInt);
        return numInt;
    }


    public char lerChar(){
        System.out.println("\nDigite um Char: ");
        char caracterChar = ler.next().charAt(0);
        System.out.println("Char: " + caracterChar);
        return caracterChar;
    }


    public void isValidEmailAddressRegex() {
        // Inicia a variavel como falsa
        // Faço um if verificando se ele é diferente de null e se o tamanho dele é maior que 0
        System.out.println("\nDigite um E-mail:");
        String str = ler.next();
        if (str != null && str.length() > 0) {
            // Criei um REGEX para validar email
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            // Aqui eu verifico se o email e valido e faço o if e o else se der verdadeiro ele vai
            // retornar true se no false e retorno o valor no final
            Matcher matcher = pattern.matcher(str);

            if (matcher.matches()) {
                System.out.println("E-mail Válido");
                System.out.println(str);
            } else {
                System.out.println("E-mail Inválido");
            }
        }
    }

    //Validar se o valor digitado é um número de telefone
    public boolean validarTelefone(){
        System.out.println("\nDigite número de telefone (DDD-XXXXXXXXX):");
        String telefone = ler.next();

        if(telefone.length() == 13){
            if(telefone.charAt(3)=='-'){
                System.out.println("Telefone validado " + telefone);
                return true;
            } else{
                System.out.println("Telefone Inválido");
                return false;
            }
        }else{
            System.out.println("Telefone Inválido");
            return false;
        }
    }

    public void isDateValid() {
        System.out.println("\nDigite uma data:");
        String str = ler.next();
        String dateFormat = "dd/MM/uuuu";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofPattern(dateFormat)
                .withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate date = LocalDate.parse(str, dateTimeFormatter);
            System.out.println("Data Válida");
            System.out.println(str);
        } catch (DateTimeParseException e) {
            System.out.println("Data Inválida");
        }
    }

    //converter data de formato dd/mm/aaaa para o formato mm/dd/aaaa
    public int converterData(){
        System.out.println("\nDigite uma data ");
        String data = ler.next();

        if(data.length() == 10){
            if(data.charAt(2)=='/' && data.charAt(5)=='/'){
                int dia = Integer.parseInt(data.substring(0,2));
                int mes = Integer.parseInt(data.substring(3,5));
                int ano = Integer.parseInt(data.substring(6,10));
                System.out.println("Data formatada: " + mes + "/" + dia + "/" + ano);
            }
        }else{
            System.out.println("Data inválida");
        }
        return 0;
    }

    public void isNumericalDigit(){
        System.out.println("\nDigite um valor:");
        String str = ler.next();
        if(str.matches("[0-9]*")){
            System.out.println("É um digito numerico");
        } else {
            System.out.println("Não é um digito numerico");
        }
    }
}
