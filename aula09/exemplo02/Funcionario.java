public class Funcionario {
    private String nome;
    private double salario;

    // sobregarga de métodos =  Overload
    // "mesmo" método com mais de uma assinatura
    // Overload = mesma classe

    public Funcionario() {}

    public Funcionario(String nome) {}

    public void calcularSalario(){}

    public String getNome(){
        return nome;
    }

}
