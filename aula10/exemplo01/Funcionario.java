
public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract String getDados(); // abstract torna o método obrigatório em todas extends

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentaSalario(double taxa) {
        salario = salario + salario * taxa / 100;
    }

}