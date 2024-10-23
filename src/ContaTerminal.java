import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("Olá, seja bem-vindo(a)!");

        System.out.println("Insira o número da sua agência:");
        Scanner sc = new Scanner(System.in);
        int numeroAgencia = sc.nextInt();

        System.out.println("Insira o número da sua conta:");
        int numeroConta = sc.nextInt();

        System.out.println("Insira o nome do cliente:");
        String nomeCliente = sc.next();

        System.out.println("Insira o saldo do cliente:");
        double saldoCliente  = sc.nextDouble();

        sc.close();

        System.out.println("Obrigado, " + nomeCliente + ", por criar uma conta no nosso banco. Sua agência é: "
                + numeroAgencia + ", Conta " + numeroConta + ", e seu saldo de " + saldoCliente + " já se encontra disponível para saque!");
    }
}
