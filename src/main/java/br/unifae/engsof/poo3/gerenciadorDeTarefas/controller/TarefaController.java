/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unifae.engsof.poo3.gerenciadorDeTarefas.controller;

import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.GerenciaTarefas;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.TarefaSimples;
import java.time.LocalDate;

/**
 *
 * @author cimam
 */
public class TarefaController {
    
    /**
     * Tenta cadastrar os dados
     * 
     * @param desc:descrição da tarefa
     * @param prior: 1 a 5
     * @param data: data de criação da tarefa
     * @return : true se pode cadastrar e false, 
     * caso contrario
     */
    public boolean addTarefaSimples(String desc,
            int prior, LocalDate data){
        
        //Criar a tarefa
       return GerenciaTarefas.cadastrar(
               new TarefaSimples(desc, prior,data)); 
        
    } 
    
}
