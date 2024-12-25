package com.tiagovieira.exemplosDeUso;


import java.util.Optional;

public class OptionalExemplo {

    public static void main(String[] args) {
        // Criando um Optional com um valor presente
        Optional<String> nomeOptional = Optional.of("João");

        // Verificando se o valor está presente
        if (nomeOptional.isPresent()) {
            System.out.println("Valor presente: " + nomeOptional.get());
        } else {
            System.out.println("Nenhum valor presente.");
        }

        // Criando um Optional vazio
        Optional<String> vazioOptional = Optional.empty();

        // Usando orElse para fornecer um valor padrão
        String nomeOuPadrao = vazioOptional.orElse("Valor padrão");
        System.out.println("Resultado com valor padrão: " + nomeOuPadrao);

        // Usando orElseThrow para lançar uma exceção se o valor não estiver presente
        try {
            String nome = vazioOptional.orElseThrow(() -> new IllegalArgumentException("Valor não encontrado!"));
            System.out.println("Nome encontrado: " + nome);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}




