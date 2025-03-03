package br.unifae.engsof.poo3.gerenciadorDeTarefas.model;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Tarefa extends Object {

    private String descricao;// descrição da tarefa
    private boolean concluida; //indica se a tarefa foi concluída
    private int prioridade; //nível de prioridade da tarefa (1 a 5)
    private LocalDate dataCriacao;

    //construtor util para realizar consultas
    public Tarefa() {
    }

    //sobrecarregando com dados obrigatórios
    public Tarefa(String descricao, int prioridade, LocalDate dataCriacao) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.dataCriacao = dataCriacao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "Tarefa:" + "descricao=" + descricao + ", concluida=" + concluida + ", prioridade=" + prioridade + ", dataCriacao=" + dataCriacao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        // 1 - Verifica se os objetos têm o mesmo endereço
        if (this == obj) {
            return true;
        }

        // 2 - Verifica se o objeto é do mesmo tipo
        if (!(obj instanceof Tarefa)) {
            return false;
        }

        // 3 - Faz o cast e compara os atributos
        Tarefa outra = (Tarefa) obj;

        return this.descricao.equals(outra.descricao)
                && this.prioridade == outra.prioridade
                && this.concluida == outra.concluida
                && this.dataCriacao.equals(outra.dataCriacao);
    }

}
