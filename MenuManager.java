import java.util.Scanner;
class MenuManager {

    public static int exibirMenu(Scanner entrada) {
        System.out.println("\nOPÇÕES: ");
        System.out.println("[1] Adicionar Tarefa ");
        System.out.println("[2] Pesquisar Tarefa ");
        System.out.println("[3] Gerir Tarefa");
        System.out.println("[4] Sair\n");
        System.out.println("ESCOLHA UMA OPÇÃO:");

        return Integer.valueOf(entrada.nextLine());
    }

    public static int exibirGerenciaTarefaMenu(Scanner entrada) {
        System.out.println("\nOPÇÕES: ");
        System.out.println("[1] MODIFICAR STATUS ");
        System.out.println("[2] EXCLUIR TAREFA ");
        System.out.println("[3] Sair");
        System.out.println("ESCOLHA UMA OPÇÃO:");

        return Integer.valueOf(entrada.nextLine());
    }
}