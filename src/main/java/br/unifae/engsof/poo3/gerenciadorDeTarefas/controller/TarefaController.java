package br.unifae.engsof.poo3.gerenciadorDeTarefas.controller;

import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.GerenciaTarefas;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.TarefaSimples;

public class TarefaController {

    public boolean addTarefaSimples(TarefaSimples tarefaSimples) {

        if (tarefaSimples != null) {
            if (!(GerenciaTarefas.getInstance().contains(tarefaSimples))) {
                return GerenciaTarefas.getInstance().add(tarefaSimples);
            }
        }
        return false;
    }
}
