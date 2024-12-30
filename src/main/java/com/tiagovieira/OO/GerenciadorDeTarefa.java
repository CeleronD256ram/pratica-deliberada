package com.tiagovieira.OO;

import java.util.List;
import java.util.Scanner;

public class GerenciadorDeTarefa {

    Tarefa tarefa;
    List<Tarefa> listaDeTarefas;

    // adicionar tarefa
    public void addtarefa(Tarefa tarefa) {
        listaDeTarefas.add(tarefa);
        listarTarefas();

    }





    // listar tarefas na lista
    public void listarTarefas() {
        for (Tarefa listaDeTarefa : listaDeTarefas) {
            System.out.println(listaDeTarefa);

        }

    }






}
