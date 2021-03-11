package exercicios;

public class Exercicio02 {
    public static void main(String[] args) {
        linha("Boa noite! Como vai?", '-');
    }

    static void linha(String texto, char tipo) {
        System.out.println(texto);
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(tipo);
        }
        System.out.println();
    }
}
