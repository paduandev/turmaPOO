public class Estoquista extends Funcionario{
    private int horas;

    public Estoquista(String nome, double salario, int horas) {
        super(nome, salario);
        this.horas = horas;
    }

    @Override
    public String getDados() {
        return "Estoquista: "  + getNome() + " - " + getSalario()  + " - " + horas;
    }
}
