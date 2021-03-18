package exercicios.exercio01;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo vel = new Veiculo();

        vel.marca = "Chevrolet";
        vel.modelo = "Cruze";
        vel.consumo = 7.4;

        vel.exibir();
        System.out.println("Consumo = "+vel.obterConsumo());
    }
}
