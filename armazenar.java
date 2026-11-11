
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[][] filmes = new String[10][3];

        int quantidade = 0;
        int opcao;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Listar filmes");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opcao: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {

                case 1:
                    if (quantidade < 10) {

                        System.out.println("\n--- CADASTRO DE FILME ---");

                        System.out.print("Nome do filme: ");
                        filmes[quantidade][0] = entrada.nextLine();

                        System.out.print("Genero: ");
                        filmes[quantidade][1] = entrada.nextLine();

                        System.out.print("Ano de lancamento: ");
                        filmes[quantidade][2] = entrada.nextLine();

                        quantidade++;

                        System.out.println("Filme cadastrado com sucesso!");

                    } else {
                        System.out.println("Limite de 10 filmes atingido!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE FILMES ---");

                    if (quantidade == 0) {
                        System.out.println("Nenhum filme cadastrado.");
                    } else {

                        for (int i = 0; i < quantidade; i++) {

                            System.out.println("\nFilme " + (i + 1));
                            System.out.println("Nome: " + filmes[i][0]);
                            System.out.println("Genero: " + filmes[i][1]);
                            System.out.println("Ano: " + filmes[i][2]);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

        } while (opcao != 0);

        entrada.close();
    }
}
