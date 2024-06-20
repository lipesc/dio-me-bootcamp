package listbasic;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

  private List<Tarefa> tarefaList;

  public ListaTarefa() {
    this.tarefaList = new ArrayList<>();
  }

  public void adionarTarefa(String descricao) {
    tarefaList.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for (Tarefa t : tarefaList) {
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        tarefasParaRemover.add(t);
      }
    }
    tarefaList.removeAll(tarefasParaRemover);
  }

  public int obterNumeroTotalTarefas() {
    return tarefaList.size();
  }

  public void obterDescricaoTotal() {
    System.out.println(tarefaList);
  }

  public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();
    System.out.println(listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.adionarTarefa("tarefa 1");
    listaTarefa.adionarTarefa("tarefa 1");
    listaTarefa.adionarTarefa("tarefa 2");
    System.out.println(listaTarefa.obterNumeroTotalTarefas());
    
    listaTarefa.removerTarefa("tarefa 1");
    System.out.println(listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.obterDescricaoTotal();
  }
}
