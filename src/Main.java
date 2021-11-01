import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Leitura tc = new Leitura();

            Scanner ler = new Scanner(System.in);
            System.out.println("Para utilizar a primeira parte do programa digite:\n1 para utilizar o Scanner");
            int escolhaFormaUsar = ler.nextInt();

            if(escolhaFormaUsar == 1){
                tc.lerString();
                tc.lerFloat();
                tc.lerDouble();
                tc.lerInt();
                tc.lerChar();
                tc.validarTelefone();
                tc.converterData();
                tc.isDateValid();
                tc.isNumericalDigit();
                tc.isValidEmailAddressRegex();


            }else{
                System.out.println("Você não digitou um valor válido.\n");
            }

        }
}
