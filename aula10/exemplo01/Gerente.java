public class Gerente extends Funcionario {
    private int numFuncionarios;
 
    public Gerente(String nome, double salario, int numFuncionarios) {
        super(nome, salario);
        this.numFuncionarios = numFuncionarios;
    }

    public Gerente(String nome) {
        super(nome, 0);
    }

    @Override
    public String getDados() {
        return "Gerente: " + getNome() + " - " + getSalario()  + " - " + numFuncionarios;
    }

    @Override
    public void aumentaSalario(double taxa) {
        super.aumentaSalario(taxa + 5);
    }
}
