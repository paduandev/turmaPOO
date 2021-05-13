import java.util.ArrayList;

public class GerenciaFuncionario {
    private ArrayList<Funcionario> listaFunc;

    public GerenciaFuncionario() {
        listaFunc = new ArrayList<>();
    }

    public void novoMotorista(String nome, double salario, String carta) {
        listaFunc.add( new Motorista(nome, salario, carta));
    }

    public void novoGerente(String nome, double salario, int numFuncionarios) {
        listaFunc.add( new Gerente(nome, salario, numFuncionarios));
    }

    public void novoEstoquista(String nome, double salario, int horas) {
        listaFunc.add( new Estoquista(nome, salario, horas));
    }

    public String listar() {
        String saida = "";

        for (Funcionario funcionario : listaFunc) {
            saida += funcionario.getDados() + "\n";
        }

        return saida;
    }

    public String buscarNome(String nome) {
        for (Funcionario funcionario : listaFunc) {
            if(funcionario.getNome().equals(nome)) {
                return funcionario.getDados();
            }
        }
        return "Não encontrado.";
    }

}
