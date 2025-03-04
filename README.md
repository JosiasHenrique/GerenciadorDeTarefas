# Gerenciamento de Tarefas - POO

## Sobre o Projeto

Este projeto foi desenvolvido para a disciplina de **Programação Orientada a Objetos (POO)** como parte de um trabalho prático. O objetivo foi criar um sistema simples para gerenciar tarefas utilizando **Java POO, MVC, Swing**.

### Funcionalidades

- **Adicionar Tarefa:** Permite a criação de uma tarefa com descrição e prazo.
- **Listar Tarefas:** Exibe todas as tarefas cadastradas.
- **Remover Tarefa:** Permite a exclusão de uma tarefa selecionada.

### Alterações Realizadas

1. **Refatoração da Classe `GerenciaTarefas`:**

   - Antes: A classe continha métodos para adicionar, listar tarefas.
   - Depois: Foi transformada em uma classe Singleton, e as funções foram movidas para o **Controller**, mantendo a responsabilidade única.

2. **Alteração do Método `equals` da Classe `Tarefa`:**

   - Problema: O método `equals` estava causando uma recursão infinita ao chamar a si mesmo, o que resultava em erros durante a manipulação dos objetos da classe `Tarefa`.
   - Solução: O método foi reescrito para corrigir a lógica e evitar a recursão infinita.

## Estrutura do Projeto

- **Controller:** Contém a lógica de controle e manipulação de dados.
- **Model:** Representa as entidades principais.
- **View:** Interface gráfica desenvolvida com Java Swing.

Desenvolvido para a disciplina de **POO** no curso de **Engenharia de Software** da **UNIFAE - SJBV**.

