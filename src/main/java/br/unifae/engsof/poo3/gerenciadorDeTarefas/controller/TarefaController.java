package br.unifae.engsof.poo3.gerenciadorDeTarefas.controller;

import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.GerenciaTarefas;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.Tarefa;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.TarefaComPrazo;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.TarefaSimples;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TarefaController {

    public boolean addTarefaSimples(TarefaSimples tarefaSimples) {
        if (tarefaSimples != null) {
            if (!(GerenciaTarefas.getInstance().contains(tarefaSimples))) {
                return GerenciaTarefas.getInstance().add(tarefaSimples);
            }
        }
        return false;
    }
    
   public void listagemTarefas(JTable jTabela) {
       
       //Obtém o modelo de dados da tabela para manipular as linhas e colunas
       DefaultTableModel dtm = (DefaultTableModel) jTabela.getModel();
       
       //Ajusta o número de linhas da tabela ao tamanho da lista
       dtm.setRowCount(GerenciaTarefas.getInstance().size());
       jTabela.setModel(dtm);
       
       int posicaoLinha = 0;
       
       for(int i = 0; i < GerenciaTarefas.getInstance().size(); i++) {
           Tarefa tarefa = GerenciaTarefas.getInstance().get(i);
           
           jTabela.setValueAt(tarefa.getDescricao(), posicaoLinha, 0);
           jTabela.setValueAt("---", posicaoLinha, 1);
           jTabela.setValueAt(tarefa.getPrioridade(), posicaoLinha, 2);
           jTabela.setValueAt(tarefa.getDataCriacao(), posicaoLinha, 3);
           
           posicaoLinha += 1;
       }
   }
}
