import java.util.Scanner;

public class AgendaTeste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            AgendaTelefonica agenda = new AgendaTelefonica();

            int opcao;

            do {
                System.out.println("\n===== AGENDA TELEFÔNICA =====");
                System.out.println("1 - Adicionar novo contato");
                System.out.println("2 - Remover contato");
                System.out.println("3 - Buscar contato pelo nome");
                System.out.println("4 - Listar todos os contatos");
                System.out.println("5 - Atualizar contato");
                System.out.println("6 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();

                        System.out.print("Telefone: ");
                        String telefone = scanner.nextLine();

                        System.out.print("Email: ");
                        String email = scanner.nextLine();

                        Contato contato = new Contato(nome, telefone, email);
                        agenda.adicionarContato(contato);
                        break;

                    case 2:
                        System.out.print("Digite o nome do contato que deseja remover: ");
                        String nomeRemover = scanner.nextLine();

                        agenda.removerContato(nomeRemover);
                        break;

                    case 3:
                        System.out.print("Digite o nome do contato que deseja buscar: ");
                        String nomeBuscar = scanner.nextLine();

                        agenda.buscarContato(nomeBuscar);
                        break;

                    case 4:
                        agenda.listarContatos();
                        break;

                    case 5:
                        System.out.print("Digite o nome do contato que deseja atualizar: ");
                        String nomeAtualizar = scanner.nextLine();

                        System.out.print("Novo telefone: ");
                        String novoTelefone = scanner.nextLine();

                        System.out.print("Novo email: ");
                        String novoEmail = scanner.nextLine();

                        agenda.atualizarContato(nomeAtualizar, novoTelefone, novoEmail);
                        break;

                    case 6:
                        System.out.println("Sistema encerrado.");
                        agenda.fecharConexao();
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

            } while (opcao != 6);

        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}