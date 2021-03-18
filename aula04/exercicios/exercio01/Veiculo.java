package exercicios.exercio01;

public class Veiculo {
    String marca, modelo;
    double consumo;

    void exibir() {
        System.out.println("Marca: " + marca + " modelo: " + modelo);
    }

    double obterConsumo() {
        return consumo;
    }

}
