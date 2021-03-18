package exemplos.exemplo01;

public class Pessoa {
    // atributos - características
    String nome;
    String telefone;

    // métodos - ações
    void apresentar() {
        System.out.println("Olá! Eu sou " + nome);
    }

    String obterTelefone() {
        return telefone;
    }

}