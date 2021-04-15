package exemplos;

public class Aluno {
    private String nome;
    private String telefone;

    public Aluno(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String toString() {
        return nome + " : " + telefone;
    }
}