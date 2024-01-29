import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class TarefaManager {

    public static void adicionarTarefa(List<Tarefas> listaDeTarefa, Scanner entrada) {
        System.out.println("ADICIONAR TAREFA:");
        String tarefa = entrada.nextLine();

        if (tarefa.equalsIgnoreCase("sair")) {
            return;
        }

        System.out.println("Status:");
        String status = entrada.nextLine();

        Tarefas novaTarefa = new Tarefas(tarefa, status);
        listaDeTarefa.add(novaTarefa);
    }

    public static void listarTarefas(List<Tarefas> listaDeTarefa) {
        System.out.println("TAREFAS ADICIONADAS NA LISTA:\n");

        if (listaDeTarefa.isEmpty()) {
            System.out.println("Lista de Tarefas encontra-se vazia\n");
        } else {
            for (int i = 0; i < listaDeTarefa.size(); i++) {
                System.out.println((i + 1) + " - " + listaDeTarefa.get(i) + "\n");
            }
        }
    }

    public static void gerenciarTarefa(List<Tarefas> listaDeTarefa, Scanner entrada) {
        if (listaDeTarefa.size() > 0) {
            int opGerenciarTarefa = MenuManager.exibirGerenciaTarefaMenu(entrada);

            if (opGerenciarTarefa == 1) {
                System.out.println("\nTarefas que encontram-se na lista: ");
                for (int i = 0; i < listaDeTarefa.size(); i++) {
                    System.out.println((i + 1) + " - " + listaDeTarefa.get(i) + "\n");
                }
                System.out.println("\nEscolha o numero da tarefa que voce vai Alterar: ");
                int tarefaEscolhida = Integer.valueOf(entrada.nextLine());

                System.out.println("\nEscolha o novo Status");
                String novoStatus = entrada.nextLine();
                listaDeTarefa.get(tarefaEscolhida - 1).setStatus(novoStatus);
            } else if (opGerenciarTarefa == 2) {
                System.out.println("\nTarefas que encontram-se na lista: ");
                for (int i = 0; i < listaDeTarefa.size(); i++) {
                    System.out.println((i + 1) + " - " + listaDeTarefa.get(i) + "\n");
                }
                System.out.println("\nEscolha o numero da tarefa que voce vai Excluir: ");
                int tarefaEscolhida = Integer.valueOf(entrada.nextLine());

                listaDeTarefa.remove(tarefaEscolhida - 1);
            }
        } else {
            System.out.println("Lista de tarefas se encontra vazia\n");
        }
    }
}