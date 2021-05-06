public class Metodos {
    private int x;
    private static int comum = 0;

    // método que não precisa, não pertence a um objeto em particular
    public static int soma(int a, int b) {
        return a + b;
    }

    public int getX() {
        return x;
    }

    public static void setComum(int valor) {
        comum = valor;
    }

    public static int getComum() {
        return comum;
    }

}
