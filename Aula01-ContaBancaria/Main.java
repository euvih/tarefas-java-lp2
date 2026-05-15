import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = null;
        int opcao;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Abrir conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Exibir informações");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do titular: ");
                    String titular = scanner.nextLine();
                    System.out.print("Número da conta: ");
                    String numero = scanner.nextLine();
                    System.out.print("Saldo inicial: ");
                    double saldoInicial = scanner.nextDouble();
                    conta = new ContaBancaria(titular, numero, saldoInicial);
                    System.out.println("Conta criada com sucesso!");
                    break;

                case 2:
                    if (conta == null) {
                        System.out.println("Abra uma conta primeiro.");
                        break;
                    }
                    System.out.print("Valor para depósito: ");
                    conta.depositar(scanner.nextDouble());
                    break;

                case 3:
                    if (conta == null) {
                        System.out.println("Abra uma conta primeiro.");
                        break;
                    }
                    System.out.print("Valor para saque: ");
                    conta.sacar(scanner.nextDouble());
                    break;

                case 4:
                    if (conta == null) {
                        System.out.println("Abra uma conta primeiro.");
                        break;
                    }
                    conta.exibirInformacoes();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}