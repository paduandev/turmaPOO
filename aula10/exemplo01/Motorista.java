public class Motorista extends Funcionario {
    private String carta;

    public Motorista(String nome, double salario, String carta)   {
        super(nome, salario);
        this.carta = carta;
    }

    @Override
    public String getDados() {
        return "Motorista: " + getNome() + " - " + getSalario()  + " - " + carta;
    }
    
}
