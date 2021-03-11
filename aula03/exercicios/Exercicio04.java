package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b;

        System.out.println("Informe os dois valores: ");
        a = entrada.nextInt();
        b = entrada.nextInt();

        System.out.println("O maior valor é: " + encontrarMax(a, b));

        entrada.close();
    }

    static int encontrarMax(int n1, int n2) {
        if(n1 > n2){
            return n1; // return termina a execução do método
        }
        return n2;
    }
}
