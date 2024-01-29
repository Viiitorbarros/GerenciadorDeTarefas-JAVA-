import java.util.ArrayList;

public class Tarefas {

    private String tarefa;
    private String status;



    public Tarefas(String tarefas ,String status) {
        this.tarefa = tarefas;
        this.status = status;

    }


    public String getTarefas() {
        return tarefa;
    }

    public String getStatus() {
        return status;
    }

    public void setTarefas(String tarefas) {
        this.tarefa= tarefas;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return getTarefas() +" -> " + getStatus() ;
    }



}






