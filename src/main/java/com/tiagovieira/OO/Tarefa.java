package com.tiagovieira.OO;

import java.time.LocalDateTime;

public class Tarefa {

    private String nome;
    private LocalDateTime dia;
    private boolean concluido;

    public Tarefa(String nome, LocalDateTime dia) {
        this.nome = nome;
        this.dia = LocalDateTime.now();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDia() {
        return dia;
    }

    public void setDia(LocalDateTime dia) {
        this.dia = dia;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "nome='" + nome + '\'' +
                ", dia=" + dia +
                ", concluido=" + concluido +
                '}';
    }
}
