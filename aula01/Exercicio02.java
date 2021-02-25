import java.util.Scanner;

/**
 * Exercicio02
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double massaInicial, massaFinal;
        int tempo;

        System.out.println("Digite a massa inicial:");
        massaInicial = entrada.nextDouble();

        massaFinal = massaInicial; // inicialização
        tempo = 0;
        while(massaFinal >= 0.5) { // condição
            massaFinal /= 2; // passo
            tempo += 50;
        }

        System.out.println("Massa inicial: " + massaInicial);
        System.out.println("Massa final: " + massaFinal);
        System.out.println("Tempo gasto: " + tempo);

        entrada.close();
    }
}