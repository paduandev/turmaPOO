package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        String frase = null;// = "Boa noite";

        // System.out.println(letra1(frase, 2));
        
        System.out.println(letra2(frase, 2));

        try {
            System.out.println(letra3(frase, 2));
        } catch (Exception e) {
            System.out.println("Erro....");
        }

    }

    //não faz o tratamento e se ocorrer alguma excetion propaga para quem chamou método
    private static char letra1(String frase, int posicao)  {
        return frase.charAt(posicao);
    }

    // faz o tratamento dentro do método
    private static char letra2(String frase, int posicao)  {
        try {
            return frase.charAt(posicao);
        } catch (Exception e) {
            System.out.println("Erro dentro do método");
            return '@';
            // throw new Exception(e);
        } finally {
            System.out.println("Fechando conexões");
        }
    }

    // quem chamar o método deve fazer o tratamento, ou o código não compila
    private static char letra3(String frase, int posicao) throws Exception {
        if(frase == null) {
            throw new Exception();
        }
        return frase.charAt(posicao);
    }

}
