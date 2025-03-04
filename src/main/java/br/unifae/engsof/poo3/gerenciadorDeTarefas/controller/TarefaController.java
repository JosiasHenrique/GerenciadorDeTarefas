package br.unifae.engsof.poo3.gerenciadorDeTarefas.controller;

import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.GerenciaTarefas;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.Tarefa;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.TarefaComPrazo;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.TarefaSimples;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
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

    public boolean addTarefaComPrazo(TarefaComPrazo tarefaComPrazo) {
        if (tarefaComPrazo != null) {
            if (!(GerenciaTarefas.getInstance().contains(tarefaComPrazo))) {
                return GerenciaTarefas.getInstance().add(tarefaComPrazo);
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

        for (int i = 0; i < GerenciaTarefas.getInstance().size(); i++) {
            Tarefa tarefa = GerenciaTarefas.getInstance().get(i);

            jTabela.setValueAt(tarefa.getDescricao(), posicaoLinha, 0);
            jTabela.setValueAt(tarefa.isConcluida()? "Sim" : "Não", posicaoLinha, 1);
            jTabela.setValueAt(tarefa.getPrioridade(), posicaoLinha, 2);
            jTabela.setValueAt(tarefa.getDataCriacao(), posicaoLinha, 3);
            
            if(tarefa instanceof TarefaComPrazo) {
                jTabela.setValueAt(((TarefaComPrazo) tarefa).getPrazo(), posicaoLinha, 4);
            } else {
                jTabela.setValueAt("Indeterminado", posicaoLinha, 4);
            }

            posicaoLinha += 1;
        }
    }
    
    public void excluirTarefa(JTable jTabela) {
        
        if(jTabela.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma tarefa!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir essa tarefa?", "Aviso", JOptionPane.YES_NO_OPTION);
            
            if(resposta == JOptionPane.YES_OPTION) {
                GerenciaTarefas.getInstance().remove(jTabela.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Tarefa excluída com sucesso!", "Aviso",JOptionPane.INFORMATION_MESSAGE);
                listagemTarefas(jTabela);
            }
        }
    }
}
