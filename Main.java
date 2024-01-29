import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Tarefas> listaDeTarefa = new ArrayList();

        while(true) {
            while(true) {
                int op = MenuManager.exibirMenu(entrada);
                if (op == 1) {
                    TarefaManager.adicionarTarefa(listaDeTarefa, entrada);
                } else if (op == 2) {
                    TarefaManager.listarTarefas(listaDeTarefa);
                } else if (op == 3) {
                    TarefaManager.gerenciarTarefa(listaDeTarefa, entrada);
                } else if (op == 4) {
                    System.out.println("Obrigado por usar nossa Lista de Tarefas");
                    return;
                }
            }
        }
    }
}