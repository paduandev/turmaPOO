
public abstract class Pessoa /* extends Object */ { // abstract não pode gerar objetos
    private String nome, telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String exibir() {
        return "Nome: " + nome + ": " + telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ": " + telefone;
    }
}