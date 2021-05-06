public class Endereco {
    private String nome;
    private int numero;
 
    public Endereco() {
        nome = "Sem endereo cadastrado";
    }

    public Endereco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }


    public String exibir() {
        return nome + ", " + numero;
    }
}
