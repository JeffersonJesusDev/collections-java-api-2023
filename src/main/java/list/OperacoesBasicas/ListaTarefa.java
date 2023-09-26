package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;
    //ContrutorClasse:
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    //Adicionando tarefa na lista
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    //Removendo tarefa com a mesma descricao se for repetida
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
          if(t.getDescricao().equalsIgnoreCase(descricao)){
              tarefasParaRemover.add(t);
          }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    //Obetendo o número da quantidade de elementos:
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    //Realizando a impressão da lista de tarefas:
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

         listaTarefa.adicionarTarefa("Tarefa 1");
         listaTarefa.adicionarTarefa("Tarefa 1");
         listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());


        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
