package edu.Collections.Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> listToDo;

    public ListaTarefas() {
        this.listToDo = new HashSet<>();
    }
    public void addToDo(String description){
        listToDo.add(new Tarefa(description));
    }
    public void removeToDo(String description){
        Tarefa toDoListRemove =null;
        if (!listToDo.isEmpty()){
            for (Tarefa t:listToDo){
                if (t.getDescricao()==description){
                    toDoListRemove=t;
                    break;
                }
            }
            listToDo.remove(toDoListRemove);
        }
        else {
            throw new RuntimeException("Lista Vazia!");
        }

    }
    public void showToDos(){
        if (!listToDo.isEmpty()){
            System.out.println(listToDo);
        }
        else {
            throw new RuntimeException("Nada para exibir, Lista vazia!!");
        }

    }
    public int countToDos(){
        return listToDo.size();
    }
    public Set<Tarefa> getToDoCheck(){
    Set<Tarefa> toDoChecks = new HashSet<>();
    if (!listToDo.isEmpty()){
        for (Tarefa t:listToDo){
            if (t.isFeita()==true){
                toDoChecks.add(t);
            }
        }
        return toDoChecks;
    }
    else {
        throw new RuntimeException("Lista vazia!");
    }
    }
    public Set<Tarefa> getToDoNotCheck(){
        Set<Tarefa> toDoNotChecks =new HashSet<>();
        if (!listToDo.isEmpty()){
            for (Tarefa t:listToDo){
                if (t.isFeita()==false){
                    toDoNotChecks.add(t);
                }
            }
            return toDoNotChecks;
        }
        else {
            throw new RuntimeException("Lista vazia!");
        }
    }
    public Set<Tarefa> checkToDo(String description){
        Set<Tarefa>  toDoCheck = new HashSet<>();
        for (Tarefa t:listToDo){
            if (t.getDescricao().equalsIgnoreCase(description)){
                t.setFeita(true);
                toDoCheck.add(t);
                break;
            }
        }
        return toDoCheck;
    }
    public Set<Tarefa> NotCheckToDo(String description){
        Set<Tarefa>  notToDoCheck = new HashSet<>();
        for (Tarefa t:listToDo){
            if (t.getDescricao().equalsIgnoreCase(description)){
                t.setFeita(false);
                notToDoCheck.add(t);
                break;
            }
        }
        return notToDoCheck;
    }
    public void removeAllToDo(){
        Set<Tarefa> toDoRemove=new HashSet<>(listToDo);
        listToDo.removeAll(toDoRemove);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.addToDo("fazer asaasdasdas");
        listaTarefas.addToDo("fazer coisas");
        listaTarefas.addToDo("ler livro");
        listaTarefas.addToDo("fazer lição de casa");
        System.out.println(listaTarefas.countToDos());
        listaTarefas.showToDos();
        //listaTarefas.removeAllToDo();
        System.out.println("Quantidade de tarefas: "+listaTarefas.countToDos());
        listaTarefas.checkToDo("ler livro");
        System.out.println("Lista de tarefa concluida: "+listaTarefas.getToDoCheck());
        System.out.println("Lista de tarefa não concluida: "+listaTarefas.getToDoNotCheck());
        //listaTarefas.showToDos();
        listaTarefas.NotCheckToDo("ler livro");
        System.out.println("Lista de tarefa concluida: "+listaTarefas.getToDoCheck());
        listaTarefas.showToDos();
        listaTarefas.removeToDo("fazer coisas");
        listaTarefas.showToDos();



    }
}
