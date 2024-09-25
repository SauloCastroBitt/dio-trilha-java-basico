import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public int numero;

    public String agencia;

    public String cliente;

    public Double saldo;

    public static void main(String[] args) throws Exception {

        // TODO: Conhecer e importar a classe scanner

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        // Exibir as mensagens para o usuário

        System.out.println("Bem-vindo ao sistema de abertura de contas!");
        System.out.print("Por favor, digite o número da conta: ");

        // Obter pela scanner o valor digitado no terminal

        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem de confirmação com as informações
        System.out.printf(" Olá " + cliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();
    }
}
