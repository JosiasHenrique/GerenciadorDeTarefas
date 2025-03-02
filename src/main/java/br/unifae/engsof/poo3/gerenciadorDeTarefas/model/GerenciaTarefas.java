package br.unifae.engsof.poo3.gerenciadorDeTarefas.model;

import java.util.ArrayList;
import java.util.List;

public class GerenciaTarefas {

    //Padrão Singleton
    
    private static List<Tarefa> tarefas;

    //construtor privado para impedir novas instâncias.
    private GerenciaTarefas() {}

    //Acesso publico
    public static List<Tarefa> getInstance() {
        if (tarefas == null) {
            tarefas = new ArrayList<Tarefa>();
        }
        return tarefas;
    }

}
