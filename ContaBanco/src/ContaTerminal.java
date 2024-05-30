import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String codigoAgencia, nomeCliente;
        double saldo;
        Scanner scan = new Scanner(System.in).useLocale(Locale.US); 

        System.out.println("Iniciando a classe ContaTerminal");
        System.out.println("-----------------------------------");

        System.out.println("Por favor, digite o seu nome:");
        nomeCliente = scan.nextLine();

        System.out.println("Por favor, insira o codigo de sua agencia");
        codigoAgencia = scan.nextLine();

        System.out.println("Por favor, insira o numero da sua conta");
        numeroConta = scan.nextInt();

        System.out.println("Por favor, insira o saldo disponivel na conta");
        saldo = scan.nextDouble();

        System.out.println("Olá, "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+codigoAgencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
