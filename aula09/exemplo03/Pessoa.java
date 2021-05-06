public class Pessoa {
    private String nome; // null
    private int idade;
    private Endereco endereco;

    public Pessoa() {
        nome = "-";
        endereco = new Endereco();
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        endereco = new Endereco("Sem endereço", 0);
    }

    public Pessoa(String nome, int idade, String nomeRua, int numero) {
        this.nome = nome;
        this.idade = idade;
        endereco = new Endereco(nomeRua, numero);
    }

    public String exibir() {
        return nome + " (" + idade + ") " + ": " + endereco.exibir();
    }

}
