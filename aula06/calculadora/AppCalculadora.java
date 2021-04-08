package calculadora;

public class AppCalculadora {
    public static void main(String[] args) {
        Calculadora calc  = new Calculadora();

        double s = calc.somar(10, 5.4);
        System.out.println(s);

        System.out.println(calc.exibir());
    }
}
