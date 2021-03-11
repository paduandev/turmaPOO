package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int retorno;

        retorno = soma(5, 19);

        System.out.println("Soma = " + retorno);
    }

    static int soma(int a, int b) {
        int resultado; //variável local

        resultado = a + b;

        return resultado;
    }

}
