import java.util.Scanner;

public class AppVeiculo {
    public static void main(String[] args) {
        GerenciaVeiculo veiculos = new GerenciaVeiculo();
        Scanner teclado = new Scanner(System.in);
        int opcao;
        String modelo, marca, placa;
        int anoFabricacao;
        double valorMercado;
        String combustivel;
        Veiculo veiculo;

        do {
            System.out.println("1-novo veiculo");
            System.out.println("2-remover veiculo");
            System.out.println("3-listar veiculos");
            System.out.println("4-buscar veiculo pela placa");
            System.out.println("5-calcular imnposto");
            System.out.println("6-listar por tipo de combustivel");
            System.out.println("7-sair");
            opcao = Integer.parseInt(teclado.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Modelo");
                    modelo = teclado.nextLine();
                    System.out.println("Marca");
                    marca = teclado.nextLine();
                    System.out.println("Placa");
                    placa = teclado.nextLine();
                    System.out.println("Ano");
                    anoFabricacao = Integer.parseInt(teclado.nextLine());
                    System.out.println("Valor de Mercado");
                    valorMercado = Double.parseDouble(teclado.nextLine());
                    System.out.println("Combustivel");
                    combustivel = teclado.nextLine();
                    veiculo = new Veiculo(modelo, marca, placa, anoFabricacao, valorMercado, combustivel);
                    veiculos.adicionar(veiculo);
                    break;

                case 2:
                    System.out.println("placa");
                    placa = teclado.nextLine();
                    if (veiculos.remover(placa)) {
                        System.out.println("removido com sucesso.");
                    } else {
                        System.out.println("Erro. Placa não encontrada.");
                    }
                    break;

                case 3:
                    System.out.println(veiculos.listarVeiculos());
                    break;

                case 4:
                    System.out.println("placa");
                    placa = teclado.nextLine();
                    veiculo = veiculos.buscarPorPlaca(placa);
                    if (veiculo != null) {
                        System.out.println(veiculo.imprimir());
                    } else {
                        System.out.println("Erro. Placa não encontrada.");
                    }
                    break;

                case 5:
                    System.out.println("placa");
                    placa = teclado.nextLine();
                    double valor = veiculos.obterValorImposto(placa);
                    if (valor != -1) {
                        System.out.println("Imposto devido:" + valor);
                    } else {
                        System.out.println("Erro. Placa não encontrada.");
                    }
                    break;

                case 6:
                    System.out.println("Combustivel");
                    combustivel = teclado.nextLine();
                    System.out.println(veiculos.listarVeiculoPorCombustivel(combustivel));
                    break;

                case 7:
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 7);

        teclado.close();
    }

}
