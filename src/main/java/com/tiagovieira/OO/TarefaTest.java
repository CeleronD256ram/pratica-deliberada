package com.tiagovieira.OO;

import java.time.LocalDateTime;

public class TarefaTest {
    public static void main(String[] args) {

        Tarefa tarefa1 = new Tarefa("Teste", LocalDateTime.now());


        GerenciadorDeTarefa gerenciadorDeTarefa = new GerenciadorDeTarefa();
        gerenciadorDeTarefa.addtarefa(tarefa1);



    }
}
