package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean valida = false;

        do {
            System.out.println("Digite um número inteiro:");
            try {
                numero = entrada.nextInt(); 
                System.out.println("Você digitou: " + numero);
                valida = true;
            } catch (InputMismatchException ex) {
                System.out.println("Entrada de dados inválida.");
                entrada.nextLine(); // limpar o buffer de teclado
            }
        } while (!valida);

        System.out.println("Final do programa.");

        entrada.close();
    }

}