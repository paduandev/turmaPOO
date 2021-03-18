package exemplos.exemplo01;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa(); // instanciar um objeto Pessoa
        Pessoa p2 = new Pessoa();
        String telefone; //variável local

        p.nome = "Emerson";
        p.telefone = "123456789";
        p.apresentar();
        telefone = p.obterTelefone();
        System.out.println(telefone);

        p2.nome = "Amanda";
        p2.telefone = "987654321";
        p2.apresentar();
        System.out.println(p2.obterTelefone());
    }
}
