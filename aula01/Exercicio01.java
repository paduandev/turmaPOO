import java.util.Scanner;

/**
 * Atalhos
 * 
 * class
 * main
 * syso
 * 
 */

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double custoDeFabrica, imposto, valorDistribuidor, valorDeVenda;

        System.out.println("Digite o custo de fábrica:");
        custoDeFabrica = teclado.nextDouble();

        valorDistribuidor = custoDeFabrica * 0.28;
        imposto = custoDeFabrica * 0.45;
        valorDeVenda = custoDeFabrica + valorDistribuidor + imposto;

        System.out.println("Valor final d evenda: " + valorDeVenda);
        System.out.println("Impostos: " + imposto);
        
        teclado.close();
    }
}