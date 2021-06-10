package exemplo02;

public class Calcula 
{
    private static int valor; // da classe

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int soma(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void setValor(int valor) {
        Calcula.valor = valor;
    }

    public static int getValor() {
        return valor;
    }

    
    @Override // sobrescrever
    public String toString() {
        return "valor: " + valor;
    }
}
