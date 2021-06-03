package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro:");
        try {
            numero = Integer.parseInt(entrada.nextLine());
            System.out.println("Você digitou: " + numero);
        } catch (InputMismatchException ex) {
            System.out.println("Entrada de dados inválida.");
        } catch (NumberFormatException ex) {
            System.out.println("Erro de digitação");
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        } finally {
            System.out.println("Fechando as conexões...");
            entrada.close();
        }

        System.out.println("Final do programa.");

        
    }
}
