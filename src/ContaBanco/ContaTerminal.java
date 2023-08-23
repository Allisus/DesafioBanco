package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        int numero;
        double saldo;
        String agencia, nomeCliente;

        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, seja bem vindo ao nosso banco!");
        System.out.println("Por favor, digite seu nome completo: ");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, Digite a sua agencia: ");
        agencia = sc.next();
        System.out.println("Agora o numero da sua conta: ");
        numero = sc.nextInt();
        System.out.println("Digite seu saldo: ");
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);


    }
}