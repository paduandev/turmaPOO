import java.util.ArrayList;

public class GerenciaVeiculo {
    private ArrayList<Veiculo> veiculos;

    public GerenciaVeiculo(){
        veiculos = new ArrayList<>();
    }

    public void adicionar (Veiculo v) {
        veiculos.add(v);
    }

    public boolean remover (String placa) {
        for (Veiculo veiculo : veiculos) {
            if(veiculo.getPlaca().equals(placa)) {
                veiculos.remove(veiculo);
                return true;
            }
        }
        return false;
    }

    public String listarVeiculos() {
        String saida = "";
        for (Veiculo veiculo : veiculos) {
            saida += veiculo.imprimir() + "\n";
        }
        return saida;
    }

    public Veiculo buscarPorPlaca (String placa) {
        for (Veiculo veiculo : veiculos) {
            if(veiculo.getPlaca().equals(placa)) {
                return(veiculo);
            }
        }
        return null;
    }

    public double obterValorImposto(String placa) {
        for (Veiculo veiculo : veiculos) {
            if(veiculo.getPlaca().equals(placa)) {
                return(veiculo.calcularImposto());
            }
        }
        return -1;
    }

    public String listarVeiculoPorCombustivel(String combustivel) {
        String saida = "Veiculos:\n";
        for (Veiculo veiculo : veiculos) {
            if(veiculo.getCombustivel().equals(combustivel)) {
                 saida += veiculo.imprimir() + "\n";
            }
        }
        return saida;
    }
}
