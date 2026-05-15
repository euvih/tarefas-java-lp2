import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro do Carro ===");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ano de fabricação: ");
        int ano = scanner.nextInt();

        System.out.print("Velocidade inicial: ");
        int velocidade = scanner.nextInt();
        scanner.nextLine();

        Carro carro = new Carro(marca, modelo, ano, velocidade);

        int opcao;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Exibir informações");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para acelerar (km/h): ");
                    carro.acelerar(scanner.nextInt());
                    carro.exibirInformacoes();
                    break;

                case 2:
                    System.out.print("Valor para frear (km/h): ");
                    carro.frear(scanner.nextInt());
                    carro.exibirInformacoes();
                    break;

                case 3:
                    carro.exibirInformacoes();
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