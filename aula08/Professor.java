public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, String telefone, double salario) {
        super(nome, telefone);
        this.salario = salario;
    }

    public String exibir() {
        return super.exibir() + ": " + salario;
    }

    @Override
    public String toString() {
        return super.toString() + " R$ " + salario;
    }

    public double getSalario(){
        return salario;
    }
}
